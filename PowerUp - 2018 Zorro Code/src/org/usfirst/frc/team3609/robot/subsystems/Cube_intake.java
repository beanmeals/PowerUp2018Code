package org.usfirst.frc.team3609.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

public class Cube_intake {

	static WPI_TalonSRX intakeMotorL = new WPI_TalonSRX(16);
	static WPI_TalonSRX intakeMotorR = new WPI_TalonSRX(17);

	public static void take() {
		intakeMotorL.set(1);
		intakeMotorR.set(-1);
	}

	public static void give() {
		intakeMotorL.set(-1);
		intakeMotorR.set(1);
	}

	public static void stop() {
		intakeMotorL.set(0);
		intakeMotorR.set(0);
	}
}
