package org.usfirst.frc.team3609.robot.commands;

import org.usfirst.frc.team3609.robot.subsystems.Conveyer_motor;

import edu.wpi.first.wpilibj.command.Command;

public class Conveyer_shoot extends Command {

	protected void initialize() {
		Conveyer_motor.shoot();
	}

	protected void end() {
		Conveyer_motor.stop();
	}

	protected void interupted() {
		end();
	}

	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}
}
