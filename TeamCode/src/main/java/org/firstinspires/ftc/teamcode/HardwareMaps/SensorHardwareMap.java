package org.firstinspires.ftc.teamcode.HardwareMaps;

import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.robotcore.external.navigation.DistanceUnit;

public class SensorHardwareMap extends BaseHardwareMap{
    public SensorHardwareMap(HardwareMap hwMap) {
        super(hwMap);
    }

    @Override
    public void init(HardwareMap hwMap) {
        this.distanceSensor_left_down.getDistance(DistanceUnit.CM);
        this.distanceSensor_left_up.getDistance(DistanceUnit.CM);
        this.distanceSensor_right_down.getDistance(DistanceUnit.CM);
        this.distanceSensor_right_up.getDistance(DistanceUnit.CM);


    }
}
