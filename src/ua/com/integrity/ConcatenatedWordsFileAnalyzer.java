package ua.com.integrity;

import java.io.*;
import java.util.List;
import java.util.stream.Collectors;


public class ConcatenatedWordsFileAnalyzer {

    //IOException wrapped in the RuntimeException
    //don't need to catch a check exception
    public static ConcatenatedWordsStatistics analyze(String fileName) {
        try(BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            List<String> words = reader.lines().collect(Collectors.toList());
            ConcatenatedWordsAnalyzer analyzer = new ConcatenatedWordsAnalyzer(words);
            return ConcatenatedWordsStatisticsBuilder.aConcatenatedWordsStatistics()
                    .withCount(analyzer.getCount())
                    .withFileName(fileName)
                    .withLongerWord(analyzer.getLonger())
                    .withLongestWord(analyzer.getLongest())
                    .build();
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }
}
