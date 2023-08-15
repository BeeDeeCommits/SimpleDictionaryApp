import java.util.ArrayList;

public class SimpleDictionary {
    private String word;
    private String translation;
    private ArrayList<String[]> dictionary;

    public SimpleDictionary() {
        this.dictionary = new ArrayList<>();
    }

    public void add(String word, String translation) {
        String[] entry = {word, translation};
        dictionary.add(entry);
    }

    public String translate(String word) {
        for (String[] entry: this.dictionary) {
            if (entry[0].equals(word)) {
                return "Meaning: " + entry[1];
            }
        }
        return "Word " + word + " was not found.";
    }
}
