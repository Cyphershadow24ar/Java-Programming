import java.util.*;
public class StringAnalysis {
    public static void main(String[] args) {
        // Input string (you can change or take from Scanner)
        String str = "Java is easy and Java is powerful";
        // Remove leading/trailing spaces and convert to lowercase
        str = str.trim();
        // Count characters (excluding spaces)
        int charCount = str.replace(" ", "").length();
        // Split words using space
        String[] words = str.split("\\s+"); // one or more spaces
        int wordCount = words.length;
        // Frequency using HashMap
        Map<String, Integer> freqMap = new HashMap<>();
        for (String word : words) {
            word = word.toLowerCase(); // optional: for case-insensitive count
            freqMap.put(word, freqMap.getOrDefault(word, 0) + 1);
        }

        // Output results
        System.out.println("Original String: " + str);
        System.out.println("Number of characters (excluding spaces): " + charCount);
        System.out.println("Number of words: " + wordCount);
        System.out.println("\nWord Frequencies:");
        for (Map.Entry<String, Integer> entry : freqMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
