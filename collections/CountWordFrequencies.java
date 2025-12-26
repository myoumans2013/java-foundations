package collections;

import java.util.HashMap;

public class CountWordFrequencies {
     public static HashMap<String, Integer> countWordFrequencies(String string) {
        HashMap<String, Integer> map = new HashMap<>();
        String lowercase = string.toLowerCase();
        String cleaned = lowercase.replaceAll("[^a-z\\s ]", "");

        for (String word : cleaned.split("\\s+")) {
            if (word.isEmpty()) {
                continue;
            }
            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            } else {
                map.put(word, 1);
            }
        }

        return map;
    }

    public static void main(String[] args) {
        String string = "My house is a house on the side of the block where my house is.";
        HashMap<String, Integer> result = countWordFrequencies(string);
        for (String word : result.keySet()) {
            System.out.println(word + " : " +  result.get(word));
        }
    }
}
