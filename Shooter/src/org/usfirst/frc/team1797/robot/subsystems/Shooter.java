package org.usfirst.frc.team1797.robot.subsystems;

import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.command.PIDSubsystem;

/**
 *
 */
public class Shooter extends PIDSubsystem {

	private VictorSP wheel;
	private Encoder encoder;
	private double output;

	public Shooter() {
		super(1, 0, 0);
		setSetpoint(3000);
	}

	public void on() {
		enable();
	}

	public void off() {
		disable();
		output = 0;
		wheel.set(0);

	}

	public boolean isReady() {
		return 2850 < output || output < 3150;
	}

	protected double returnPIDInput() {
		return encoder.getRate();
	}

	protected void usePIDOutput(double output) {
		this.output += output;
		wheel.set(this.output);
	}

	@Override
	protected void initDefaultCommand() {

	}
}
