package hexlet.code;

public class EvenGame {

    private static final int POINTS_TO_WIN = 3;

    public static void start() {
        if (Cli.getName() == null) {
            Cli.greetings();
        }
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        int points = 0;
        while (points < POINTS_TO_WIN) {
            int rand = (int) (Math.random() * 100);
            System.out.println("Question: " + rand);
            String correct = rand % 2 == 0 ? "yes" : "no";
            String answer = App.getScanner().nextLine();
            if (correct.equals(answer)) {
                System.out.println("Correct!");
            } else {
                System.out.printf("""
                        '%s' is wrong answer ;(. Correct answer was '%s'.
                        Let's try again, %s!
                        """, answer, correct, Cli.getName());
                break;
            }
            points++;
        }
        if (points == POINTS_TO_WIN) {
            System.out.printf("Congratulations, %s!", Cli.getName());
        }
    }
}
