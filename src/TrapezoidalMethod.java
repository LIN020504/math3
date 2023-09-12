import static java.lang.Math.abs;

public class TrapezoidalMethod {
    DataReceiver receiver = new DataReceiver();
    double[] receiveDate = receiver.receiveData();
    double a = receiveDate[0];
    double b = receiveDate[1];
    double n = receiveDate[2];
    double h = receiveDate[3];

    double e = receiveDate[4];
    //double m = 0;
    double sum = 0;
    double printh = 0;

    public void calculation() {
        Equation equation = new Equation();
        double start = (equation.equation(a) + equation.equation(b)) / 2;
        double accu = 10;
        double all1 = 0;
        while (accu > e) {
            double printa = a;
            double printm = 0;
            sum = 0;
            printh = abs((a - b)) / n;
            System.out.println("The h is: " + printh);
            System.out.println("Divided into " + n + " intervals");
            System.out.println("i      xi      yi ");
            for (double num = 0; num <= n; num++) {
                printm = equation.equation(printa);
                sum = sum + printm;
                System.out.printf("%.1f    %.3f    %.3f%n", num, printa, equation.equation(printa));
                printa = printa + printh;
            }
            double all = printh * (sum - start);
            System.out.println("Answer of Trapezoidal method is: " + all);
            accu = abs(all-all1)/3;
            all1 = all;
            System.out.println("The accuracy is: " + accu);
            n = n *2;
            System.out.println("");
        }
    }
}

