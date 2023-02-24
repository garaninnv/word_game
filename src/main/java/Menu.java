import java.io.IOException;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) throws IOException {
        boolean startGame = true;
        Scanner scanner = new Scanner(System.in);
        String menuIn;
        while (startGame) {
            System.out.println("Меню игры");
            System.out.println("========================");
            System.out.println("1. Новая игра");
            System.out.println("2. Выход");
            System.out.println("========================");
            menuIn = scanner.next();
            if ((int) menuIn.charAt(0) == '2') {
                System.out.println("Игра окончена");
                startGame = false;
            } else if ((int) menuIn.charAt(0) == '1') {
                String[] chArray = Reader.getWord().split("");
                GoGame.go(chArray, scanner);
            } else
                System.out.println("Вы ввели не корректный пункт меню, повторите попытку");
        }
    }
}
