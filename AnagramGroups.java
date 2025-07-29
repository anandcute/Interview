import java.util.*;

public class AnagramGroups {
    public static List<List<String>> groupAnagrams(String[] words) {
        Map<String, List<String>> anagramMap = new HashMap<>();
        
        for (String word : words) {
            // Sort the word to create a key for grouping anagrams
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String sortedWord = new String(chars);
            
            // Add the word to the corresponding anagram group
            anagramMap.computeIfAbsent(sortedWord, k -> new ArrayList<>()).add(word);
            System.out.println("map : "+anagramMap);
        }
        
        // Collect and return the anagram groups as a list of lists
        return new ArrayList<>(anagramMap.values());
    }
    
    public static void main(String[] args) {
        String[] words = {"tea", "ate", "eat", "bat", "ton", "not"};
        List<List<String>> result = groupAnagrams(words);
        
        System.out.println(result);
    }
}
 
