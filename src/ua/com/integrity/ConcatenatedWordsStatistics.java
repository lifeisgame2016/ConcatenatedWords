package ua.com.integrity;


public class ConcatenatedWordsStatistics {
    private String fileName;
    private String longestWord;
    private String longerWord;
    private int count;

    // It's POJO
    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getLongestWord() {
        return longestWord;
    }

    public void setLongestWord(String longestWord) {
        this.longestWord = longestWord;
    }

    public String getLongerWord() {
        return longerWord;
    }

    public void setLongerWord(String longerWord) {
        this.longerWord = longerWord;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "ConcatenatedWordsStatistics{" +
                "fileName='" + fileName + '\'' +
                ", longestWord='" + longestWord + '\'' +
                ", longerWord='" + longerWord + '\'' +
                ", count=" + count +
                '}';
    }
}
