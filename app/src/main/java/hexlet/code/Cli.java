package hexlet.code;

import java.io.InputStreamReader;
import java.util.Scanner;

public class Cli {
    
    public static void greetings() {
        System.out.println("Welcome to the Brain Games!\nMay I have your name?");
        Scanner scanner = new Scanner(new InputStreamReader(System.in));
        String name = scanner.nextLine();
        System.out.printf("Hello, %s!%n", name);
    }
    
}
