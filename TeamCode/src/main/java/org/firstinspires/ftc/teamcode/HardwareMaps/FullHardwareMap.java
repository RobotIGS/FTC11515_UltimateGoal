package org.firstinspires.ftc.teamcode.HardwareMaps;

import com.qualcomm.robotcore.hardware.*;

public class FullHardwareMap extends BaseHardwareMap {
    public FullHardwareMap(HardwareMap hwMap) {
        super(hwMap);
    }

    @Override
    public void init(HardwareMap hwMap) {
        this.motor_flyingwheel_left = hwMap.get(DcMotor.class, "hub1_motorport0");
        this.motor_flyingwheel_right = hwMap.get(DcMotor.class, "hub1_motorport1");
        this.motor_collector = hwMap.get(DcMotor.class, "hub1_motorport2");
        this.motor_gripper = hwMap.get(DcMotor.class, "hub1_motorport3");

        servo_collector = hwMap.get(Servo.class, "hub1_servoport2");
        servo_conveyor = hwMap.get(Servo.class, "hub1_servoport1");
        servo_gripper = hwMap.get(Servo.class, "hub1_servoport0");

        colorSensor_left = hwMap.get(ColorSensor.class, "hub1_colorsensor1");
        colorSensor_right = hwMap.get(ColorSensor.class, "hub1_colorsensor2");
        colorSensor_front = hwMap.get(ColorSensor.class, "hub1_colorsensor3");

        motor_rear_right = hwMap.get(DcMotor.class, "hub2_motorport0");
        motor_front_right = hwMap.get(DcMotor.class, "hub2_motorport1");
        motor_front_left = hwMap.get(DcMotor.class, "hub2_motorport2");
        motor_rear_left = hwMap.get(DcMotor.class, "hub2_motorport3");
    }
}
