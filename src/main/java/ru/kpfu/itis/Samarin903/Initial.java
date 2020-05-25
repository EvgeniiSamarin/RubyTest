package ru.kpfu.itis.Samarin903;

import java.util.Scanner;

public class Initial {
    private static Message initialMessage;
    private static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        initialMessage = new Message();
        initialMessage.initialMessage();
        String string = scanner.nextLine();
        String[] sequence  = string.split(" ");
        if(sequence.length != 2) {
            initialMessage.incorrectDataMessage();
        }
        try {
            new Sequence(sequence[0], Integer.parseInt(sequence[1])).init();
            Sequence sequence1 = new Sequence("1", 5);
        } catch (NumberFormatException ex) {
            initialMessage.numberException();
        }
    }
}
