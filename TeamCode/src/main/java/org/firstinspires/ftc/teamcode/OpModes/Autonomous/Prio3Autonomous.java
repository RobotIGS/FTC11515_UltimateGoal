package org.firstinspires.ftc.teamcode.OpModes.Autonomous;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;

import org.firstinspires.ftc.teamcode.HardwareMaps.BaseHardwareMap;
import org.firstinspires.ftc.teamcode.Tools.ColorEnum;
import org.firstinspires.ftc.teamcode.Tools.ColorTools;
import org.firstinspires.ftc.teamcode.Tools.GeneralTools;

public abstract class Prio3Autonomous extends LinearOpMode {
    BaseHardwareMap robot;
    ColorTools colorTools;
    GeneralTools generalTools;

    @Override
    public void runOpMode() throws InterruptedException {
        initialize();

        run();
        waitForStart();

        if (opModeIsActive()) {
            //drive forward to the rings
        }

        if (opModeIsActive()){
            // stop
        }

        if (opModeIsActive()){

           switch (generalTools.HowManyRings()){
               case (0):
                   //Drive to A (The white line)
                   //Drive back behind the white line
               break;

               case (1):
                   //Drive to B
                   //Drive back behind the white line
               break;

               case (4):
                   //Drive to C
                   //Drive back behind the white line
               break;
           }
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
        generalTools = new GeneralTools(this, robot);
    }

    public abstract ColorEnum getAllianceColor();

    public abstract void run();

    public void doStuff() {
        if (opModeIsActive()) return;

        // foo bar
    }


}