package hexlet.code.games;

import hexlet.code.Engine;

public class Progression implements Game{
    
    private static final int SIZE = 10;

    @Override
    public String getRule() {
        return "What number is missing in the progression?";
    }

    @Override
    public void generate() {
        int position = (int) (Math.random() * SIZE);
        int addition = (int) (Math.random() * 100);
        int start = (int) (Math.random() * 10);
        int answer = 0;
        StringBuilder builder = new StringBuilder(start + " ");
        for (int i = 0; i < SIZE; i++) {
            start+= addition;
            if (i != position) {
                builder.append(start).append(" ");
            } else {
                answer = start;
                builder.append(".. ");
            }
        }
        Engine.setQuestion(builder.toString());
        Engine.setAnswer(answer + "");
    }
}
