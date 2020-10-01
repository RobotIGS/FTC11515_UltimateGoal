package org.firstinspires.ftc.teamcode.Tools;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

import org.firstinspires.ftc.robotcore.external.navigation.DistanceUnit;
import org.firstinspires.ftc.teamcode.HardwareMaps.BaseHardwareMap;

public class GeneralTools {
    private LinearOpMode opMode;
    BaseHardwareMap robot;
    private double min, max; //Still need to be tested

    public GeneralTools(LinearOpMode opMode, BaseHardwareMap robot) {
        this.opMode = opMode;
        this.robot = robot;

    }

    /**
     * calculates number of rings
     * @return double
     * Paul.U
     */
    public double HowManyRings() {
        double ringNumber = 0;

        if (max >= robot.distanceSensor_left_down.getDistance(DistanceUnit.CM) || min <= robot.distanceSensor_left_down.getDistance(DistanceUnit.CM) || max >= robot.distanceSensor_right_down.getDistance(DistanceUnit.CM) || min <= robot.distanceSensor_right_down.getDistance(DistanceUnit.CM)){
            if (max >= robot.distanceSensor_left_up.getDistance(DistanceUnit.CM) || min <= robot.distanceSensor_left_up.getDistance(DistanceUnit.CM) || max >= robot.distanceSensor_right_up.getDistance(DistanceUnit.CM) || min <= robot.distanceSensor_right_up.getDistance(DistanceUnit.CM)) {
                ringNumber = 4;
            } else {
                ringNumber = 1;
            }
        } else {
            ringNumber = 0;
        }
        return ringNumber;
    }

}