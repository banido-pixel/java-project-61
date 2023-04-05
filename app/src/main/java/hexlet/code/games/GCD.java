package hexlet.code.games;

import hexlet.code.Engine;

public class GCD implements Game {

    @Override
    public String getRule() {
        return "Find the greatest common divisor of given numbers.";
    }

    @Override
    public void generate() {
        int first = (int) (Math.random() * 100);
        int second = (int) (Math.random() * 100);
        Engine.setQuestion(first + " " + second);
        Engine.setAnswer(getGCD(Math.max(first, second), Math.min(first, second)) + "");
    }

    private int getGCD(int first, int second) {
        if (second == 0) {
            return first;
        }
        return getGCD(second, first % second);
    }
}
