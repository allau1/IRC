package frc.robot.subsystems;

import edu.wpi.first.wpilibj.motorcontrol.MotorController;
import edu.wpi.first.wpilibj.motorcontrol.Victor;
import frc.robot.Robot;

public class Drivetrain {
    private MotorController left, right;

    public Drivetrain(int portl, int portr) {
        left = new Victor(portl);
        right = new Victor(portr);
    }

    public void drive(double l, double r) {
        left.set(l * Robot.DRIVETRAIN_SPEED);
        right.set(r * Robot.DRIVETRAIN_SPEED);
    }

    public void stop() {
        left.stopMotor();
        right.stopMotor();
    }
}
