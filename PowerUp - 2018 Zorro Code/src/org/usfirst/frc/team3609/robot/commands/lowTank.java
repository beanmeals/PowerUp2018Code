package org.usfirst.frc.team3609.robot.commands;

import org.usfirst.frc.team3609.robot.OI;
import org.usfirst.frc.team3609.robot.Robot;
import edu.wpi.first.wpilibj.command.Command;

public class lowTank extends Command {

	protected void initailize() {

	}

	public void execute() {
		if (OI.DriverController.lowTankDrive()) {
			Robot.drivebase.m_Drive.tankDrive(
					OI.DriverController.getRightYAxis() * .2,
					OI.DriverController.getLeftYAxis() * .2, true);
		} else {
			Robot.drivebase.m_Drive.tankDrive(
					OI.DriverController.getRightYAxis(),
					OI.DriverController.getLeftYAxis(), true);
		}
		if (OI.DriverController.highTankDrive()) {
			Robot.drivebase.m_Drive.tankDrive(
					OI.DriverController.getRightYAxis(),
					OI.DriverController.getLeftYAxis(), true);
		} else {
			Robot.drivebase.m_Drive.tankDrive(
					OI.DriverController.getRightYAxis() * .2,
					OI.DriverController.getLeftYAxis() * .2, true);
		}
	}

	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}

	protected void stop() {
		Robot.drivebase.m_Drive.tankDrive(0, 0, true);
	}

	protected void interupted() {
		stop();
	}
}
