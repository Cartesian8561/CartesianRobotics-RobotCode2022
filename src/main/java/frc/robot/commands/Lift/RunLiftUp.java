// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands.Lift;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Lift.Lift;

public class RunLiftUp extends CommandBase {
  private Lift liftSubsystem;
  private double m_speed;
  private boolean m_go;
  /** Creates a new RunLift. */
  public RunLiftUp(Lift lift, double speed, boolean go) {
    liftSubsystem = lift;
    m_speed = speed;
    m_go = go;
    addRequirements(liftSubsystem);
    // Use addRequirements() here to declare subsystem dependencies.
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    liftSubsystem.liftUp(m_speed);
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    liftSubsystem.stop();
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return !m_go;
  }
}
