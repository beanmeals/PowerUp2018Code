package org.usfirst.frc.team3609.robot.commands;

import org.usfirst.frc.team3609.robot.OI;
import org.usfirst.frc.team3609.robot.Robot;
import org.usfirst.frc.team3609.robot.subsystems.Drivebase;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

public class TankDrive extends Command {

	public TankDrive() {
		requires(Robot.drivebase);
	}

	protected void initailize() {

	}

	public void execute() {
		//if (!OI.DriverController.lowTankDrive()) {

			
			Robot.drivebase.m_Drive.tankDrive(OI.DriverController.getLeftYAxis() * -1,
					OI.DriverController.getRightYAxis() , true);

		//}
	}

	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}

	protected void interupted() {
		end();
	}

}
