package org.usfirst.frc.team1797.robot;

import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.VictorSP;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	VictorSP SHOOTER_WHEEL;

	Encoder SHOOTER_ENCODER;

	public void init() {
		SHOOTER_WHEEL = new VictorSP(0);

		SHOOTER_ENCODER = new Encoder(0, 1);
		SHOOTER_ENCODER.setDistancePerPulse(1/1024);
	}
}
