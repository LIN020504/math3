import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        DataReceiver receiver = new DataReceiver();
        int equationNumber = receiver.ChooseEquation();
        Scanner scanner = new Scanner(System.in);
        if (equationNumber == 1){
            while (true) {
                try {
                    RectangleMethod rectangleMethod = new RectangleMethod();
                    System.out.println("Please choose the type of Rectangle Method: ");
                    System.out.println("1) Left\n" +
                            "2) Right\n" +
                            "3) Mid\n");
                    int number1 = scanner.nextInt();
                    if (!(number1 == 1 || number1 == 2 || number1 == 3)) throw new InputMismatchException();
                    if (number1 ==1 ){
                        rectangleMethod.calculation_left();
                    } else if (number1 == 2){
                        rectangleMethod.calculation_right();
                    } else if (number1 == 3){
                        rectangleMethod.calculation_mid();
                    }break;
                } catch (InputMismatchException inputMismatchException) {
                    System.err.println("Value must be a number and within the scope! Try again!");
                } catch (NoSuchElementException noSuchElementException) {
                    System.err.println("Incorrect input.");
                    System.exit(1);
                }
            }
        } else if (equationNumber == 2 ){
        SimpsonMethod simpsonMethod = new SimpsonMethod();
            simpsonMethod.calculation();
        } else if (equationNumber == 3){
        TrapezoidalMethod trapezoidalMethod = new TrapezoidalMethod();
            trapezoidalMethod.calculation();
        }
    }
}
