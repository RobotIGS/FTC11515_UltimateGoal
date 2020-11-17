package org.firstinspires.ftc.teamcode.OpModes.PlayerControlled;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import org.firstinspires.ftc.teamcode.HardwareMaps.BaseHardwareMap;
import org.firstinspires.ftc.teamcode.HardwareMaps.FullHardwareMap;

@TeleOp
public class FullControl extends OpMode {
    BaseHardwareMap robot;

    @Override
    public void init() {
        this.robot = new FullHardwareMap(hardwareMap);
    }

    @Override
    public void loop() {
        robot.motor_conveyor.setPower(gamepad1.right_stick_y);

        if (gamepad1.b) {
            robot.motor_shooter_left.setPower(1);
            robot.motor_shooter_right.setPower(-1);
        } else {
            robot.motor_shooter_left.setPower(0);
            robot.motor_shooter_right.setPower(0);
        }
    }
}
