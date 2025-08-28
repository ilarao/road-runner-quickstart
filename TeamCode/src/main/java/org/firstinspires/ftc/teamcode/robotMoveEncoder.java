package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.util.ElapsedTime;

@Autonomous
public class robotMoveEncoder extends LinearOpMode {

    private ElapsedTime timer = new ElapsedTime();
    public void runOpMode() throws InterruptedException {
        DcMotorEx frontLeftMotor = hardwareMap.get(DcMotorEx.class, "fl");
        DcMotorEx backLeftMotor = hardwareMap.get(DcMotorEx.class, "bl");
        DcMotorEx frontRightMotor = hardwareMap.get(DcMotorEx.class, "fr");
        DcMotorEx backRightMotor = hardwareMap.get(DcMotorEx.class, "br");

        frontLeftMotor.setDirection(DcMotorSimple.Direction.REVERSE);
        backLeftMotor.setDirection(DcMotorSimple.Direction.REVERSE);

        waitForStart();

        frontLeftMotor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        frontRightMotor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        backRightMotor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        backLeftMotor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);

        frontLeftMotor.setTargetPosition(0);
        frontRightMotor.setTargetPosition(0);
        backRightMotor.setTargetPosition(0);
        backLeftMotor.setTargetPosition(0);

        frontLeftMotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        frontRightMotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        backRightMotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        backLeftMotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);


        frontLeftMotor.setPower(0.5);
        frontRightMotor.setPower(0.5);
        backRightMotor.setPower(0.5);
        backLeftMotor.setPower(0.5);


        frontLeftMotor.setTargetPosition(300);
        frontRightMotor.setTargetPosition(300);
        backRightMotor.setTargetPosition(300);
        backLeftMotor.setTargetPosition(300);

        while (frontLeftMotor.isBusy() ||
                frontRightMotor.isBusy() ||
                backRightMotor.isBusy() ||
                backLeftMotor.isBusy()) {
        }


        frontLeftMotor.setTargetPosition(300);
        frontRightMotor.setTargetPosition(-300);
        backRightMotor.setTargetPosition(-300);
        backLeftMotor.setTargetPosition(300);

        while (frontLeftMotor.isBusy() ||
                frontRightMotor.isBusy() ||
                backRightMotor.isBusy() ||
                backLeftMotor.isBusy()) {
        }

        frontLeftMotor.setTargetPosition(-300);
        frontRightMotor.setTargetPosition(-300);
        backRightMotor.setTargetPosition(-300);
        backLeftMotor.setTargetPosition(-300);

        while (frontLeftMotor.isBusy() ||
                frontRightMotor.isBusy() ||
                backRightMotor.isBusy() ||
                backLeftMotor.isBusy()) {
        }

            frontLeftMotor.setTargetPosition(-300);
            frontRightMotor.setTargetPosition(300);
            backRightMotor.setTargetPosition(300);
            backLeftMotor.setTargetPosition(-300);

            while (frontLeftMotor.isBusy() ||
                    frontRightMotor.isBusy() ||
                    backRightMotor.isBusy() ||
                    backLeftMotor.isBusy()) {
            }

        }
    }
