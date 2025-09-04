//package org.firstinspires.ftc.teamcode;
//
//import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
//import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
//import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
//import com.qualcomm.robotcore.hardware.DcMotor;
//import com.qualcomm.robotcore.hardware.DcMotorEx;
//import com.qualcomm.robotcore.hardware.DcMotorSimple;
//import com.qualcomm.robotcore.util.ElapsedTime;
//
//@Autonomous
//public class eca27tk extends LinearOpMode {
//    DcMotorEx frontLeftMotor;
//    DcMotorEx backLeftMotor;
//    DcMotorEx frontRightMotor;
//    DcMotorEx backRightMotor;
//
//    public void reset() {
//        frontRightMotor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
//        backRightMotor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
//        frontLeftMotor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
//        backLeftMotor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
//    }
//
//    @Override
//    public void runOpMode() throws InterruptedException {
//        frontLeftMotor = hardwareMap.get(DcMotorEx.class, "fl");
//        backLeftMotor = hardwareMap.get(DcMotorEx.class, "bl");
//        frontRightMotor = hardwareMap.get(DcMotorEx.class, "fr");
//        backRightMotor = hardwareMap.get(DcMotorEx.class, "br");
//
//        frontLeftMotor.setDirection(DcMotorSimple.Direction.REVERSE);
//        backLeftMotor.setDirection(DcMotorSimple.Direction.REVERSE);
//
//        //front left
//        waitForStart();
//        frontLeftMotor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
//        frontLeftMotor.setTargetPosition(0);
//        frontLeftMotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
//
//        waitForStart();
//
//            //front right
//            waitForStart();
//        frontRightMotor.setTargetPosition(0);
//
//        reset();
//
//        frontRightMotor.setPower(0.3);
//        backRightMotor.setPower(0.3);
//        frontLeftMotor.setPower(0.3);
//        backLeftMotor.setPower(0.3);
//
//        frontRightMotor.setTargetPosition(400);
//        backRightMotor.setTargetPosition(400);
//        frontLeftMotor.setTargetPosition(400);
//        backLeftMotor.setTargetPosition(400);
//
//        frontRightMotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
//        backRightMotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
//        frontLeftMotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
//        backLeftMotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
//
//        reset();
//
//        frontRightMotor.setTargetPosition(400);
//        backRightMotor.setTargetPosition(400);
//        frontLeftMotor.setTargetPosition(400);
//        backLeftMotor.setTargetPosition(400);
//
//        frontRightMotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
//        backRightMotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
//        frontLeftMotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
//        backLeftMotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
//
//        while (frontLeftMotor.isBusy() ||
//                frontRightMotor.isBusy() ||
//                backRightMotor.isBusy() ||
//                backLeftMotor.isBusy()) {
//        }
//        {
//            frontRightMotor.setTargetPosition(400);
//            backRightMotor.setTargetPosition(400);
//            frontLeftMotor.setTargetPosition(400);
//            backLeftMotor.setTargetPosition(400);
//
//            frontRightMotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
//            backRightMotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
//            frontLeftMotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
//            backLeftMotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
//
//        while (frontLeftMotor.isBusy() ||
//                frontRightMotor.isBusy() ||
//                backRightMotor.isBusy() ||
//                backLeftMotor.isBusy()) {
//
//            frontRightMotor.setTargetPosition(400);
//            backRightMotor.setTargetPosition(400);
//            frontLeftMotor.setTargetPosition(400);
//            backLeftMotor.setTargetPosition(400);
//
//            frontRightMotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
//            backRightMotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
//            frontLeftMotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
//            backLeftMotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
//
//            while (frontLeftMotor.isBusy() ||
//                    frontRightMotor.isBusy() ||
//                    backRightMotor.isBusy() ||
//                    backLeftMotor.isBusy()) {
//            {
//
//                sleep(1000);
//
//
//                }
//            }
//        }
//    }
//    }