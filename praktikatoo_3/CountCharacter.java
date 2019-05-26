package proov;

public class CountCharacter implements Interface{    
  public String read_file(String path){
    Path file_path = Paths.get(path);
    String file_content = "";
    try {
        byte[] file_content_in_bytes = Files.readAllBytes(file_path);
        String file_content_str = new String(file_content_in_bytes, StandardCharsets.UTF_8);
        file_content = file_content_str;

    } catch (IOException my_error_variable) {
        my_error_variable.printStackTrace();
    }
    return file_content;


  }
  public String[] split_to_words(String file_content){
    String[] array_of_words = this.file_content.split(" ");
    return array_of_words;

  }

  public String[] words_to_lowercase(String[] array_of_words){
      for (int i = 0; i < array_of_words.length; i++) {
          array_of_words[i] =  this.array_of_words[i].toLowerCase();
      }
      return array_of_words;
  }
    public int countLongerThan(String[] Arrayofwords){
      int count = 0;    
              
      for (String word : Arrayofwords) {
        if(word.length() > 1)
          count++;
        
      }
      System.out.println("Total number of characters in a string: " + count);
      return count;
    }
  }