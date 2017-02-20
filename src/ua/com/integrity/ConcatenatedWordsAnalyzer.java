package ua.com.integrity;

import java.util.*;


public class ConcatenatedWordsAnalyzer {

    private String longest;
    private String longer;
    private int count;

    private Set<String> words;

    // create new set to avoid side-effect and improve performance
    public ConcatenatedWordsAnalyzer(List<String> words) {
        this.words = new HashSet<>(words);
        analyze();
    }

    private void analyze() {
        int count = 0;
        for (String word : words) {
            if (isConcatenated(word, true)) {
                assignLongest(word);
                count++;
            }
        }
        this.count = count;
    }

    //Possible to improve method with PriorityQueue usage,
    //but there is no need to use it only for two top elements
    private void assignLongest(String word) {
        if (longest == null || longer == null) {
            if (longest == null)
                longest = word;
            else {
                if (word.length() > longest.length()) {
                    longer = longest;
                    longest = word;
                } else {
                    longer = word;
                }
            }
        } else {
            if (word.length() > longest.length()) {
                longer = longest;
                longest = word;
            } else if (word.length() > longer.length()) {
                longer = word;
            }
        }
    }

    //Compound word or not
    private boolean isConcatenated(String word, boolean skip) {
        if (!skip && words.contains(word)) {
            return true;
        }
        //split word
        for (int i = 1; i < word.length(); i++) {
            String left = word.substring(0, i);
            String right = word.substring(i);
            if (words.contains(left) && isConcatenated(right, false))
                return true;
        }
        return false;
    }

    public String getLongest() {
        return longest;
    }

    public String getLonger() {
        return longer;
    }

    public int getCount() {
        return count;
    }
}