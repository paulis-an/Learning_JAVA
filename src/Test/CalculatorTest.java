package Test;
import java.util.Scanner;
public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Calculator calc = new Calculator();
        String answer = "да";

            while (answer.equals("да")) {
                calc.computation();
                calc.calculate();
                do {
                    System.out.println("Хотите продолжить вычисления? [да/нет]:");
                    answer = scan.next();

                } while (!answer.equals("да") && !answer.equals("нет"));
            }
        }
    }



