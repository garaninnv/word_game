import java.util.Arrays;
import java.util.Scanner;

public class GoGame {
    public static void go (String[] arString, Scanner scanner) {
        String ch;
        int count = 0;
        String [] arOut = new String[arString.length];
        System.out.println("You have 6 attempts to guess the letters that make up the hidden word");
        System.out.println(Arrays.toString(arOut));
        while (!arString.equals(arOut) && count < 7) {
            ch = scanner.next();
            boolean incCount = true;

            for (int i = 0; i < arString.length; i++) {
                if (ch.equals(arString[i])) {
                    arOut[i] = ch;
                    incCount = false;
                }
            }

            if (incCount) {
                count++;
            }

            Gallows.print(count);
            System.out.println("неудачных попыток " + count);
            System.out.println("Отгадываемое слово " + Arrays.toString(arOut));
        }
        System.out.println("Правильное слово " + Arrays.toString(arString));
        System.out.println("Конец игры");
    }
}
