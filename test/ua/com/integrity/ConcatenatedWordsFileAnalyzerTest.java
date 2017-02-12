package ua.com.integrity;

import org.junit.Test;


public class ConcatenatedWordsFileAnalyzerTest {
    @Test
    public void analyzeWithoutExceptions() throws Exception {
        ConcatenatedWordsStatistics statistics = ConcatenatedWordsFileAnalyzer.analyze("words.txt");
        System.out.println(statistics);
    }

}