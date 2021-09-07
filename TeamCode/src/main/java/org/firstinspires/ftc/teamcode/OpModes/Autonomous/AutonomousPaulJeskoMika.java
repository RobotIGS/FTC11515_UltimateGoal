package org.firstinspires.ftc.teamcode.OpModes.Autonomous;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.CompassSensor;

import org.firstinspires.ftc.teamcode.HardwareMaps.FullHardwareMap;
import org.firstinspires.ftc.teamcode.Tools.ColorTools;
import org.firstinspires.ftc.teamcode.Tools.OmniWheel;
import org.firstinspires.ftc.teamcode.Tools.OrientationTools;

@Autonomous
public class AutonomousPaulJeskoMika extends LinearOpMode {
    FullHardwareMap robot;
    ColorTools colorTools;
    OmniWheel omniWheel;
    OrientationTools orientationTools;
    double startingAngle;

    @Override
    public void runOpMode() throws InterruptedException {
        robot = new FullHardwareMap(hardwareMap);
        colorTools = new ColorTools();
        omniWheel = new OmniWheel(robot);
        orientationTools = new OrientationTools(robot, this);
        startingAngle = orientationTools.getDegree360(robot.imu);

        waitForStart();


        omniWheel.setMotors(0.25, 0, 0.0055);

        while (!colorTools.isWhite(robot.colorSensor_left) && opModeIsActive()) {

        }
        omniWheel.setMotors(0, 0, 0);

      /*  while (colorTools.isWhite(robot.colorSensor_front) && opModeIsActive()){
            omniWheel.setMotors(0.25,0,0.005);
            telemetry.addData("position", 2);
            telemetry.update();

            if (!colorTools.isWhite(robot.colorSensor_front)){
                while (!colorTools.isWhite(robot.colorSensor_front) && !colorTools.isBlue(robot.colorSensor_front) && opModeIsActive()){
                    omniWheel.setMotors(0,0,-0.2);
                    telemetry.addData("position", 3);
                    telemetry.update();

                }
            }
            if (colorTools.isBlue(robot.colorSensor_front)){
                telemetry.addData("Blau?",9);
                telemetry.update();
       */
            }


        }


        /*
        Mika, bitte probier hier mal ein bisschen rum :)
        */

        //orientationTools.turnToDegrees(-90, 0.5, omniWheel, robot.imu );

        //omniWheel.setMotors(0,0,0);
/*
        if (!colorTools.isWhite(robot.colorSensor_left) && opModeIsActive()) {


            omniWheel.setMotors(-0.5, 0,0);
            while (!colorTools.isWhite(robot.colorSensor_left) && opModeIsActive()){

            }
        }
*/




