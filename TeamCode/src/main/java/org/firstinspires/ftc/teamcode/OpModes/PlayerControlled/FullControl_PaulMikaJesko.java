package org.firstinspires.ftc.teamcode.OpModes.PlayerControlled;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.HardwareMaps.BaseHardwareMap;
import org.firstinspires.ftc.teamcode.HardwareMaps.FullHardwareMap;
import org.firstinspires.ftc.teamcode.Tools.ColorTools;
import org.firstinspires.ftc.teamcode.Tools.OmniWheel;

@TeleOp
public class FullControl_PaulMikaJesko extends OpMode {
    BaseHardwareMap robot;
    OmniWheel omniwheel;
    ColorTools colorTools;

    @Override
    public void init() {
        robot = new FullHardwareMap(hardwareMap);
        omniwheel = new OmniWheel(robot);
        colorTools = new ColorTools();
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
        if(gamepad1.left_trigger>0){
            robot.motor_front_left.setPower(-gamepad1.left_trigger);
            robot.motor_front_right.setPower(gamepad1.left_trigger);
            robot.motor_rear_left.setPower(-gamepad1.left_trigger);
            robot.motor_rear_right.setPower(gamepad1.left_trigger);
        }
        if(gamepad1.right_trigger>0){
            robot.motor_front_left.setPower(gamepad1.right_trigger);
            robot.motor_front_right.setPower(-gamepad1.right_trigger);
            robot.motor_rear_left.setPower(gamepad1.right_trigger);
            robot.motor_rear_right.setPower(-gamepad1.right_trigger);
        }
        if(gamepad1.x){
            robot.motor_gripper.setPower(1);
        }
        robot.motor_gripper.setPower(0);
        if(gamepad1.y){
            robot.servo_conveyor.setPosition(1);
        }
        robot.motor_gripper.setPower(0);

        omniwheel.setMotors(gamepad1.left_stick_y, gamepad1.left_stick_x, 0);

        telemetry.addData("weiss:", colorTools.isWhite(robot.colorSensor_right));
        float[] hsv = colorTools.showHSV(robot.colorSensor_right);
        telemetry.addData("h:", hsv[0]);
        telemetry.addData("s:", hsv[1]);
        telemetry.addData("v:", hsv[2]);
        telemetry.addData("rot:", colorTools.isRed(robot.colorSensor_right));
        telemetry.update();

        if (gamepad1.right_bumper){
            robot.servo_gripper.setPosition(1);
        }
        if (gamepad1.left_bumper){
            robot.servo_gripper.setPosition(0);
        }
        if (gamepad1.dpad_up){
            robot.motor_gripper.setPower(1);
        }
        if (gamepad1.dpad_down){
            robot.motor_gripper.setPower(-1);
        }
    }


}
