package org.firstinspires.ftc.teamcode.HardwareMaps;

import com.qualcomm.robotcore.hardware.DistanceSensor;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class SensorHardwareMap extends BaseHardwareMap{
    public SensorHardwareMap(HardwareMap hwMap) {
        super(hwMap);
    }

    @Override
    public void init(HardwareMap hwMap) {
        this.distanceSensor_left_down = hwMap.get(DistanceSensor.class, "Distancesensor_Left_Down");
        this.distanceSensor_left_up = hwMap.get(DistanceSensor.class, "Distancesensor_Left_Up");
        this.distanceSensor_right_down = hwMap.get(DistanceSensor.class, "Distancesensor_Right_Down");
        this.distanceSensor_right_up = hwMap.get(DistanceSensor.class,"Distancesensor_Right_Up");
//Divice

    }
}
