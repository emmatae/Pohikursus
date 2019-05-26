import java.util.Arrays;

public class Program{
    public static void main(String[] args) {
        TextAnalytics text = new TextAnalytics("C:\\Users\\Student Admin\\Desktop\\tekst.txt");
        System.out.println(Arrays.toString(text.array_of_words));
    }
}
