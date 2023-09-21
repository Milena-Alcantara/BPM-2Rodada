package challengeThree;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FibonacciSequence {
    public static void main(String[] args) {
        boolean repeat = true;
        do {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Informe o número que deseja localizar a posição Fibonacci: ");
                int number = scanner.nextInt();

                if (number < 0) {
                    System.out.println("Não é possível verificar números negativos. ");
                    throw new InputMismatchException();

                } else {
                    System.out.println("Posicão Fibonacci: " + fibonacciPosition(number));
                    repeat = false;
                }
            } catch (InputMismatchException err) {
                System.err.println("Por favor, informe apenas números inteiros. ");
            }
        } while (repeat);

    }

    public static int fibonacciPosition(int inputNumber) {
        int fibonacci1 = 0;
        int fibonacci2 = 1;
        int fibonacciFinal = 0;

        for (int i = 1; i <= inputNumber; i++) {
            fibonacciFinal = fibonacci1 + fibonacci2;
            fibonacci2 = fibonacci1;
            fibonacci1 = fibonacciFinal;
        }

        return fibonacciFinal;
    }
}
