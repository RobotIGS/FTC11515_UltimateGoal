package org.firstinspires.ftc.teamcode.OpModes.PlayerControlled;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.robotcore.external.Telemetry;
import org.firstinspires.ftc.teamcode.HardwareMaps.BaseHardwareMap;
import org.firstinspires.ftc.teamcode.HardwareMaps.SingleMotorHardwareMap;

@TeleOp
public class SingleMotorTest extends OpMode {
    BaseHardwareMap robot;
    @Override
    public void init() {
        this.robot = new SingleMotorHardwareMap(hardwareMap);
    }

    @Override
    public void loop() {
        this.robot.motor_front_right.setPower(gamepad1.right_stick_y);

    }

}
