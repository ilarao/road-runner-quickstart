import com.acmerobotics.dashboard.config.Config;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorEx;

@TeleOp
@Config
public class pcontrollerrr extends LinearOpMode {
    public static int target = 150;

    public static double Weight = 0.001;

    @Override
    public void runOpMode() throws InterruptedException {
        DcMotorEx pivot = hardwareMap.get(DcMotorEx.class, "fl");
        pivot.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        int position = pivot.getCurrentPosition();

        int error = (target - position);
        int lastError = error;
        waitForStart();
        while(opModeIsActive()){
            error = (target - position);
            position = pivot.getCurrentPosition();

            double p = error*Weight;



            lastError = error;
        }


    }
    }

