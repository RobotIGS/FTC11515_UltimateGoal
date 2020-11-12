package org.firstinspires.ftc.teamcode.OpModes.PlayerControlled;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.teamcode.HardwareMaps.BaseHardwareMap;
import org.firstinspires.ftc.teamcode.HardwareMaps.SingleMotorHardwareMap;

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

        }

    }
}
