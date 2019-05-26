package Interface;

public interface FileInterface {
    public String read_file(String path);
    public String[] split_to_words(String text);
    public String[] words_to_lowercase(String[] wordArray);
    public int countLongerThan(String[] wordArray, int letterCount);
}
