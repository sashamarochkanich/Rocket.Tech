package test;

import org.junit.Assert;
import org.junit.Test;
import task_1.DistinctWords;
import java.util.Set;

public class DistinctWordsTest {

    @Test
    public void testGetDistinctWordList(){
        DistinctWords distinctWords = new DistinctWords("Lorem Ipsum.txt");
        Assert.assertEquals(153, distinctWords.getDistinctWordList().size());
    }

    @Test
    public void testGetDistinctWordListSmallFile(){
        DistinctWords distinctWords = new DistinctWords("SmallFile.txt");
        Assert.assertEquals(4, distinctWords.getDistinctWordList().size());
    }

    @Test
    public void testGetDistinctWordListSmallFileValue(){
        DistinctWords distinctWords = new DistinctWords("SmallFile.txt");
        String[] expectedArray = {"tESt", "tTESt", "teESt", "tESSTt"};
        Set<String> wordList = distinctWords.getDistinctWordList();
        for (String expectedValue: expectedArray){
            Assert.assertTrue(wordList.contains(expectedValue));
        }
    }
}
