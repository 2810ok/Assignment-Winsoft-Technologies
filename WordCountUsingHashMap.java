import java.util.HashMap;

public class WordCountUsingHashMap {
    public static void main(String[] args) {
        String sentence = "Hello world, this is omkar vaidya!";
        HashMap<String, Integer> wordCountMap = countWords(sentence);
        System.out.println("Word Count:");
        for (String word : wordCountMap.keySet()) {
            System.out.println(word + " : " + wordCountMap.get(word));
        }
    }

    public static HashMap<String, Integer> countWords(String sentence) {
        HashMap<String, Integer> wordCountMap = new HashMap<>();
        String[] words = sentence.split("\\s+");
        for (String word : words) {
            word = word.replaceAll("[^a-zA-Z0-9]", "").toLowerCase(); 
            if (!word.isEmpty()) {
                wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
            }
        }
        return wordCountMap;
    }
}
