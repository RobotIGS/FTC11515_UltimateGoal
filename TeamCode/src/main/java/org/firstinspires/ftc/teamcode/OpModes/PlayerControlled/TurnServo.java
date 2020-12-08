package org.firstinspires.ftc.teamcode.OpModes.PlayerControlled;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

import org.firstinspires.ftc.teamcode.HardwareMaps.BaseHardwareMap;
import org.firstinspires.ftc.teamcode.HardwareMaps.SingleMotorHardwareMap;
@TeleOp ( name = "motortest" )
public class TurnServo extends OpMode {

    private CRServo peter;
    @Override
    public void init(){
        peter = hardwareMap.get(CRServo.class, "servo_1");
    }

    @Override
    public void loop(){

        /*if (gamepad1.a == true) {
            peter.motor_front_right.setPower(1);                                                                               

        }else {
        peter.motor_front_right.setPower(0);
        }*/


        peter.setPower(gamepad1.left_stick_y);

    }

}
