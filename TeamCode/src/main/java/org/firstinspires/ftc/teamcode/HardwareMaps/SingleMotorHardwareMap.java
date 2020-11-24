package org.firstinspires.ftc.teamcode.HardwareMaps;

import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

public class SingleMotorHardwareMap extends BaseHardwareMap {
    public SingleMotorHardwareMap(HardwareMap hwMap) {
        super(hwMap);
    }

    @Override
    public void init(HardwareMap hwMap) {
        this.motor_front_right = hwMap.get(DcMotor.class, "hub1_motorport0");
        this.servo_1 = hwMap.get(CRServo.class, "hub1_servoport2");
    }
}