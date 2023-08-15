import java.util.Scanner;

public class TextUI {
    Scanner scanner;
    SimpleDictionary dictionary;

    public TextUI(Scanner scanner, SimpleDictionary dictionary) {
        this.scanner = scanner;
        this.dictionary = dictionary;
    }

    public void start() {
        boolean canRun = true;
        String word;
        while(canRun) {
            System.out.println("Enter a command: ");
            String userInput = this.scanner.nextLine();
            switch (userInput.toLowerCase()) {
                case "add":
                    System.out.println("Enter a word: ");
                    word = this.scanner.nextLine();
                    System.out.println("Enter a translation: ");
                    String translation = this.scanner.nextLine();
                    this.dictionary.add(word, translation);
                    break;
                case "end":
                    canRun = false;
                    break;
                case "search":
                    System.out.println("Enter word to be translated: ");
                    word = this.scanner.nextLine();
                    System.out.println(this.dictionary.translate(word));
                    break;
                default:
                    System.out.println("Unknown Command");
            }
        }
    }
}
