package org.usfirst.frc.team3609.robot.subsystems;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Drivebase extends Subsystem {
	
	private Talon leftMotorFront;
	private Talon leftMotorBack;
	private Talon rightMotorFront;
	private Talon rightMotorBack;
	
	public Drivebase() {
		leftMotorFront = new Talon(0);
		leftMotorBack = new Talon(1);
		rightMotorFront = new Talon(2);
		rightMotorBack = new Talon(3);
	}
	
	@Override
	protected void initDefaultCommand() {
		
	}

}
