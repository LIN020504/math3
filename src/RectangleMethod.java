
import static java.lang.Math.*;
public class RectangleMethod {
    DataReceiver receiver = new DataReceiver();
    double[] receiveData = receiver.receiveData();
    double a = receiveData[0];
    double b = receiveData[1];
    double n = receiveData[2];
    double h = receiveData[3];
    double e = receiveData[4];

    double sum = 0;
    double printh = 0;

    double m = 0;
    int model;
    public void calculation_left() {
        double all;
        Equation equation = new Equation();
        double accu = 10;
        double all1 = 0;
        while (accu > e) {
            double printa = a;
            double printm = 0;
            sum = 0;
            printh = abs((a - b)) / n;
            System.out.println("The h is: " + printh);
            System.out.println("Divided into " + n + " intervals");
            System.out.println("i      xi      yi  ");
            for (double num = 1; num <= n; num++) {
                printm = equation.equation(printa);
                sum = sum + printm;
                System.out.printf("%.1f    %.3f     %.3f%n", num, printa, equation.equation(printa));
                printa = printa + printh;
            }
            all = printh * sum;
            System.out.println("Answer on the left side is: " + all);
            accu = abs(all-all1)/3;
            all1 = all;
            System.out.println("The accuracy is: " + accu);
            n = n *2;
            System.out.println("");
        }
    }

    public void calculation_right() {
        double all;
        Equation equation = new Equation();
        double accu = 10;
        double all1 = 0;
        while (accu > e) {
            printh = abs((a - b)) / n;
            double printa = a + printh;
            double printm = 0;
            sum = 0;
            System.out.println("The h is: " + printh);
            System.out.println("Divided into " + n + " intervals");
            System.out.println("i      xi      yi  ");
            for (double num = 1; num <= n; num++) {
                printm = equation.equation(printa);
                sum = sum + printm;
                System.out.printf("%.1f    %.3f     %.3f%n", num, printa, equation.equation(printa));
                printa = printa + printh;
            }
            all = printh * sum;
            System.out.println("Answer on the right side is: " + all);
            accu = abs(all-all1)/3;
            all1 = all;
            System.out.println("The accuracy is: " + accu);
            n = n *2;
            System.out.println("");
        }
    }

    public void calculation_mid() {
        double all;
        Equation equation = new Equation();
        double accu = 10;
        double all1 = 0;
        while (accu > e) {
            printh = abs((a - b)) / n;
            double printa = a + printh/2;
            double printm = 0;
            sum = 0;
            System.out.println("The h is: " + printh);
            System.out.println("Divided into " + n + " intervals");
            System.out.println("i      xi      yi  ");
            for (double num = 1; num <= n; num++) {
                printm = equation.equation(printa);
                sum = sum + printm;
                System.out.printf("%.1f    %.3f     %.3f%n", num, printa, equation.equation(printa));
                printa = printa + printh;
            }
            all = printh * sum;
            System.out.println("Answer on the right side is: " + all);
            accu = abs(all-all1)/3;
            all1 = all;
            System.out.println("The accuracy is: " + accu);
            n = n *2;
            System.out.println("");
        }
    }
}
