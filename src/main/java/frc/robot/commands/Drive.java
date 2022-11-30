package frc.robot.commands;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Arm;
import frc.robot.subsystems.Drivetrain;

public class Drive extends CommandBase {
    private Drivetrain drivetrain;
    private Arm arm;
    private Joystick leftJ, rightJ, armJ;

    public Drive(Drivetrain dt, Arm a, Joystick left, Joystick right) {
        drivetrain = dt;
        arm = a;
        leftJ = left;
        rightJ = right;
    }

    @Override
    public void execute() {
        drivetrain.drive(leftJ.getY(), rightJ.getY());
        arm.drive(((rightJ.getTriggerPressed()) ? 1 : 0) + ((rightJ.getRawButton(0) ? -1 : 0)));
    }

    public void end(boolean i) {
        drivetrain.stop();
        arm.stop();
    }
}
