package org.firstinspires.ftc.teamcode.OpModes.Autonomous;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import org.firstinspires.ftc.teamcode.HardwareMaps.FullHardwareMap;
import org.firstinspires.ftc.teamcode.Tools.ColorTools;
import org.firstinspires.ftc.teamcode.Tools.OmniWheel;

@Autonomous
public class Team42 extends LinearOpMode {
    FullHardwareMap robot;
    ColorTools colorTools;
    OmniWheel omniWheel;

    @Override
    public void runOpMode() throws InterruptedException {
        robot = new FullHardwareMap(hardwareMap);
        colorTools = new ColorTools();
        omniWheel = new OmniWheel(robot);

        waitForStart();

        omniWheel.setMotors(0, -0.3, 0); // negativ --> nach rechts
        //seitwerts bewegen bis vorderer? Farbsensor weiß
        while (!colorTools.isWhite(robot.colorSensor_front) && opModeIsActive()) {
        }

        while (!colorTools.isBlue(robot.colorSensor_right) && opModeIsActive()) {
            // parken im blauen Kasten
            if (robot.colorSensor_front.red() < 200) {   // schwarz
                omniWheel.setMotors(0.2, 0, 0.1);
            } else {                                     // weiß
                omniWheel.setMotors(0.2, 0, -0.1);
            }
        }

        omniWheel.setMotors(0, 0, 0);
    }
}


/*
- seitwerts rein stellen
- seitwerts bis weiß
- gerade aus bis zur bis zur zweiten blauen Linie
 */

/*omniwheelControl.start(10, 0, 0.25);
        while (!omniwheelControl.endReached()) // && opModeIsRunning())
        {

        }
        omniwheelControl.stop();
*/