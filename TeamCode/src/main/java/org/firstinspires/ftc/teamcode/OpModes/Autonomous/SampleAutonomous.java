package org.firstinspires.ftc.teamcode.OpModes.Autonomous;

import org.firstinspires.ftc.teamcode.Tools.ColorEnum;

public class SampleAutonomous extends BaseAutonomous {
    @Override
    public ColorEnum getAllianceColor() {
        return ColorEnum.Red;
    }

    @Override
    public void run() {
        doStuff();
    }
}
