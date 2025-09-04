package org.firstinspires.ftc.teamcode;

import com.acmerobotics.dashboard.config.Config;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorEx;

@TeleOp
@Config
public class pcontrollerlibrary extends LinearOpMode {




    @Override
    public void runOpMode() throws InterruptedException {

        DcMotorEx pivot= hardwareMap.get(DcMotorEx.class, "arm");
        pivot.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        waitForStart();

        int targetposition = 200;

        while (opModeIsActive()){

            telemetry.addData("currentposition",pivot.getCurrentPosition());
            telemetry.addData("power",(targetposition-pivot.getCurrentPosition())*0.01);
            telemetry.update();
        }


    }
}




