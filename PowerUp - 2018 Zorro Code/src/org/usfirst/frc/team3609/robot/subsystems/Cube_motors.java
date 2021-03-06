package org.usfirst.frc.team3609.robot.subsystems;

import org.usfirst.frc.team3609.robot.OI;
import org.usfirst.frc.team3609.robot.commands.Cube_intake;
import org.usfirst.frc.team3609.robot.commands.TankDrive;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.Talon;

public class Cube_motors {
	static Talon intakeMotorL = new Talon(0);
	static Talon intakeMotorR = new Talon(1);

	public static void take() {
		intakeMotorL.set(1);
		intakeMotorR.set(-1);
	}

	public static void give() {
		intakeMotorL.set(-1);
		intakeMotorR.set(1);
	}

	public static void manual() {

		intakeMotorL.set(Math.pow(OI.DriverController.OperatorController.getLeftMotor(), 3) * -0.65);
		intakeMotorR.set(Math.pow(OI.DriverController.OperatorController.getRightMotor(), 3));
	}

	protected void initDefaultCommand() {
		setDefaultCommand(new Cube_intake());

	}

	private void setDefaultCommand(Cube_intake cube_intake) {
		// TODO Auto-generated method stub

	}

	public static void stop() {
		intakeMotorL.set(0);
		intakeMotorR.set(0);
	}
}
