package org.usfirst.frc.team3609.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

public class Conveyer_motor {

	static WPI_TalonSRX conveyerMotor = new WPI_TalonSRX(15);

	public static void shoot() {
		conveyerMotor.set(1);
	}

	public static void steal() {
		conveyerMotor.set(-1);
	}

	public static void stop() {
		conveyerMotor.set(0);
	}

}

// Changed to static because it wouldn't let me call in another command line
// if needed to change back, take static away from line 7