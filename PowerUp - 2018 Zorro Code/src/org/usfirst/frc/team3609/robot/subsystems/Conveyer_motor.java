package org.usfirst.frc.team3609.robot.subsystems;

import org.usfirst.frc.team3609.robot.OI;
import org.usfirst.frc.team3609.robot.commands.Conveyer_intake;
import org.usfirst.frc.team3609.robot.commands.Cube_intake;
import org.usfirst.frc.team3609.robot.commands.TankDrive;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.command.Subsystem;

public class Conveyer_motor{
	static WPI_TalonSRX conveyerMotor = new WPI_TalonSRX(15);

	public static void intake() {
		conveyerMotor.set(OI.DriverController.conveyerIntake());
		conveyerMotor.set(OI.DriverController.conveyerShoot());
	}

	public static void stop() {
		conveyerMotor.set(0);
	}

	protected void initDefaultCommand() {
		setDefaultCommand(new Conveyer_intake());
	}
	
	private void setDefaultCommand(Conveyer_intake cov_intake) {
		// TODO Auto-generated method stub

	}

}

// Changed to static because it wouldn't let me call in another command line
// if needed to change back, take static away from line 7