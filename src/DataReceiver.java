import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

import static java.lang.Math.abs;

public class DataReceiver {
    public double[] receiveData(){
        while (true){
            try{
                Scanner scanner = new Scanner(System.in);
                System.out.println("You need to enter a segment [a;b].");
                System.out.print("Enter \"a\" value: ");
                double a = scanner.nextDouble();
                System.out.print("Enter \"b\" value: ");
                double b = scanner.nextDouble();
                if (b < a) throw new ArithmeticException();
                System.out.println("Enter the initial value of the partition number of the integration interval \"n\" : ");
                double n = scanner.nextDouble();
                double h = abs(a-b)/n;
                System.out.println("Please enter the precision e: ");
                double e = scanner.nextDouble();
                return new double[]{a,b,n,h,e};
            } catch (InputMismatchException inputMismatchException){
                System.err.println("Value must be a number! Try again!");
            } catch (NoSuchElementException noSuchElementException){
                System.err.println("Incorrect input.");
                System.exit(1);
            } catch (ArithmeticException arithmeticException){
                System.err.println("\"a\" value must be lower than \"b\" value. Try again.");
            }
        }
    }

    public int ChooseEquation(){
        while (true){
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Please choose the method: ");
                System.out.println("1) Rectangle Method \n" +
                        "2) Simpson Method\n" +
                        "3) Trapezoidal Method" );
                int number = scanner.nextInt();
                if(!(number == 1 || number == 2 || number == 3)) throw new InputMismatchException();
                return number;
            } catch (InputMismatchException inputMismatchException) {
                System.err.println("Value must be a number and within the scope! Try again!");
            } catch (NoSuchElementException noSuchElementException) {
                System.err.println("Incorrect input.");
                System.exit(1);
            }
        }
    }
}
