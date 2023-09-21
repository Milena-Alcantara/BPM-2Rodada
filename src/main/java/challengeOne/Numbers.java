package challengeOne;

import java.util.*;

public class Numbers {
    public static void main(String[] args) {
        boolean repeat = false;
        do {
            try {
                Scanner scanner = new Scanner(System.in);
                List<Integer> pairNumbers = new ArrayList<>();
                List<Integer> oddNumbers = new ArrayList<>();
                int number;

                System.out.println("Informe seus números: ");
                for (int i = 1; i <= 10; i++) {
                    number = scanner.nextInt();
                    if (number < 0) {
                        System.out.println("Não podemos receber números negativos!");
                        number = scanner.nextInt();
                    } else if (number % 2 == 0) {
                        pairNumbers.add(number);
                    } else {
                        oddNumbers.add(number);
                    }
                }

                System.out.println("Exibindo números pares em ordem crescente: ");
                for (int pairNumber : pairNumbers) {
                    System.out.println(pairNumber);
                }

                System.out.println();
                System.out.println("Exibindo números impáres em ordem decrescente: ");
                Collections.sort(oddNumbers, Collections.reverseOrder());
                for (int oddNumber : oddNumbers) {
                    System.out.println(oddNumber);
                }

                repeat = false;

            } catch (InputMismatchException err) {
                System.err.println("Por favor, informe somente números inteiros. ");
                repeat = true;
            }
        } while (repeat);

    }

}
