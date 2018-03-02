package org.usfirst.frc.team3609.robot.subsystems;

import edu.wpi.first.wpilibj.SpeedControllerGroup;

import org.usfirst.frc.team3609.robot.RobotMap;
import org.usfirst.frc.team3609.robot.commands.TankDrive;

import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

public class Drivebase extends Subsystem {
	public static DifferentialDrive m_Drive;
	public WPI_TalonSRX leftMaster;
	public WPI_TalonSRX leftFollower;
	public WPI_TalonSRX rightMaster;
	public WPI_TalonSRX rightFollower;

	public SpeedControllerGroup m_Left;
	public SpeedControllerGroup m_Right;
	
	public Drivebase() {
		 leftMaster = new WPI_TalonSRX(10);
		 leftFollower = new WPI_TalonSRX(11);
		 rightMaster = new WPI_TalonSRX(12);
		 rightFollower = new WPI_TalonSRX(13);
		 m_Left = new SpeedControllerGroup(leftMaster, leftFollower);
		 m_Right = new SpeedControllerGroup(rightMaster, rightFollower);
		 m_Drive = new DifferentialDrive(m_Left, m_Right);
	}

	@Override
	protected void initDefaultCommand() {
		setDefaultCommand( new TankDrive());

	}

	public void Stop() {
		m_Drive.tankDrive(0, 0);
	}

}
