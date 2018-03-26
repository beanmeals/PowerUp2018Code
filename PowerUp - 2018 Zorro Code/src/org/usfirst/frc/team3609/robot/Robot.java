/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team3609.robot;

import org.usfirst.frc.team3609.robot.commands.Cube_intake;
import org.usfirst.frc.team3609.robot.commands.Lift;
import org.usfirst.frc.team3609.robot.commands.ClimbStuff;
import org.usfirst.frc.team3609.robot.commands.Conveyer_intake;
import org.usfirst.frc.team3609.robot.commands.TankDrive;
import org.usfirst.frc.team3609.robot.commands.lowTank;
import org.usfirst.frc.team3609.robot.subsystems.Drivebase;

import edu.wpi.cscore.UsbCamera;
import edu.wpi.first.wpilibj.CameraServer;
import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class Robot extends IterativeRobot {
	public static OI oi;
	public static final Drivebase drivebase = new Drivebase();
	public static final int TICK_DURATION = 20;
	private int time = 0;
	Command m_autonomousCommand;
	SendableChooser<Command> m_chooser = new SendableChooser<>();
	TankDrive iTank = new TankDrive();
	Cube_intake iCube = new Cube_intake();
	ClimbStuff iClimb = new ClimbStuff();
	Conveyer_intake iConveyer = new Conveyer_intake();
	lowTank ilowTank = new lowTank();
	Lift iLift = new Lift();

	/**
	 * This function is run when the robot is first started up and should be
	 * used for any initialization code.
	 */
	@Override
	public void robotInit() {
		oi = new OI();

		// m_chooser.addDefault("Default Auto", new TankDrive());
		// chooser.addObject("My Auto", new MyAutoCommand());
		SmartDashboard.putData("Auto mode", m_chooser);
		//c1.setClosedLoopControl(true);
		UsbCamera cam1 = CameraServer.getInstance().startAutomaticCapture(0);
		cam1.setResolution(180,	120);
		cam1.setFPS(15);
		UsbCamera camboy = CameraServer.getInstance().startAutomaticCapture(1);
		camboy.setResolution(180, 120);
		camboy.setFPS(15);
		Compressor myCompressor = new Compressor(0);
		myCompressor.setClosedLoopControl(true);
		System.out.println(myCompressor.enabled());
		System.out.println(myCompressor.getPressureSwitchValue());
	}

	/**
	 * This function is called once each time the robot enters Disabled mode.
	 * You can use it to reset any subsystem information you want to clear when
	 * the robot is disabled.
	 */
	@Override
	public void disabledInit() {

	}

	@Override
	public void disabledPeriodic() {
		Scheduler.getInstance().run();
	}

	/**
	 * This autonomous (along with the chooser code above) shows how to select
	 * between different autonomous modes using the dashboard. The sendable
	 * chooser code works with the Java SmartDashboard. If you prefer the
	 * LabVIEW Dashboard, remove all of the chooser code and uncomment the
	 * getString code to get the auto name from the text box below the Gyro
	 * 
	 * <p>
	 * You can add additional auto modes by adding additional commands to the
	 * chooser code above (like the commented example) or additional comparisons
	 * to the switch structure below with additional strings & commands.
	 */
	@Override
	public void autonomousInit() {
		m_autonomousCommand = m_chooser.getSelected();

		/*
		 * String autoSelected = SmartDashboard.getString("Auto Selector",
		 * "Default"); switch(autoSelected) { case "My Auto": autonomousCommand
		 * = new MyAutoCommand(); break; case "Default Auto": default:
		 * autonomousCommand = new ExampleCommand(); break; }
		 */

		// schedule the autonomous command (example)
		if (m_autonomousCommand != null) {
			m_autonomousCommand.start();
		}
	}

	/**
	 * This function is called periodically during autonomous.
	 */
	@Override
	public void autonomousPeriodic() {
		Scheduler.getInstance().run();
		time = time + TICK_DURATION;
		if (time < 3500) {
			drivebase.m_Drive.tankDrive(0.85, 0.85);
		} else {
			Drivebase.m_Drive.tankDrive(0, 0);
		}
	}

	@Override
	public void teleopInit() {
		// This makes sure that the autonomous stops running when
		// teleop starts running. If you want the autonomous to
		// continue until interrupted by another command, remove
		// this line or comment it out.
		if (m_autonomousCommand != null) {
			m_autonomousCommand.cancel();
		}
		Scheduler.getInstance().add(iTank);
		Scheduler.getInstance().add(iCube);
		Scheduler.getInstance().add(iClimb);
		Scheduler.getInstance().add(iConveyer);
		Scheduler.getInstance().add(ilowTank);
		Scheduler.getInstance().add(iLift);
	}

	/**
	 * This function is called periodically during operator control.
	 */
	@Override
	public void teleopPeriodic() {
		Scheduler.getInstance().run();
		// myCommand.;

	}

	/**
	 * This function is called periodically during test mode.
	 */
	@Override
	public void testPeriodic() {
	}
}
