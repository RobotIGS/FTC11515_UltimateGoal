package org.firstinspires.ftc.teamcode.HardwareMaps;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class SampleHardwareMap extends BaseHardwareMap {
    public SampleHardwareMap(HardwareMap hwMap) {
        super(hwMap);
    }

    @Override
    public void init(HardwareMap hwMap) {
        this.motor_front_left =  hwMap.get(DcMotor.class, "hub1_motorport2");
        this.motor_rear_right =  hwMap.get(DcMotor.class, "hub1_motorport1");
        this.motor_front_right = hwMap.get(DcMotor.class, "hub1_motorport0");
        this.motor_rear_left =   hwMap.get(DcMotor.class, "hub1_motorport3");
    }
}
