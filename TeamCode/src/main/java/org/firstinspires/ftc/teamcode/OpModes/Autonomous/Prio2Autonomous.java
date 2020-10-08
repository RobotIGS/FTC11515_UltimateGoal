package org.firstinspires.ftc.teamcode.OpModes.Autonomous;

public abstract class Prio2Autonomous extends BaseAutonomous {
    public void run() {
        driveToWhiteLine();

        driveToBehindWhiteLine();

        driveToFirstPowerTargetShootingPosition();

        shootAllPowerTargets();

        driveToWhiteLine();
    }
}
