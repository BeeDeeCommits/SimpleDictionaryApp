import java.util.Scanner;
public class Run {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SimpleDictionary dictionary = new SimpleDictionary();
        TextUI userInterface = new TextUI(scanner, dictionary);
        userInterface.start();
    }
}
