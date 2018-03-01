package org.usfirst.frc.team3609.robot.commands;

import org.usfirst.frc.team3609.robot.subsystems.Cube_intake;

import edu.wpi.first.wpilibj.command.Command;

public class Cube_grab extends Command {
	
	protected void initialize() {
		Cube_intake.take();
	}
	
	protected void stop() {
		Cube_intake.stop();
	}
	
	protected void interupted() {
		stop();
	}
	
	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}

}
