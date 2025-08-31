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

    DcMotorEx frontLeftMotor;
    DcMotorEx backLeftMotor;
    DcMotorEx frontRightMotor;
    DcMotorEx backRightMotor;

    public void reset() {
        frontLeftMotor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        frontRightMotor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        backRightMotor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        backLeftMotor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
    }

    public void runtoposition(){
        frontLeftMotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        frontRightMotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        backRightMotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        backLeftMotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);


        frontLeftMotor.setPower(0.2);
        frontRightMotor.setPower(0.2);
        backRightMotor.setPower(0.2);
        backLeftMotor.setPower(0.2);
    }


    private ElapsedTime timer = new ElapsedTime();
    public void runOpMode() throws InterruptedException {
       frontLeftMotor = hardwareMap.get(DcMotorEx.class, "fl");
       backLeftMotor = hardwareMap.get(DcMotorEx.class, "bl");
       frontRightMotor = hardwareMap.get(DcMotorEx.class, "fr");
       backRightMotor = hardwareMap.get(DcMotorEx.class, "br");

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


        frontLeftMotor.setPower(0.2);
        frontRightMotor.setPower(0.2);
        backRightMotor.setPower(0.2);
        backLeftMotor.setPower(0.2);


        frontLeftMotor.setTargetPosition(300);
        frontRightMotor.setTargetPosition(300);
        backRightMotor.setTargetPosition(300);
        backLeftMotor.setTargetPosition(300);

        runtoposition();

        while (frontLeftMotor.isBusy() ||
                frontRightMotor.isBusy() ||
                backRightMotor.isBusy() ||
                backLeftMotor.isBusy()) {
        }
        reset();

        frontLeftMotor.setTargetPosition(300);
        frontRightMotor.setTargetPosition(-300);
        backRightMotor.setTargetPosition(-300);
        backLeftMotor.setTargetPosition(300);

        runtoposition();

        while (frontLeftMotor.isBusy() ||
                frontRightMotor.isBusy() ||
                backRightMotor.isBusy() ||
                backLeftMotor.isBusy()) {
        }
        reset();

        frontLeftMotor.setTargetPosition(300);
        frontRightMotor.setTargetPosition(300);
        backRightMotor.setTargetPosition(300);
        backLeftMotor.setTargetPosition(300);

        runtoposition();

        while (frontLeftMotor.isBusy() ||
                frontRightMotor.isBusy() ||
                backRightMotor.isBusy() ||
                backLeftMotor.isBusy()) {
        }
        reset();

        frontLeftMotor.setTargetPosition(300);
        frontRightMotor.setTargetPosition(-300);
        backRightMotor.setTargetPosition(-300);
        backLeftMotor.setTargetPosition(300);

        runtoposition();

        while (frontLeftMotor.isBusy() ||
                frontRightMotor.isBusy() ||
                backRightMotor.isBusy() ||
                backLeftMotor.isBusy()) {
        }
        reset();

        frontLeftMotor.setTargetPosition(300);
        frontRightMotor.setTargetPosition(300);
        backRightMotor.setTargetPosition(300);
        backLeftMotor.setTargetPosition(300);

        runtoposition();

        while (frontLeftMotor.isBusy() ||
                frontRightMotor.isBusy() ||
                backRightMotor.isBusy() ||
                backLeftMotor.isBusy()) {
        }
        reset();

        frontLeftMotor.setTargetPosition(300);
        frontRightMotor.setTargetPosition(-300);
        backRightMotor.setTargetPosition(-300);
        backLeftMotor.setTargetPosition(300);

        runtoposition();

        while (frontLeftMotor.isBusy() ||
                frontRightMotor.isBusy() ||
                backRightMotor.isBusy() ||
                backLeftMotor.isBusy()) {
        }
        reset();



        frontLeftMotor.setTargetPosition(300);
        frontRightMotor.setTargetPosition(300);
        backRightMotor.setTargetPosition(300);
        backLeftMotor.setTargetPosition(300);

        runtoposition();

        while (frontLeftMotor.isBusy() ||
                frontRightMotor.isBusy() ||
                backRightMotor.isBusy() ||
                backLeftMotor.isBusy()) {
        }
        reset();

        }
    }
