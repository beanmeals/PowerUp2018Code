package org.usfirst.frc.team3609.robot.commands;

import org.usfirst.frc.team3609.robot.subsystems.Conveyer_motor;

import edu.wpi.first.wpilibj.command.Command;

public class Conveyer_intake extends Command {

	public void initialize() {
		Conveyer_motor.intake();
	}

	public void end() {
		Conveyer_motor.stop();
	}

	public void interupted() {
		end();
	}

	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}

}
