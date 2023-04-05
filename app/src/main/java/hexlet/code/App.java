package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;

import java.io.InputStreamReader;
import java.util.Scanner;

public class App {

    private static Scanner scanner;
    private static final String GAMES_INFO = """
            Please enter the game number and press Enter.
            1 - Greet
            2 - Even
            3 - Calc
            4 - GCD
            0 - Exit""";

    public static void main(String[] args) {
        start();
    }

    public static void start() {
        scanner = new Scanner(new InputStreamReader(System.in));
        boolean toExit = false;
        while (!toExit) {
            System.out.println(GAMES_INFO);
            String choice = scanner.nextLine();
            switch (choice) {
                case ("1") -> Cli.greetings();
                case ("2") -> Engine.start(new Even());
                case ("3") -> Engine.start(new Calc());
                case ("4") -> Engine.start(new GCD());
                case ("0") -> toExit = true;
                default -> {
                }
            }
        }
        scanner.close();
    }

    public static Scanner getScanner() {
        return scanner;
    }
}
