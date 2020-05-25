package ru.kpfu.itis.Samarin903;

public class Message {
    public void initialMessage() {
        System.out.println("Enter sequence and depth separated by space");
    }

    public void endMessage() {
        System.out.println("Sequence built");
    }
    public void numberException() {
        System.out.println("Enter the correct data");
    }

    public void incorrectDataMessage() {
        System.out.println("Enter 2 values: sequence and depth");
    }
}
