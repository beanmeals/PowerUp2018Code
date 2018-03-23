package org.usfirst.frc.team3609.robot.commands;

import org.usfirst.frc.team3609.robot.OI;
import org.usfirst.frc.team3609.robot.subsystems.Climber_motor;

import edu.wpi.first.wpilibj.command.Command;

public class ClimbStuff extends Command {

	protected void initialize() {

	}

	protected void execute() {
		if (OI.DriverController.OperatorController.climberActivator()
				|| OI.DriverController.climberActivator()) {
			Climber_motor.set(1);
		} else {
			Climber_motor.stop();
		}
	}

	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}

	protected void interupted() {
		stop();
	}

	protected void stop() {
		Climber_motor.stop();
	}

}
