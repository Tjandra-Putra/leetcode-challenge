import java.util.*;

public class Experimental {
    public static void main(String[] args) {
        String[] anagrams = {"eat", "tea", "tan", "ate", "nat", "bat"};

        System.out.println(groupAnagrams(anagrams));
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> groupedAnagrams = new HashMap<>();
        List<List<String>> result = new ArrayList<>();

        for (String word : strs) {
            // sort the word
            char[] splitWordArr = word.toCharArray();
            Arrays.sort(splitWordArr);
            String sortedWord = new String(splitWordArr);

            // check if exist in hashmap
            if (groupedAnagrams.containsKey(sortedWord)) {
                groupedAnagrams.get(sortedWord).add(word);
            } else {
                // create new key value pair -> String : List
                List<String> tempArr = new ArrayList<>();
                tempArr.add(word);

                groupedAnagrams.put(sortedWord, tempArr);
            }
        }

        // iterate through the hashmap and get the values
        for (Map.Entry<String, List<String>> entry : groupedAnagrams.entrySet()) {
            result.add(entry.getValue());
        }

        return result;
    }

}
