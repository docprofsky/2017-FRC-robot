package org.usfirst.frc.team1492.robot.autonomous.commands;


import org.usfirst.frc.team1492.robot.DriveBase;
import org.usfirst.frc.team1492.robot.autonomous.Command;

import edu.wpi.first.wpilibj.Timer;

public class MoveStraightCommand implements Command {

    private DriveBase driveBase;

    private Timer timer;

    private boolean highGear;
    private double speed;
    private double time;
    private boolean keepHeading;

    private boolean needsToStart;
    private boolean complete;

    private double heading;

    public MoveStraightCommand(DriveBase driveBase, boolean highGear, double speed, double time, boolean keepHeading) {
        this.driveBase = driveBase;

        this.highGear = highGear;
        this.speed = speed;
        this.time = time;
        this.keepHeading = keepHeading;

        timer = new Timer();

        reset();
    }

    @Override
    public boolean run() {
        if (needsToStart) {
            timer.reset();
            timer.start();
            driveBase.useHighGear(highGear);
            heading = keepHeading ? driveBase.courseHeading : driveBase.getGyroAngle();
            needsToStart = false;
        }

        if (complete) {
            return true;
        } else {
            if (timer.get() >= time) {
                driveBase.drive(0);
                timer.stop();
                complete = true;
            } else {
                double angle = heading - driveBase.getGyroAngle();
                System.out.println("Angle: " + angle + "  Heading: " + heading);
                driveBase.drive(speed, speed - angle * 0.03);
            }
            return false;
        }
    }

    @Override
    public void reset() {
        needsToStart = true;
        complete = false;
    }

}
