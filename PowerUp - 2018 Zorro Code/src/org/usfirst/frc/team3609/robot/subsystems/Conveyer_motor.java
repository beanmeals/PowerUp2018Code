package org.usfirst.frc.team3609.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.TalonSRX;

public class Conveyer_motor {

	TalonSRX conveyerMotor = new TalonSRX(15);

	public void open() {
		conveyerMotor.set(null, 1);
	}

	public void close() {
		conveyerMotor.set(null, -1);
	}

	public void stop() {
		conveyerMotor.set(null, 0);
	}

}
