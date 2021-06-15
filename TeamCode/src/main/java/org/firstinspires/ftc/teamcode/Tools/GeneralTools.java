package org.firstinspires.ftc.teamcode.Tools;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DistanceSensor;

import org.firstinspires.ftc.robotcore.external.navigation.DistanceUnit;
import org.firstinspires.ftc.teamcode.HardwareMaps.BaseHardwareMap;
import org.firstinspires.ftc.teamcode.OpModes.Autonomous.BaseAutonomous;

public class GeneralTools {
    private LinearOpMode opMode;
    BaseHardwareMap robot;
    ColorEnum allianceColor;
    private double minStackHeight, maxStackHeight; //Still need to be tested

    public static double WHEEL_RADIUS = 5.0;
    public static double SIDE_DISTANCE = 38;
    public static double FRONT_BACK_DISTANCE = 24;


    public GeneralTools(LinearOpMode opMode, BaseHardwareMap robot, ColorEnum allianceColor) {
        this.opMode = opMode;
        this.robot = robot;
        this.allianceColor = allianceColor;
    }

    public GeneralTools(BaseAutonomous opMode, BaseHardwareMap robot) {
        this.opMode = opMode;
        this.robot = robot;
        this.allianceColor = opMode.getAllianceColor();
    }

    /**
     * calculates number of rings
     * @return int
     * Paul.U
     */
    public int getStarterStackHeight() {
        int ringNumber = 0;

        DistanceSensor distanceSensorUp;
        DistanceSensor distanceSensorDown;

        if (this.allianceColor == ColorEnum.Red) {
            distanceSensorUp = robot.distanceSensor_left_up;
            distanceSensorDown = robot.distanceSensor_left_down;
        } else {
            distanceSensorUp = robot.distanceSensor_right_up;
            distanceSensorDown = robot.distanceSensor_right_down;
        }

        if (maxStackHeight >= distanceSensorDown.getDistance(DistanceUnit.CM) || minStackHeight <= distanceSensorDown.getDistance(DistanceUnit.CM)) {
            if (maxStackHeight >= distanceSensorUp.getDistance(DistanceUnit.CM) || minStackHeight <= distanceSensorUp.getDistance(DistanceUnit.CM)) {
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
