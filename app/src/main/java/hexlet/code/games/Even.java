package hexlet.code.games;

import hexlet.code.Engine;

public class Even implements Game {

    @Override
    public String getRule() {
        return "Answer 'yes' if the number is even, otherwise answer 'no'.";
    }

    @Override
    public void generate() {
        int rand = (int) (Math.random() * 100);
        Engine.setQuestion(rand + "");
        Engine.setAnswer(rand % 2 == 0 ? "yes" : "no");
    }
}
