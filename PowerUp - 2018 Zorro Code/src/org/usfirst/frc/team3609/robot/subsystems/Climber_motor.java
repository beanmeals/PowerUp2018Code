package org.usfirst.frc.team3609.robot.subsystems;

import org.usfirst.frc.team3609.robot.OI;
import org.usfirst.frc.team3609.robot.commands.ClimbStuff;
import org.usfirst.frc.team3609.robot.commands.TankDrive;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.command.Subsystem;

public class Climber_motor extends Subsystem {

	public static WPI_TalonSRX climberMotor = new WPI_TalonSRX(15);

	@Override
	protected void initDefaultCommand() {
		setDefaultCommand(new ClimbStuff());

	}

	public static void stop() {
		climberMotor.set(0);
	}

	public static void set(double d) {
		climberMotor.set(1);

	}
}
