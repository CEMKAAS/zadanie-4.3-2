import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordsChecker {
    private String text;

    public WordsChecker(String text) {
        this.text = text;
    }

    boolean hasWord(String word) {
        Set<String> set = new HashSet<>();
        String[] infoText = text.split("\\P{IsAlphabetic}+");
        set.addAll(List.of(infoText));
        if (set.contains(word)) {
            return true;
        }
        return false;
    }
}
