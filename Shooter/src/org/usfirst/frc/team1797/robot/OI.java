package org.usfirst.frc.team1797.robot;

import org.usfirst.frc.team1797.robot.commands.ShooterCommand;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	public OI() {
		(new JoystickButton(new Joystick(0), 0)).whileHeld(new ShooterCommand());
	}
}
