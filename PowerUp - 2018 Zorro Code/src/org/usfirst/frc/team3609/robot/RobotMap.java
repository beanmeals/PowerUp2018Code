/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team3609.robot;

import edu.wpi.first.wpilibj.SpeedControllerGroup;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

public class RobotMap {

	public static WPI_TalonSRX leftMaster = new WPI_TalonSRX(10);
	public static WPI_TalonSRX leftFollower = new WPI_TalonSRX(11);
	public static WPI_TalonSRX rightMaster = new WPI_TalonSRX(12);
	public static WPI_TalonSRX rightFollower = new WPI_TalonSRX(13);

	public static SpeedControllerGroup m_Left = new SpeedControllerGroup(
			leftMaster, leftFollower);
	public static SpeedControllerGroup m_Right = new SpeedControllerGroup(
			rightMaster, rightFollower);
	
	
	leftFollower.follow(leftMaster);

}
