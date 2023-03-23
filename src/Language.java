public class Language {
    String language;
    Language(String a){
        language = a;
        System.out.println(language + " is a language.");
    }
    public static void main(String[] args) {
        Language l = new Language("Sinhala");
        Language l1 = new Language("English");
        Language l2 = new Language("Tamil");
    }
}


