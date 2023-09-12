import static java.lang.Math.abs;

public class SimpsonMethod {
    DataReceiver receiver = new DataReceiver();
    double[] receiveData = receiver.receiveData();
    double a = receiveData[0];
    double b = receiveData[1];

    double n = receiveData[2];

    double h = receiveData[3];
    double e = receiveData[4];
    Equation equation = new Equation();

    double sum;
    double printh = 0;

    public void calculation() {
        double accu = 10;
        double all1 = 0;
        while (accu > e) {
            double m1 = 0;
            double m2 = 0;
            sum = 0;
            double printa = a;
            double printm = 0;
            printh = abs((a - b)) / n;
            System.out.println("The h is: " + printh);
            System.out.println("Divided into " + n + " intervals");
            System.out.println("i      xi      yi");

            for (double c = printa + printh; c < b; c += 2 * printh) {
                m1 = m1 + equation.equation(c);
            }
            for (double c = printa + 2 * printh; c < b; c += 2 * printh) {
                m2 = m2 + equation.equation(c);
            }

            for (double num = 0; num <= n; num++) {
                printm = equation.equation(printa);
                sum = sum + printm;
                //double all = (equation.equation(printa) + equation.equation(b) + 4 * m1 + 2 * m2) * printh / 3;
                System.out.printf("%.1f    %.3f     %.3f%n", num, printa, equation.equation(printa));
                printa = printa + printh;
            }
            double all = (equation.equation(printa) + equation.equation(b) + 4 * m1 + 2 * m2) * printh / 3;
            System.out.println("The answer of Simpson method is: " + all);
            accu = abs(all - all1)/15;
            System.out.println("The accuracy is: " + accu);
            all1 = all;
            n = n*2;
            System.out.println("");
        }
    }
}
