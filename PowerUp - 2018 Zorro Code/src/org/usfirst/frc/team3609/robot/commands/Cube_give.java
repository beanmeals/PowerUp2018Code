package org.usfirst.frc.team3609.robot.commands;

import org.usfirst.frc.team3609.robot.subsystems.Cube_intake;

import edu.wpi.first.wpilibj.command.Command;

public class Cube_give extends Command {

	protected void initialize() {
		Cube_intake.give();
	}

	protected void end() {
		Cube_intake.stop();
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
