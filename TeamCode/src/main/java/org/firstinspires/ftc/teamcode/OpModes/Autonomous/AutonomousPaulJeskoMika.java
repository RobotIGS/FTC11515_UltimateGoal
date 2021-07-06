package org.firstinspires.ftc.teamcode.OpModes.Autonomous;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.CompassSensor;

import org.firstinspires.ftc.teamcode.HardwareMaps.FullHardwareMap;
import org.firstinspires.ftc.teamcode.Tools.ColorTools;
import org.firstinspires.ftc.teamcode.Tools.OmniWheel;

@Autonomous
public class AutonomousPaulJeskoMika extends LinearOpMode {
    FullHardwareMap robot;
    ColorTools colorTools;
    OmniWheel omniWheel;

    @Override
    public void runOpMode() throws InterruptedException {
        robot = new FullHardwareMap(hardwareMap);
        colorTools = new ColorTools();
        omniWheel = new OmniWheel(robot);

        waitForStart();


        omniWheel.setMotors(0.2, 0, 0);

        while (!colorTools.isWhite(robot.colorSensor_left) && opModeIsActive()) {
        }

        if (!colorTools.isWhite(robot.colorSensor_left) && opModeIsActive()) {


            omniWheel.setMotors(-0.5, 0,0);
            while (!colorTools.isWhite(robot.colorSensor_left) && opModeIsActive()){

            }
        }

        omniWheel.setMotors(0, -0.2, 0);

        while (!colorTools.isBlue(robot.colorSensor_right) && opModeIsActive()) {
        }
        omniWheel.setMotors(0, 0, 0);

    }
}
