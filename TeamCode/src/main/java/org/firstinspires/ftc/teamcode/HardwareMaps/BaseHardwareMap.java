package org.firstinspires.ftc.teamcode.HardwareMaps;

import com.qualcomm.robotcore.hardware.*;

public abstract class BaseHardwareMap {
    public DcMotor motor_front_right;
    public DcMotor motor_front_left;
    public DcMotor motor_rear_right;
    public DcMotor motor_rear_left;
    public DcMotor motor_flyingwheel_left;
    public DcMotor motor_flyingwheel_right;
    public DcMotor motor_collector;
    public DcMotor motor_gripper;

    public Servo servo_conveyor;

    public ColorSensor colorSensor_right;
    public ColorSensor colorSensor_left;

    public DistanceSensor distanceSensor_right_down;
    public DistanceSensor distanceSensor_right_up;
    public DistanceSensor distanceSensor_left_down;
    public DistanceSensor distanceSensor_left_up;

    // State used for updating telemetry
    public HardwareMap hwMap;

    public BaseHardwareMap(HardwareMap hwMap) {
        this.hwMap = hwMap;
        init(hwMap);
    }

    public abstract void init(HardwareMap hwMap);
}
