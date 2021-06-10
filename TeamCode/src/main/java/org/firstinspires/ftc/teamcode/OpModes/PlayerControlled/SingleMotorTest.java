package org.firstinspires.ftc.teamcode.OpModes.PlayerControlled;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.HardwareMaps.BaseHardwareMap;
import org.firstinspires.ftc.teamcode.HardwareMaps.FullHardwareMap;

@TeleOp
public class SingleMotorTest extends OpMode {
    BaseHardwareMap robot;
    @Override
    public void init() {
        robot = new FullHardwareMap(hardwareMap);
    }

    @Override
    public void loop() {
        robot.motor_front_left.setPower(this.gamepad1.right_stick_y);

        if (this.gamepad1.a) {  // wenn knopf a gedrückt
            robot.motor_rear_left.setPower(1); // schalte den motor an
        } else { // wenn knopf a NICHT gedrückt
            robot.motor_rear_left.setPower(0); // schalte den motor aus
        }
    }
}
