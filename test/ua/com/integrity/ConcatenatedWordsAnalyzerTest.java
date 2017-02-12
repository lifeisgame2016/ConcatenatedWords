package ua.com.integrity;

import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;


public class ConcatenatedWordsAnalyzerTest {

    private static ConcatenatedWordsAnalyzer analyzer;

    @BeforeClass
    public static void oneExectued(){
        String[] words = new String[]{"cat", "cats", "catsdogcats", "dog",
                "dogcatsdog", "hippopotamuses", "rat", "ratcatdogcat"};
        analyzer = new ConcatenatedWordsAnalyzer(Arrays.asList(words));
    }

    @Test
    public void theLongestConcatenatedWordTest() throws Exception {
        assertEquals("ratcatdogcat", analyzer.getLongest());
    }

    @Test
    public void theSecondLongestConcatenatedWordTest() throws Exception {
        assertEquals("catsdogcats", analyzer.getLonger());
    }

    @Test
    public void concatenatedWordCountTest() throws Exception {
        assertEquals(3, analyzer.getCount());
    }
}