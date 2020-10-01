package org.firstinspires.ftc.teamcode.HardwareMaps;

import com.qualcomm.robotcore.hardware.ColorSensor;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DistanceSensor;
import com.qualcomm.robotcore.hardware.HardwareMap;

public abstract class BaseHardwareMap {
    public DcMotor motor_front_right;
    public DcMotor motor_front_left;
    public DcMotor motor_rear_right;
    public DcMotor motor_rear_left;

    public ColorSensor colorSensor_right;
    public ColorSensor colorSensor_left;

    public DistanceSensor distanceSensor_right_down;
    public DistanceSensor distanceSensor_right_up;
    public DistanceSensor distanceSensor_left_down;
    public DistanceSensor distanceSensor_left_up;


    // State used for updating telemetry
    private HardwareMap hwMap;

    public BaseHardwareMap(HardwareMap hwMap) {
        init(hwMap);
    }

    public abstract void init(HardwareMap hwMap);
}
