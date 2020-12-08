package org.firstinspires.ftc.teamcode.OpModes.PlayerControlled;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.CRServo;

import org.firstinspires.ftc.teamcode.HardwareMaps.SampleHardwareMap;

@TeleOp (name = "driveau")
public class TestRoboter extends OpMode {
    private SampleHardwareMap simplemap;
    @Override
    public void init(){
        simplemap = new SampleHardwareMap(hardwareMap);

    }

    @Override

    public void loop(){
        //forword backword
      if (gamepad1.left_stick_y !=0){
          simplemap.motor_front_left.setPower(-gamepad1.left_stick_y);
          simplemap.motor_front_right.setPower(gamepad1.left_stick_y);
      }
        //side reft right
        if (gamepad1.left_stick_x !=0) {
           simplemap.motor_middle.setPower(gamepad1.left_stick_x);
         //turn left
        }
       if (gamepad1.left_trigger !=0){
           simplemap.motor_front_left.setPower(gamepad1.left_trigger);
           simplemap.motor_front_right.setPower(gamepad1.left_trigger);
       }
        //turn right
        if (gamepad1.right_trigger !=0){
            simplemap.motor_front_left.setPower(-gamepad1.right_trigger);
            simplemap.motor_front_right.setPower(-gamepad1.right_trigger);
        }

        else{
            simplemap.motor_front_left.setPower(0);
            simplemap.motor_front_right.setPower(0);
            simplemap.motor_middle.setPower(0);
        }

    }
}
