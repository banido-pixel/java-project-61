package hexlet.code;

import java.io.InputStreamReader;
import java.util.Scanner;

public class Cli {
    private static String name;

    private static Scanner scanner;

    private static final String GAMES_INFO = """
            Please enter the game number and press Enter.
            1 - Greet
            2 - Even
            0 - Exit""";

    private static final int POINTS_TO_WIN = 3;

    public static void start() {
        scanner = new Scanner(new InputStreamReader(System.in));
        try {
            boolean toExit = false;
            while (!toExit) {
                System.out.println(GAMES_INFO);
                String choice = scanner.nextLine();
                switch (choice) {
                    case ("1") -> greetings();
                    case ("2") -> evenGame();
                    case ("0") -> toExit = true;
                    default -> {
                    }
                }
            }
        } finally {
            scanner.close();
        }
    }

    private static void greetings() {
        System.out.println("Welcome to the Brain Games!\nMay I have your name?");
        name = scanner.nextLine();
        System.out.printf("Hello, %s!%n", name);
    }

    private static void evenGame() {
        if (name == null) {
            greetings();
        }
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        int points = 0;
        while (points < POINTS_TO_WIN) {
            int rand = (int) (Math.random() * 100);
            System.out.println("Question: " + rand);
            String correct = rand % 2 == 0 ? "yes" : "no";
            String answer = scanner.nextLine();
            if (correct.equals(answer)) {
                System.out.println("Correct!");
            } else {
                System.out.printf("""
                        '%s' is wrong answer ;(. Correct answer was '%s'.
                        Let's try again, %s!
                        """, answer, correct, name);
                break;
            }
            points++;
        }
        if (points == POINTS_TO_WIN) {
            System.out.printf("Congratulations, %s!", name);
        }
    }
}
