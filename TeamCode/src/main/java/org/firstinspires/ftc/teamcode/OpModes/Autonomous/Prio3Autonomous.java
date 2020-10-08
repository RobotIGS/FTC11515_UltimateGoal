package org.firstinspires.ftc.teamcode.OpModes.Autonomous;

public abstract class Prio3Autonomous extends BaseAutonomous {
    int starterStackHeight;

    public void run() {
        driveToStarterStack();

        starterStackHeight = generalTools.getStarterStackHeight();
        switch (starterStackHeight){
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

        driveToFirstPowerTargetShootingPosition();

        shootAllPowerTargets();

        driveToWhiteLine();
    }
}