package org.firstinspires.ftc.teamcode.HardwareMaps;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class SingleMotorHardwareMap extends BaseHardwareMap {
    public SingleMotorHardwareMap(HardwareMap hwMap) {
        super(hwMap);
    }

    @Override
    public void init(HardwareMap hwMap) {
        this.motor_front_right = hwMap.get(DcMotor.class, "hub1_motorport0");
    }
}