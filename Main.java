import static java.lang.Math.*;

public class Main {

    //метод для создания первого одномерного массива
    public static short[] zedki() {
        return new short[]{16,15,14,13,12,11,10,9,8,7,6,5,4,3};
    }

    //метод для создания второго массива со случайными числами
    public static float[] iksi() {
        float[] x = new float[16];
        for (short i = 0; i < x.length; i++) {
            x[i] = ((float) random()*25.0f)-12.0f;
        }
        return x;
    }

    //далее 3 метода для счёта элементов третьего массива в зависимости от получаемого значения
    public static double k4(double x) {
        return atan(cos(cos(sin(x))));
    }


    public static double k38(double x) {
        return pow(log(pow(PI / 2.0 * abs(x), 2)), 3);
    }


    public static double kdef(double x) {
        return sin(asin(cos(pow(1.0 / 3.0 + pow(0.5 * x, 2), tan(x)))));
    }

    //метод получающий на вход два массива и на их основе создающий двумерный массив
    public static double[][] massiv(short[] z, float[] x) {
        double[][] Z = new double[14][16];
        for (short i = 0; i < 14; i++) {
            for (short j = 0; j < 16; j++) {
                switch (z[i]) {
                    case 4->
                        Z[i][j] = k4(x[j]);
                    case 3, 8, 9, 11, 12, 14, 16->
                        Z[i][j] = k38(x[j]);
                    default ->
                        Z[i][j] = kdef(x[j]);

                }
            }
        }
        return(Z);
    }
    //метод, который выводит полученный двумерный массив
    public static void vivod(double[][] Z) {
        for (short i = 0; i < 14; i++) {
            for (short j = 0; j < 16; j++) {
                System.out.printf("%10.5f", Z[i][j]);
            }
            System.out.println();
        }
    }

//метод который всё это собирает
    public static void main(String[] args) {
        short[] z=zedki();
        float[] x=iksi();
        double[][] z1=massiv(z,x);
        vivod(z1);

        if (1==1) {
            System.out.println();
        }


        }
    }

