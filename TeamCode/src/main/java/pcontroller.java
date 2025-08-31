import static org.firstinspires.ftc.robotcore.external.BlocksOpModeCompanion.hardwareMap;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorEx;

@TeleOp
public class pcontroller extends LinearOpMode {




    @Override
    public void runOpMode() throws InterruptedException {

        DcMotorEx pivot= hardwareMap.get(DcMotorEx.class, "fo");
        pivot.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        waitForStart();

        int targetposition = 200;

        while (opModeIsActive()){

            pivot.setPower(Math.abs(targetposition-pivot.getCurrentPosition())*0.01);
            telemetry.addData("currentposition",pivot.getCurrentPosition());
            telemetry.addData("power",(targetposition-pivot.getCurrentPosition())*0.01);
            telemetry.update();
        }


    }
}




