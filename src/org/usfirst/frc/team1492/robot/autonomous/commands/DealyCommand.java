package org.usfirst.frc.team1492.robot.autonomous.commands;

import org.usfirst.frc.team1492.robot.autonomous.Command;

import edu.wpi.first.wpilibj.Timer;

public class DealyCommand implements Command {
	
	Timer timer;
	
	double time;
	
	boolean needsToStart;
	boolean complete;

	public DealyCommand(double time) {
		this.time = time;
		
		timer = new Timer();
		
		reset();
	}

	@Override
	public boolean run() {
		if(needsToStart){
			timer.reset();
			timer.start();
			needsToStart = false;
		}
		
		if(complete){
			return true;
		}else{
			if(timer.get() >= time){
				complete = true;
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
