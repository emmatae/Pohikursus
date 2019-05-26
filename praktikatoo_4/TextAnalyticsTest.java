import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class TextAnalyticsTest {

    @Test
    public void testIfReadFileExcists(){
        String testFileName = "/home/emmatae/public_html/2_semester/Programmeerimise_pohikursus/Mandatory_exercises/praktikatoo_4/test.txt";
        FileReading testfile = new FileReading(testFileName);
        String result = testfile.read_file();
        System.out.println(result);
        assertTrue(result != null);
    }

    @Test
    public void testIfReadFileIsWorking(){
        String testFileName = "/home/emmatae/public_html/2_semester/Programmeerimise_pohikursus/Mandatory_exercises/praktikatoo_4/test.txt";
        String expected = "neljas kodutoo";
        FileReading testfile = new FileReading(testFileName);
        String result = testfile.read_file();
        assertEquals(expected, result);
    }

    @Test
    public void testIfSplitWordsCountsRight(){
        String sPath =  "/home/emmatae/public_html/2_semester/Programmeerimise_pohikursus/Mandatory_exercises/praktikatoo_4/test.txt";
        String text = "neljas kodutoo";
        String[] textArray = text.split("\\s");
        FileReading testfile = new FileReading(sPath);
        String[] result = testfile.split_to_words();
        assertArrayEquals(textArray, result);
    }

    @Test
    public void testIfLowerCaseWorks(){
    String sPath =  "/home/emmatae/public_html/2_semester/Programmeerimise_pohikursus/Mandatory_exercises/praktikatoo_4/test.txt";
        FileReading testfile = new FileReading(sPath);
        String[] result = testfile.words_to_lowercase();
        assertTrue(result != null);
    }    


}