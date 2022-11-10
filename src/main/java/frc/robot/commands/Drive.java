package frc.robot.commands;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Arm;
import frc.robot.subsystems.Drivetrain;

public class Drive extends CommandBase {
    private Drivetrain drivetrain;
    private Arm arm;
    private Joystick leftJ, rightJ, armJ;

    public Drive(Drivetrain dt, Arm a, Joystick left, Joystick right, Joystick arm) {
        drivetrain = dt;
        leftJ = left;
        rightJ = right;
        armJ = arm;
    }

    @Override
    public void execute() {
        drivetrain.drive(leftJ.getY(), rightJ.getY());
        arm.drive(armJ.getY());
    }

    public void end(boolean i) {
        drivetrain.stop();
        arm.stop();
    }
}
