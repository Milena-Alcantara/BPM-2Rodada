package challengeTwo;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.TimeZone;


public class TimeConversion {
    public static void main(String[] args) {
        boolean repeat = true;
        do {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Digite um número para ser convertido em data: ");
                long timeInSeconds = scanner.nextInt();

                long milliseconds = timeInSeconds * 1000;

                Date dateFomatter = new Date(milliseconds);

                SimpleDateFormat dateFormeddate = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
                dateFormeddate.setTimeZone(TimeZone.getTimeZone("UTC"));

                System.out.println("Data: " + dateFormeddate.format(dateFomatter));

                repeat = false;

            } catch (InputMismatchException err) {
                System.err.println("Por favor, informe apenas números.");
            }

        } while (repeat);

    }
}
