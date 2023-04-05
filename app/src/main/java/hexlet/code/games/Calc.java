package hexlet.code.games;

import hexlet.code.Engine;

public class Calc implements Game {

    private final int[] operations = new int[]{0, 1, 2};

    @Override
    public String getRule() {
        return "What is the result of the expression?";
    }

    @Override
    public void generate() {
        int operation = (int) (Math.random() * ((operations.length) + 1));
        int first = (int) (Math.random() * 100);
        int second = (int) (Math.random() * 100);

        switch (operation) {
            case 0 -> {
                Engine.setQuestion(first + " + " + second);
                Engine.setAnswer((first + second) + "");
            }
            case 1 -> {
                Engine.setQuestion(first + " - " + second);
                Engine.setAnswer((first - second) + "");
            }
            case 2 -> {
                Engine.setQuestion(first + " * " + second);
                Engine.setAnswer((first * second) + "");
            }
            default -> {
            }
        }
    }
}
