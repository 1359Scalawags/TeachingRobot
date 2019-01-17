package org.usfirst.frc.team1359.robot.commands.Elevator;

import org.usfirst.frc.team1359.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class MoveElevatorSlider extends Command {

	public MoveElevatorSlider() {
		super("MoveElevatorSlider");
		requires(Robot.kElevatorManipulator);
		// Use requires() here to declare subsystem dependencies
		// eg. requires(chassis);
		//setInterruptible(false);
	}

	// Called just before this Command runs the first time
	protected void initialize() {
	}

	// Called repeatedly when this Command is scheduled to run
	protected void execute() {
		Robot.kElevatorManipulator.moveSlider(Robot.kOI.getSliderStick());
	}

	// Make this return true when this Command no longer needs to run execute()
	protected boolean isFinished() {
		return false;
	}

	// Called once after isFinished returns true
	protected void end() {
	}

	protected void interrupted() {
		// cannot be interrupted
	}
}