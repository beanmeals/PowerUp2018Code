package org.usfirst.frc.team3609.robot.commands;

import org.usfirst.frc.team3609.robot.OI;
import org.usfirst.frc.team3609.robot.Robot;
import org.usfirst.frc.team3609.robot.subsystems.Drivebase;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

public class TankDrive extends Command {

	public TankDrive() {
		requires(Robot.drivebase);
	}

	protected void initailize() {

	}

	public void execute() {
		Robot.drivebase.m_Drive.tankDrive(OI.DriverController.getRightYAxis(),
				OI.DriverController.getLeftYAxis(), true);
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
