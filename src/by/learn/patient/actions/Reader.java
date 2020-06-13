package by.learn.patient.actions;

import java.util.Scanner;

public class Reader {
    public static String fromConsole() {
        Scanner buffer = new Scanner(System.in);
        return buffer.nextLine();
    }
}
