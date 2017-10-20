package org.usfirst.frc.team997.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;

import org.usfirst.frc.team997.robot.commands.ExampleCommand;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	
	public Joystick joy;

	public OI() {
		joy = new Joystick(0); 
	} 	
			public double getlefty() {
			return joy.getRawAxis(1);
	}
			public double getrighty() {
			return joy.getRawAxis(2);
	}

}
