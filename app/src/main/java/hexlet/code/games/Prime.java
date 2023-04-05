package hexlet.code.games;

import hexlet.code.Engine;

import java.util.stream.IntStream;

public class Prime implements Game {

    @Override
    public String getRule() {
        return "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    }

    @Override
    public void generate() {
        int rand = (int) (Math.random() * 100);
        Engine.setQuestion(rand + "");
        Engine.setAnswer(isPrime(rand) ? "yes" : "no");
    }

    private boolean isPrime(int number) {
        return number > 1
                && IntStream.rangeClosed(2, (int) Math.sqrt(number))
                .noneMatch(n -> (number % n == 0));
    }
}
