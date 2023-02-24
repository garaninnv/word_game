import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class GoGame {
    public static void go(String[] secretWordLetters, Scanner scanner) {
        String ch;
        HashSet<String> misspelledLetters = new HashSet<>();
        int errorCount = 0;
        String[] wordMask = new String[secretWordLetters.length];
        for (int i = 0; i < wordMask.length; i++) {
            wordMask[i] = "__";
        }
        System.out.println("У вас есть 6 попыток угадать буквы, из которых состоит загаданное слово");
        System.out.println(Arrays.toString(wordMask));
        while (!Arrays.equals(secretWordLetters, wordMask) && errorCount < 7) {
            ch = scanner.next().toLowerCase();
            if (!misspelledLetters.contains(ch)) {
                boolean incorrectGuess = true;
                misspelledLetters.add(ch);
                for (int i = 0; i < secretWordLetters.length; i++) {
                    if (ch.equals(secretWordLetters[i])) {
                        wordMask[i] = ch;
                        incorrectGuess = false;
                    }
                }
                if (incorrectGuess) {
                    errorCount++;
                }
            }
            Gallows.print(errorCount);
            System.out.println("неудачных попыток " + errorCount);
            System.out.println("Отгадываемое слово " + Arrays.toString(wordMask));
        }
        System.out.println("Правильное слово " + Arrays.toString(secretWordLetters));
        System.out.println("Конец игры");
    }


}
