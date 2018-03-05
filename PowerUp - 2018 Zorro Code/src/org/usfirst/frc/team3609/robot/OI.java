/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team3609.robot;

import edu.wpi.first.wpilibj.GenericHID.Hand;
import edu.wpi.first.wpilibj.XboxController;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {

	public static class DriverController {
		private static XboxController controller = new XboxController(0);

		/*
		 * Gets the left stick Y axis of the controller
		 */
		public static double getLeftYAxis() {
			return controller.getY(Hand.kLeft);
		}

		/*
		 * Gets the left stick X axis of the controller
		 */
		public static double getLeftXAxis() {
			return controller.getX(Hand.kRight);
		}

		/*
		 * Gets the right stick Y axis of the controller
		 */
		public static double getRightYAxis() {
			return controller.getY(Hand.kLeft);
		}

		/*
		 * Gets the right stick X axis of the controller
		 */
		public static double getRightXAxis() {
			return controller.getX(Hand.kRight);
		}
		public static double conveyerIntake() {
			return controller.getTriggerAxis(Hand.kRight);
		}
		public static double conveyerShoot() {
			return controller.getTriggerAxis(Hand.kLeft);
		}
	public static class OperatorController {
		private static XboxController OController = new XboxController(1);
		// Gets left Y Axis of the operator's controller for Left motor of the  cube intake
		public static double getLeftMotor() {
			return OController.getY(Hand.kLeft);
		}
		// Gets right Y Axis of the operator's controller for Right motor of the cube intake
		public static double getRightMotor() {
			return OController.getY(Hand.kRight);
		}
		public static double conveyerIntake() {
			return controller.getTriggerAxis(Hand.kRight);
		}
		public static double conveyerShoot() {
			return controller.getTriggerAxis(Hand.kLeft)*-1;
		}
		public static boolean climberActivator() {
			return OController.getXButton();
		}
	}
	}
	// // CREATING BUTTONS
	// One type of button is a joystick button which is any button on a
	// // joystick.
	// You create one by telling it which joystick it's on and which button
	// number it is.
	// Joystick stick = new Joystick(port);
	// Button button = new JoystickButton(stick, buttonNumber);

	// There are a few additional built in buttons you can use. Additionally,
	// by subclassing Button you can create custom triggers and bind those to
	// commands the same as any other Button.

	// // TRIGGERING COMMANDS WITH BUTTONS
	// Once you have a button, it's trivial to bind it to a button in one of
	// three ways:

	// Start the command when the button is pressed and let it run the command
	// until it is finished as determined by it's isFinished method.
	// button.whenPressed(new ExampleCommand());

	// Run the command while the button is being held down and interrupt it once
	// the button is released.
	// button.whileHeld(new ExampleCommand());

	// Start the command when the button is released and let it run the command
	// until it is finished as determined by it's isFinished method.
	// button.whenReleased(new ExampleCommand());
}
