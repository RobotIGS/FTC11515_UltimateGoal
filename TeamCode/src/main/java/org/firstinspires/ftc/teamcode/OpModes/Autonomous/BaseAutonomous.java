package org.firstinspires.ftc.teamcode.OpModes.Autonomous;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import org.firstinspires.ftc.teamcode.HardwareMaps.BaseHardwareMap;
import org.firstinspires.ftc.teamcode.Tools.ColorEnum;
import org.firstinspires.ftc.teamcode.Tools.ColorTools;

public abstract class BaseAutonomous extends LinearOpMode {
    BaseHardwareMap robot;
    ColorTools colorTools;

    @Override
    public void runOpMode() throws InterruptedException {
        initialize();

        run();
        waitForStart();

        while (!colorTools.isWhite(robot.colorSensor_left) || !colorTools.isWhite(robot.colorSensor_right) && opModeIsActive()){
            // Drive forward to the white line
        }

        if (opModeIsActive()){
            // stop
        }

        if (opModeIsActive()){
            // we drive a little bit back
        }

        if (opModeIsActive()){
            // stop
        }

        if (opModeIsActive()){
            // we drive to the right
        }

        if (opModeIsActive()){
            // stop
        }

        if (opModeIsActive()){
            // shoot
        }

        if (opModeIsActive()){
            for (int i = 0; i < 2; i++){
                if (opModeIsActive()){
                    // we drive to the right
                    // stop
                    // shoot
                }
            }
        }

        if (opModeIsActive()){
            // Drive forward to the white line
        }

        if (opModeIsActive()){
            // stop
        }

    }

    public void initialize() {
        colorTools = new ColorTools();
    }

    public abstract ColorEnum getAllianceColor();

    public abstract void run();

    public void doStuff() {
        if (opModeIsActive()) return;

        // foo bar
    }


}
