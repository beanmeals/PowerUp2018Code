package org.usfirst.frc.team3609.robot.subsystems;

import org.usfirst.frc.team3609.robot.OI;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

public class Climber_motor {
	
	static WPI_TalonSRX climberMotor = new WPI_TalonSRX(14);
	
	public static void climb() {
		if (OI.DriverController.OperatorController.climberActivator()) {
			climberMotor.set(.85);
		}
		else {
			stop();
		}
	}
	
	public static void stop() {
		climberMotor.set(0);
	}
}
