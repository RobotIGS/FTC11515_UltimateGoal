package org.firstinspires.ftc.teamcode.OpModes.Autonomous;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import org.firstinspires.ftc.teamcode.HardwareMaps.FullHardwareMap;
import org.firstinspires.ftc.teamcode.Tools.ColorTools;
import org.firstinspires.ftc.teamcode.Tools.OmniWheel;

@Autonomous
public class LiLaAutonomous extends LinearOpMode {
    FullHardwareMap robot;
    ColorTools colorTools;
    OmniWheel omniWheel;

    @Override
    public void runOpMode() throws InterruptedException {
        robot = new FullHardwareMap(hardwareMap);
        colorTools = new ColorTools();
        omniWheel = new OmniWheel(robot);

        waitForStart();

        omniWheel.setMotors(0.25, 0, 0);
        while (!colorTools.isWhite(robot.colorSensor_right) && opModeIsActive()) {}
        omniWheel.setMotors(0, 0, 0.2);
        while (!colorTools.isWhite(robot.colorSensor_front) && opModeIsActive()) {}
        omniWheel.setMotors(0, 0, 0);

        while (opModeIsActive()) {
            if (colorTools.isBlue(robot.colorSensor_left)) {
                omniWheel.setMotors(0,0,0);
                break;
            } else if (!colorTools.isWhite(robot.colorSensor_front)) {
                omniWheel.setMotors(0.1, 0, -0.1);
            } else {
                omniWheel.setMotors(0.4, 0, 0.2);
            }
        }


    }
}
