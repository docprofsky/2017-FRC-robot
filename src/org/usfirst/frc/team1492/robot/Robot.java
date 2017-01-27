package org.usfirst.frc.team1492.robot;

import org.usfirst.frc.team1492.robot.Gamepad.Axis;
import org.usfirst.frc.team1492.robot.Gamepad.Button;
import org.usfirst.frc.team1492.robot.Winch.WinchDirections;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.IterativeRobot;


/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Robot extends IterativeRobot {

    DriveBase driveBase;
    
    Gamepad driver;
    Gamepad manipulator;
    
    GearPiston gearPiston;
    
    Winch winch;
	DigitalInput winchKill;
    
    boolean shiftButtonPressed = false;
    boolean driveHighGear = true;
    
    boolean gearPistonButtonPressed = false;
    boolean gearPistonActivated = false;
        
	/**
	 * This function is run when the robot is first started up and should be
	 * used for any initialization code.
	 */
	@Override
	public void robotInit() {
	    driveBase = new DriveBase(0, 1, 2, 3, 0);
	    driveBase.shiftHighGear(true);
	    
	    //I do not know the channel for gear piston
	    gearPiston = new GearPiston(0);
	    
	    //I do not know the channel for limit switch
	    winch = new Winch(4);
	    winchKill = new DigitalInput(0);

	    driver = new Gamepad(0);
	}

	/**
	 * This function is called once at the beginning of autonomous.
	 */
	@Override
	public void autonomousInit() {
	}

	/**
	 * This function is called periodically during autonomous
	 */
	@Override
	public void autonomousPeriodic() {
	}

	/**
	 * This function is called periodically during operator control
	 */
	@Override
	public void teleopPeriodic() {
		
	    driveBase.drive(driver.getAxis(Axis.LEFT_Y), driver.getAxis(Axis.RIGHT_Y));
	    
	    boolean shiftButton = driver.getButton(Button.A);
	    if (shiftButton != shiftButtonPressed) {
            shiftButtonPressed = shiftButton;
            if (shiftButton) {
                driveHighGear = !driveHighGear;
                driveBase.shiftHighGear(driveHighGear);
            }
        }
	    
	    boolean winchButtonOut = driver.getButton(Button.B);
	    boolean winchButtonIn = driver.getButton(Button.X);
	    if (winchButtonOut) {
	        winch.moveWinch(WinchDirections.UP);
	    } else if (winchButtonIn) {
	    	winch.moveWinch(WinchDirections.DOWN);
	    } else {
	    	winch.moveWinch(WinchDirections.STOP);
	    }
	
	    boolean gearPistonButton = driver.getButton(Button.Y);
        if (gearPistonButton != gearPistonButtonPressed) {
        	gearPistonButtonPressed = gearPistonButton;
            if (gearPistonButton) {
                gearPistonActivated = !gearPistonActivated;
                GearPiston.latchGear(gearPistonActivated);
            }
        }
        
        if (winchKill.get()) {
			winch.moveWinch(WinchDirections.STOP);
		}
	}
	
	/**
	 * This function is called periodically during test mode
	 */
	@Override
	public void testPeriodic() {
	}
}

