package org.firstinspires.ftc.teamcode.OpModes.PlayerControlled;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DistanceSensor;

import org.firstinspires.ftc.robotcore.external.navigation.DistanceUnit;
import org.firstinspires.ftc.teamcode.HardwareMaps.BaseHardwareMap;
import org.firstinspires.ftc.teamcode.HardwareMaps.SensorHardwareMap;

@TeleOp
public class SensorTest extends OpMode {
    BaseHardwareMap robot;
    @Override
    public void init() { this.robot = new SensorHardwareMap(hardwareMap);

    }

    @Override
    public void loop() {
        this.robot.distanceSensor_left_down.getDistance(DistanceUnit.CM);
        this.robot.distanceSensor_left_up.getDistance(DistanceUnit.CM);
        this.robot.distanceSensor_right_up.getDistance(DistanceUnit.CM);
        this.robot.distanceSensor_right_down.getDistance(DistanceUnit.CM);
        telemetry.addData("Sensor left down:", robot.distanceSensor_left_down.getDistance(DistanceUnit.CM));
        telemetry.addData("Sensor left up:", robot.distanceSensor_left_up.getDistance(DistanceUnit.CM));
        telemetry.addData("Sensor right down:", robot.distanceSensor_right_down.getDistance(DistanceUnit.CM));
        telemetry.addData("Sensor right up:", robot.distanceSensor_right_up.getDistance(DistanceUnit.CM));
        telemetry.update();
    }
}
