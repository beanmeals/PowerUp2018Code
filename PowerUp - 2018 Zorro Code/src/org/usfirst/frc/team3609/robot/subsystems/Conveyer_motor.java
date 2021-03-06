package org.usfirst.frc.team3609.robot.subsystems;

import org.usfirst.frc.team3609.robot.OI;
import org.usfirst.frc.team3609.robot.commands.Conveyer_intake;
import org.usfirst.frc.team3609.robot.commands.TankDrive;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.command.Subsystem;

public class Conveyer_motor extends Subsystem {

	public static WPI_TalonSRX conveyerMotor = new WPI_TalonSRX(14);

	public static void intake() {
		if (OI.DriverController.conveyerIntake() != 0) {
			conveyerMotor.set(OI.DriverController.conveyerIntake()* -1);
		} else {
			conveyerMotor.set(OI.DriverController.conveyerShoot());
		}
	}

	public static void stop() {
		conveyerMotor.set(0);
	}

	@Override
	protected void initDefaultCommand() {
		setDefaultCommand(new Conveyer_intake());
	}

}

// Changed to static because it wouldn't let me call in another command line
// if needed to change back, take static away from line 7