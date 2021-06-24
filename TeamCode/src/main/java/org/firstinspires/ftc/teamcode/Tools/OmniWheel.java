package org.firstinspires.ftc.teamcode.Tools;

import org.firstinspires.ftc.teamcode.HardwareMaps.BaseHardwareMap;

public class OmniWheel {
    BaseHardwareMap robot;

    public OmniWheel(BaseHardwareMap robot) {
        this.robot = robot;
    }

    public void setMotors(double forwardVelocity, double sidewardsVelocity, double rotationVelocity) {
        double[] result = OmniWheel.calculate(
                forwardVelocity,
                sidewardsVelocity,
                rotationVelocity);

        robot.motor_front_left.setPower(result[0]);
        robot.motor_front_right.setPower(result[1]);
        robot.motor_rear_left.setPower(result[2]);
        robot.motor_rear_right.setPower(result[3]);
    }

    public static double[] matrixMultiply(double[][] a, double[] x) {
        int m = a.length;
        int n = a[0].length;
        if (x.length != n) throw new RuntimeException("Illegal matrix dimensions.");
        double[] y = new double[m];
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                y[i] += a[i][j] * x[j];
            }
        }
        return y;
    }

    /**
     * If a value in the array is bigger than 1 or lower than -1, round to the nearest value in -1,1.
     *
     * @param originalValues
     * @return array of new values
     */
    public static double[] maxToOne(double[] originalValues) {
        double[] outputValues = {0,0,0,0};
        for (int i = 0; i < originalValues.length; i++) {
            if (originalValues[i] <= 1 && originalValues[i] >= -1) {
                outputValues[i] = originalValues[i];
            } else if (originalValues[i] >= -1) {
                outputValues[i] = -1;
            } else {
                outputValues[i] = 1;
            }
        }
        return outputValues;
    }

    /**
     * Calculate omniwheel speeds, see http://zero.sci-hub.tw/2288/7b6d38e6cae805b5a249205a2a290b1b/10.1007@978-3-540-70534-5.pdf#page=159
     *
     * @param forwardVelocity vehicle velocity in forward direction
     * @param sidewardsVelocity vehicle velocity in sideways direction
     * @param rotationVelocity  vehicle rotational velocity
     * @return a array of wheel-speeds
     */
    public static double[] calculate(double forwardVelocity, double sidewardsVelocity, double rotationVelocity) {
        double[][] wheel_matrix = {
                {-1, -1, -1},
                {-1,  1, 1},
                {-1,  1, -1},
                {-1, -1, 1}
        };
        double[] velocities = {forwardVelocity, sidewardsVelocity, rotationVelocity};
        double[] mat_multiplied = matrixMultiply(wheel_matrix, velocities);

        double[] wheel_speeds = new double[mat_multiplied.length];
        for (int i = 0; i < mat_multiplied.length; i++){
            if (i==1 || i == 3){
                wheel_speeds[i] = mat_multiplied[i];
            } else {
                wheel_speeds[i] = -mat_multiplied[i];
            }
        }
        //return maxToOne(wheel_speeds);
        return wheel_speeds;
    }
}
