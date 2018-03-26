package org.usfirst.frc.team3609.robot.subsystems;

import org.usfirst.frc.team3609.robot.commands.Lift;

import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class lifter extends Subsystem {
	
	static Solenoid Goup = new Solenoid(7);
	static Solenoid Godw = new Solenoid(6);

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
    	setDefaultCommand(new Lift());
    }
    
   public static void lift() {
	   Goup.set(true);
	   Godw.set(false);
	   System.out.println("lift");
   }
   
   public static void down() {
	   Goup.set(false);
	   Godw.set(true);
	   System.out.println("drop");
   }
   
}

