package hexlet.code;

public class Cli {
    public static String name;

    public static void greetings() {
        System.out.println("Welcome to the Brain Games!\nMay I have your name?");
        name = App.getScanner().nextLine();
        System.out.printf("Hello, %s!%n", name);
    }

    public static String getName() {
        return name;
    }
}
