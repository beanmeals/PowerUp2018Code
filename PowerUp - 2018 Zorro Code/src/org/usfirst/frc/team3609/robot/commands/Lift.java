package org.usfirst.frc.team3609.robot.commands;

import edu.wpi.first.wpilibj.command.Command;

import org.usfirst.frc.team3609.robot.OI;
import org.usfirst.frc.team3609.robot.subsystems.Climber_motor;
import org.usfirst.frc.team3609.robot.subsystems.lifter;
/**
 *
 */
public class Lift extends Command {

    public Lift() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	
    }

    // Called repeatedly when this Command is scheduled to run
	protected void execute() {
		if (OI.DriverController.OperatorController.liftActivator()) {
			lifter.lift();
		} else {
			lifter.down();
		}
	}

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
