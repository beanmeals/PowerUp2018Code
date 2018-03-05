package org.usfirst.frc.team3609.robot.commands;

import org.usfirst.frc.team3609.robot.OI;
import org.usfirst.frc.team3609.robot.Robot;
import org.usfirst.frc.team3609.robot.subsystems.Cube_motors;

import edu.wpi.first.wpilibj.command.Command;

public class Cube_intake extends Command {
	
	protected void initialize() {
		Cube_motors.take();
	}
	
	protected void execute() {
		Cube_motors.manual();
	}
	
	protected void stop() {
		Cube_motors.stop();
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
