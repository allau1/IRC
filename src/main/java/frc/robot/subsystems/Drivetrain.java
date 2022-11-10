package frc.robot.subsystems;

import edu.wpi.first.wpilibj.motorcontrol.MotorController;
import edu.wpi.first.wpilibj.motorcontrol.Victor;

public class Drivetrain {
    private MotorController left, right;

    public Drivetrain(int portl, int portr) {
        left = new Victor(portl);
        right = new Victor(portr);
    }

    public void drive(double l, double r) {
        left.set(l);
        right.set(r);
    }

    public void stop() {
        left.stopMotor();
        right.stopMotor();
    }
}
