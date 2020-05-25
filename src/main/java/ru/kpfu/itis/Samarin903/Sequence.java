package ru.kpfu.itis.Samarin903;

public class Sequence {
    private String initialSequence;
    private int depth;
    private static String output;


    public Sequence(String initialSequence, int depth) {
        this.initialSequence = initialSequence;
        this.depth = depth;
    }

    public void init() {
        System.out.println(initialSequence);
        output = initialSequence;
        for (int i = 0; i < depth; i++) {
            char currentChar = output.charAt(0);
            int outputLength = output.length();
            String newOutput = "";
            int currentCharIndex = 0;
            for (int j = 0; j < output.length(); j++) {

                if( output.charAt(j) != currentChar) {
                    newOutput = newOutput + (j - currentCharIndex ) +currentChar;
                    currentChar = output.charAt(j);
                    currentCharIndex = j;
                }

            }

            newOutput = newOutput + ( outputLength - currentCharIndex) + currentChar;
            output = newOutput;
            System.out.println(newOutput);
        }
        new Message().endMessage();
    }

    public String getInitialSequence() {
        return initialSequence;
    }

    public int getDepth() {
        return depth;
    }

    public String getOutput() {
        return output;
    }
}
