package org.firstinspires.ftc.teamcode.OpModes.Autonomous;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import org.firstinspires.ftc.teamcode.HardwareMaps.BaseHardwareMap;
import org.firstinspires.ftc.teamcode.Tools.ColorEnum;
import org.firstinspires.ftc.teamcode.Tools.ColorTools;
import org.firstinspires.ftc.teamcode.Tools.GeneralTools;

public abstract class BaseAutonomous extends LinearOpMode {
    BaseHardwareMap robot;
    ColorTools colorTools;
    GeneralTools generalTools;

    @Override
    public void runOpMode() throws InterruptedException {
        initialize();
        waitForStart();
        run();
    }

    public void initialize() {
        colorTools = new ColorTools();
        generalTools = new GeneralTools(this, robot);
    }

    public abstract ColorEnum getAllianceColor();

    public abstract void run();

    public void driveToWhiteLine() {
        if (!opModeIsActive()) return;

        while (!colorTools.isWhite(robot.colorSensor_right) || !colorTools.isWhite(robot.colorSensor_right)){
            // Drive forward to the white line
        }

        pauseMotors();
    }

    public void driveToStarterStack() {
        if (!opModeIsActive()) return;

        // drive forward to the rings
        // TODO: implement
        pauseMotors();
    }

    public void driveToBehindWhiteLine() {
        if (!opModeIsActive()) return;

        // we drive a little bit back
        // TODO: implement
        pauseMotors();
    }

    public void pauseMotors() {
        if (!opModeIsActive()) return;

        // stop
        // TODO: implement
    }

    public void driveToFirstPowerTargetShootingPositionAC() {
        if (!opModeIsActive()) return;

        // TODO: implement
        pauseMotors();
    }

    public void driveToFirstPowerTargetShootingPositionB() {
        if (!opModeIsActive()) return;

        // TODO: implement
        pauseMotors();
    }


    public void driveToNextPowerTargetShootingPosition() {
        if (!opModeIsActive()) return;

        // TODO: implement
        pauseMotors();
    }

    public void shootPowerTarget() {
        if (!opModeIsActive()) return;

        // TODO: implement
    }

    public void shootAllPowerTargets() {
        if (!opModeIsActive()) return;

        shootPowerTarget();

        for (int i = 0; i < 2; i++){
            driveToNextPowerTargetShootingPosition();
            shootPowerTarget();
        }
    }
}
