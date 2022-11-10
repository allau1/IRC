package frc.robot.subsystems;

import edu.wpi.first.wpilibj.motorcontrol.MotorController;
import edu.wpi.first.wpilibj.motorcontrol.Victor;

public class Arm {
    private MotorController armMotor;

    public Arm(int armPort) {
        armMotor = new Victor(armPort);
    }

    public void drive(double armSpeed) {
        armMotor.set(armSpeed);
    }

    public void stop() {
        armMotor.stopMotor();
    }
}
