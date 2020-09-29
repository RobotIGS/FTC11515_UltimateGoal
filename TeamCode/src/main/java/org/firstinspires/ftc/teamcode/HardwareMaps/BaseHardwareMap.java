package org.firstinspires.ftc.teamcode.HardwareMaps;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;

public abstract class BaseHardwareMap {
    public DcMotor motor_front_right;
    public DcMotor motor_front_left;
    public DcMotor motor_rear_right;
    public DcMotor motor_rear_left;

    // State used for updating telemetry
    private HardwareMap hwMap;

    public BaseHardwareMap(HardwareMap hwMap) {
        init(hwMap);
    }

    public abstract void init(HardwareMap hwMap);
}
