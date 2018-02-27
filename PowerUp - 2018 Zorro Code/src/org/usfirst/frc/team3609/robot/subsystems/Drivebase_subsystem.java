package org.usfirst.frc.team3609.robot.subsystems;

import org.usfirst.frc.team3609.robot.RobotMap;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

public class Drivebase_subsystem extends Subsystem {
	public DifferentialDrive MainDrive = new DifferentialDrive(RobotMap.leftFMotor,RobotMap.leftBMotor,RobotMap.rightFMotor,RobotMap.rightBMotor);
	
	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		
	}
	public void TeleopDrive() {
		MainDrive.tankDrive(leftSpeed, rightSpeed, squaredInputs);
		
	}
	
	public void Stop() {
		MainDrive.tankDrive(0, 0);
	}
	

	
}
