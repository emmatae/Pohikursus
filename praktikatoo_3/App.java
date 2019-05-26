class App{

    public static void main(String[] args) {
        CountCharacter loendur = new CountCharacter();
        String text = loendur.read_file("C:\\Users\\Student Admin\\Desktop\\proov\\tekst.txt");
        String[] massiiv = loendur.split_to_words(text);
        massiiv = loendur.words_to_lowercase(massiiv);
        int num = loendur.countLongerThan(massiiv);
        System.out.println(num);
    }
  }
