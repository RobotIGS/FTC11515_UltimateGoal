package org.firstinspires.ftc.teamcode.OpModes.PlayerControlled;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import org.firstinspires.ftc.teamcode.HardwareMaps.BaseHardwareMap;
import org.firstinspires.ftc.teamcode.HardwareMaps.FullHardwareMap;
import org.firstinspires.ftc.teamcode.Tools.OmniWheel;

@TeleOp
public class FullControl extends OpMode {
    BaseHardwareMap robot;
    OmniWheel omniwheel;

    @Override
    public void init() {
        robot = new FullHardwareMap(hardwareMap);
        omniwheel = new OmniWheel(robot);
    }

    @Override
    public void loop() {
        if (gamepad1.b) {
            robot.motor_flyingwheel_left.setPower(1);
            robot.motor_flyingwheel_right.setPower(-1);
        } else if (gamepad1.a) {
            robot.motor_flyingwheel_left.setPower(0);
            robot.motor_flyingwheel_right.setPower(0);
        }

        if (gamepad1.dpad_left){
            robot.servo_conveyor.setPosition(0.5); // conveyor aus
            robot.motor_collector.setPower(0);
        }
        else if (gamepad1.dpad_up) {
            robot.servo_conveyor.setPosition(0); // conveyor forwaerts
            robot.motor_collector.setPower(1);
        }
        else if (gamepad1.dpad_down) {
            robot.servo_conveyor.setPosition(1); // conveyor rueckwaerts
            robot.motor_collector.setPower(-1);
        }


        omniwheel.setMotors(gamepad1.left_stick_y, gamepad1.left_stick_x, gamepad1.right_stick_x);
        double[] result = OmniWheel.calculate(
                gamepad1.left_stick_y,
                gamepad1.left_stick_x,
                gamepad1.right_stick_x);

        telemetry.addData("fl", result[0]);
        telemetry.addData("fr", result[1]);
        telemetry.addData("rl", result[2]);
        telemetry.addData("rr", result[3]);
        telemetry.update();
    }
}
