package org.usfirst.frc.team3609.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

public class Climber_motor {
	
	static WPI_TalonSRX climberMotor = new WPI_TalonSRX(14);
	
	public static void climb() {
		climberMotor.set(.8);
	}
	
	public static void fall() {
		climberMotor.set(-.25);
	}
	public static void stop() {
		climberMotor.set(0);
	}
}
