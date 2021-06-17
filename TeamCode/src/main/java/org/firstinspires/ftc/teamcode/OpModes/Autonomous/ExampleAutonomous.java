package org.firstinspires.ftc.teamcode.OpModes.Autonomous;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import org.firstinspires.ftc.teamcode.HardwareMaps.FullHardwareMap;
import org.firstinspires.ftc.teamcode.Tools.ColorTools;
import org.firstinspires.ftc.teamcode.Tools.OmniWheel;

public class ExampleAutonomous extends LinearOpMode {
    FullHardwareMap robot;
    ColorTools colorTools;
    OmniWheel omniWheel;

    @Override
    public void runOpMode() throws InterruptedException {
        robot = new FullHardwareMap(hardwareMap);
        colorTools = new ColorTools();
        omniWheel = new OmniWheel(robot);

        omniWheel.setMotors(1, 0, 0);

        while (!colorTools.isBlue(robot.colorSensor_right) && opModeIsActive()) {
        }

        omniWheel.setMotors(0, 0, 0);
    }
}
