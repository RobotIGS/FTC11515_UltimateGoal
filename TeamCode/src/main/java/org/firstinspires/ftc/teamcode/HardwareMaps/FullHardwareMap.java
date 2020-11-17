package org.firstinspires.ftc.teamcode.HardwareMaps;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.robotcore.external.navigation.DistanceUnit;

public class FullHardwareMap extends BaseHardwareMap{
    public FullHardwareMap(HardwareMap hwMap) {
        super(hwMap);
    }

    @Override
    public void init(HardwareMap hwMap) {
        this.motor_conveyor = hwMap.get(DcMotor.class, "hub1_motorport0");
        this.motor_shooter_left = hwMap.get(DcMotor.class, "hub1_motorport1");
        this.motor_shooter_right = hwMap.get(DcMotor.class, "hub1_motorport2");
    }
}
