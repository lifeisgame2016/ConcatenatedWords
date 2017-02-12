package ua.com.integrity;


public final class ConcatenatedWordsStatisticsBuilder {
    private String fileName;
    private String longestWord;
    private String longerWord;
    private int count;

    //Builder pattern for the object creation
    private ConcatenatedWordsStatisticsBuilder() {
    }

    public static ConcatenatedWordsStatisticsBuilder aConcatenatedWordsStatistics() {
        return new ConcatenatedWordsStatisticsBuilder();
    }

    public ConcatenatedWordsStatisticsBuilder withFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }

    public ConcatenatedWordsStatisticsBuilder withLongestWord(String longestWord) {
        this.longestWord = longestWord;
        return this;
    }

    public ConcatenatedWordsStatisticsBuilder withLongerWord(String longerWord) {
        this.longerWord = longerWord;
        return this;
    }

    public ConcatenatedWordsStatisticsBuilder withCount(int count) {
        this.count = count;
        return this;
    }

    public ConcatenatedWordsStatistics build() {
        ConcatenatedWordsStatistics concatenatedWordsStatistics = new ConcatenatedWordsStatistics();
        concatenatedWordsStatistics.setFileName(fileName);
        concatenatedWordsStatistics.setLongestWord(longestWord);
        concatenatedWordsStatistics.setLongerWord(longerWord);
        concatenatedWordsStatistics.setCount(count);
        return concatenatedWordsStatistics;
    }
}
