package org.usfirst.frc.team3609.robot.subsystems;

import org.usfirst.frc.team3609.robot.OI;
import org.usfirst.frc.team3609.robot.commands.Cube_intake;
import org.usfirst.frc.team3609.robot.commands.TankDrive;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;


public class Cube_motors {
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
	
	public static void manual() {
		intakeMotorL.set(OI.DriverController.OperatorController.getLeftMotor());
		intakeMotorR.set(OI.DriverController.OperatorController.getRightMotor());
	}
	
	protected void initDefaultCommand() {
		setDefaultCommand( new Cube_intake());

	}

	private void setDefaultCommand(Cube_intake cube_intake) {
		// TODO Auto-generated method stub
		
	}

	public static void stop() {
		intakeMotorL.set(0);
		intakeMotorR.set(0);
	}
}
