package org.usfirst.frc.team997.robot.subsystems;

import org.usfirst.frc.team997.robot.RobotMap;

import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class DriveTrain extends Subsystem {
	private VictorSP left, right;
	
	public DriveTrain() {
		left = new VictorSP(RobotMap.Ports.leftMotorPort);
		right = new VictorSP(RobotMap.Ports.rightMotorPort);
	}
		
	public void driveVoltage(double leftV, double rightV) {
		left.set(leftV);
		right.set(rightV);
	}
    
    public void initDefaultCommand() {
    	setDefaultCommand(new Tankdrive());
    }
}

