package org.firstinspires.ftc.teamcode.HardwareMaps;

import com.qualcomm.robotcore.hardware.*;

import org.firstinspires.ftc.robotcore.external.navigation.DistanceUnit;

public class FullHardwareMap extends BaseHardwareMap{
    public FullHardwareMap(HardwareMap hwMap) {
        super(hwMap);
    }

    @Override
    public void init(HardwareMap hwMap) {
        this.motor_flyingwheel_left = hwMap.get(DcMotor.class, "hub1_motorport0");
        this.motor_flyingwheel_right = hwMap.get(DcMotor.class, "hub1_motorport1");
        this.motor_collector = hwMap.get(DcMotor.class, "hub1_motorport2");
        this.motor_gripper = hwMap.get(DcMotor.class, "hub1_motorport3");

        servo_conveyor = hwMap.get(Servo.class, "hub1_servoport1");

        motor_front_right = hwMap.get(DcMotor.class, "hub2_motorport0");
        motor_rear_right = hwMap.get(DcMotor.class, "hub2_motorport1");
        motor_front_left = hwMap.get(DcMotor.class, "hub2_motorport2");
        motor_rear_left = hwMap.get(DcMotor.class, "hub2_motorport3");
    }
}
