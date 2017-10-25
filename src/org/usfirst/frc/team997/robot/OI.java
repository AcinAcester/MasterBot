package org.usfirst.frc.team997.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

import org.usfirst.frc.team997.robot.commands.Blast;
import org.usfirst.frc.team997.robot.commands.ExampleCommand;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	
	public Joystick joy;
	public JoystickButton butt; 
	public JoystickButton trig;
	
	public OI() {
		
		butt = new JoystickButton(joy,0); 
		joy = new Joystick(0); 
		butt.whenPressed(new Blast());
	} 	
			public double getlefty() {
			return joy.getRawAxis(1);
	}
			public double getrighty() {
			return joy.getRawAxis(2);
	}
			
		

}
