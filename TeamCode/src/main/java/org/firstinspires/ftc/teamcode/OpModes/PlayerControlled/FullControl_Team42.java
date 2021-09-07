package org.firstinspires.ftc.teamcode.OpModes.PlayerControlled;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import org.firstinspires.ftc.teamcode.HardwareMaps.BaseHardwareMap;
import org.firstinspires.ftc.teamcode.HardwareMaps.FullHardwareMap;
import org.firstinspires.ftc.teamcode.Tools.OmniWheel;
import org.firstinspires.ftc.teamcode.Tools.OmniwheelControl;
import org.firstinspires.ftc.teamcode.Tools.OrientationTools;

@TeleOp
public class FullControl_Team42 extends OpMode {
    BaseHardwareMap robot;
    OmniWheel omniwheel;
    OrientationTools orientationTools;
    OmniwheelControl omniwheelControl;
    boolean knopfGedrueckt = false;
    boolean motorLaeuft = false;
    double boost = 0;

    @Override
    public void init() {
        robot = new FullHardwareMap(hardwareMap);
        omniwheel = new OmniWheel(robot);
        // orientationTools = new OrientationTools(robot, this);
        omniwheelControl = new OmniwheelControl(robot, telemetry);
    }

    @Override
    public void loop() {

        //vorwerts, rückwerts, seitwerts, Rotation  -- mit boost
        if (gamepad1.left_stick_y < -0.8) {
            if (boost > -0.5) {
                boost -= 0.005 ;
            }
            omniwheel.setMotors(-(gamepad1.left_stick_y/2+boost), -gamepad1.right_stick_x/2,  -gamepad1.left_stick_x/2);
        } else if (gamepad1.left_stick_y <= 0) {
            boost = -(gamepad1.left_stick_y)*boost;
            omniwheel.setMotors(-(gamepad1.left_stick_y/2+boost), -gamepad1.right_stick_x/2,  -gamepad1.left_stick_x/2);
        } else {
            omniwheel.setMotors(-gamepad1.left_stick_y/2, -gamepad1.right_stick_x/2,  -gamepad1.left_stick_x/2);
        }


        // Sammelaparatur
        if (gamepad1.dpad_left) {
            robot.servo_collector.setPosition(0.8); // Einsammelaparatur herrunterfahren
        }
        if (gamepad1.dpad_right) {
            robot.servo_collector.setPosition(0); // Einsammelaparatur hochfahren (nur mit stützung)
        }


        // Ringe einsammeln
        robot.motor_collector.setPower(gamepad1.right_trigger);

        // Ringe befördern
        //robot.servo_conveyor.setPosition(gamepad1.right_trigger/2);

        if (gamepad1.left_trigger > 0.1) {
            if (!knopfGedrueckt) {
                if (!motorLaeuft) {
                    robot.servo_conveyor.setPosition(0.1);
                    motorLaeuft = true;
                } else {
                    robot.servo_conveyor.setPosition(0.5);
                    motorLaeuft = false;
                }
            }
        } else {
            knopfGedrueckt = false;
        }

        // flyingwheelcontrol (Schießen)
        if (gamepad1.right_bumper) {
            robot.motor_flyingwheel_left.setPower(1);
            robot.motor_flyingwheel_right.setPower(-1);
        } else if (gamepad1.left_bumper) {
            robot.motor_flyingwheel_left.setPower(0);
            robot.motor_flyingwheel_right.setPower(0);
        }

        // Armcontrol... (mit Buchstaben)

        if (gamepad1.y) { // Arm nach vorne (auf)
            robot.motor_gripper.setPower(0.5);
        } else if (gamepad1.a) { // Arm nach hinten (zu)
            robot.motor_gripper.setPower(-0.5);
        } else {
            robot.motor_gripper.setPower(0);
        }
        if (gamepad1.b) { // Greifhand auf
            robot.servo_gripper.setPosition(0.9);
        }
        if (gamepad1.x) { // Greifhand zu
            robot.servo_gripper.setPosition(0.6);
        }

        telemetry.addData("boost", boost);
        telemetry.update();
    }
}