package org.firstinspires.ftc.teamcode.OpModes.PlayerControlled;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

import org.firstinspires.ftc.teamcode.HardwareMaps.BaseHardwareMap;
import org.firstinspires.ftc.teamcode.HardwareMaps.SingleMotorHardwareMap;
@TeleOp ( name = "motortest" )
public class TurnMotors extends OpMode {
    BaseHardwareMap peter;
    @Override
    public void init(){
        peter = new SingleMotorHardwareMap(hardwareMap);
    }

    @Override
    public void loop(){

        if (gamepad1.a == true) {
            peter.motor_front_right.setPower(1);                                                                               

        }else {
        peter.motor_front_right.setPower(0);
        }
        

        if (gamepad1.b) {
            peter.servo_1.setPower(0.5);
        }
    }

}
