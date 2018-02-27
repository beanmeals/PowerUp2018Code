package org.usfirst.frc.team3609.robot.commands;

import org.usfirst.frc.team3609.robot.subsystems.Conveyer_motor;


public class Conveyer_command {
	
	
	protected void initialize() {
		Conveyer_motor.shoot();
	}
}
