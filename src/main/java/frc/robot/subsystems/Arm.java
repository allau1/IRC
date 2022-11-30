package frc.robot.subsystems;

import edu.wpi.first.wpilibj.motorcontrol.MotorController;
import edu.wpi.first.wpilibj.motorcontrol.Victor;
import frc.robot.Robot;

public class Arm {
    private MotorController armMotor;

    public Arm(int armPort) {
        armMotor = new Victor(armPort);
    }

    public void drive(double armSpeed) {
        armMotor.set(armSpeed * Robot.ARM_SPEED);
    }

    public void stop() {
        armMotor.stopMotor();
    }
}
