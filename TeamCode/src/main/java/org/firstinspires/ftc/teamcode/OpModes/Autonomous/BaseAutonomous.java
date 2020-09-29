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
