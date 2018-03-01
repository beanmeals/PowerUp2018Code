package org.usfirst.frc.team3609.robot.subsystems;

import edu.wpi.first.wpilibj.SpeedControllerGroup;
import org.usfirst.frc.team3609.robot.RobotMap;

import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

public class Drivebase extends Subsystem {
	public static DifferentialDrive m_Drive = new DifferentialDrive(
			RobotMap.m_Left, RobotMap.m_Right);

	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub

	}

	public void Stop() {
		m_Drive.tankDrive(0, 0);
	}

}
