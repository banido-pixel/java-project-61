package hexlet.code;

import hexlet.code.games.Game;

public class Engine {

    protected static final int POINTS_TO_WIN = 3;

    private static String question;

    private static String answer;

    public static void start(Game game) {
        if (Cli.getName() == null) {
            Cli.greetings();
        }
        System.out.println(game.getRule());
        int points = 0;
        while (points < POINTS_TO_WIN) {
            game.generate();
            System.out.println("Question: " + question);
            String userAnswer = App.getScanner().nextLine();
            if (answer.equals(userAnswer)) {
                System.out.println("Correct!");
            } else {
                System.out.printf("""
                        '%s' is wrong answer ;(. Correct answer was '%s'.
                        Let's try again, %s!
                        """, userAnswer, answer, Cli.getName());
                break;
            }
            points++;
        }
        if (points == POINTS_TO_WIN) {
            System.out.printf("Congratulations, %s!", Cli.getName());
        }
    }

    public static void setQuestion(String question) {
        Engine.question = question;
    }

    public static void setAnswer(String answer) {
        Engine.answer = answer;
    }
}
