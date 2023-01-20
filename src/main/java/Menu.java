import java.io.IOException;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) throws IOException {
        boolean startGame = true;
        Scanner scanner = new Scanner(System.in);
        String menuIn;
        while (startGame) {
            System.out.println("Game menu");
            System.out.println("========================");
            System.out.println("1. New game");
            System.out.println("2. Exit");
            System.out.println("========================");
            menuIn = scanner.next();
            if ((int)menuIn.charAt(0) == 50) {
                System.out.println("Game over");
                startGame = false;
            } else if ((int)menuIn.charAt(0) == 49) {
                String[] chArray = Reader.word().split("");
                GoGame.go(chArray, scanner);
            } else
                System.out.println("Вы ввели не корректный пункт меню, повторите попытку");
        }
    }
}
