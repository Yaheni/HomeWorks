import java.util.*;
public class FourthHomeWork {
    public static HashMap<String, String> getRussianLettersIntoEnglish () {
        HashMap<String, String> russianIntoEnglish = new HashMap<>();
        russianIntoEnglish.put("а", "a");
        russianIntoEnglish.put("б", "b");
        russianIntoEnglish.put("в", "v");
        russianIntoEnglish.put("г", "g");
        russianIntoEnglish.put("д", "d");
        russianIntoEnglish.put("е", "e");
        russianIntoEnglish.put("ё", "e");
        russianIntoEnglish.put("ж", "zh");
        russianIntoEnglish.put("з", "z");
        russianIntoEnglish.put("и", "i");
        russianIntoEnglish.put("й", "i");
        russianIntoEnglish.put("к", "k");
        russianIntoEnglish.put("л", "l");
        russianIntoEnglish.put("м", "m");
        russianIntoEnglish.put("н", "n");
        russianIntoEnglish.put("о", "o");
        russianIntoEnglish.put("п", "p");
        russianIntoEnglish.put("р", "r");
        russianIntoEnglish.put("с", "s");
        russianIntoEnglish.put("т", "t");
        russianIntoEnglish.put("у", "u");
        russianIntoEnglish.put("ф", "f");
        russianIntoEnglish.put("х", "h");
        russianIntoEnglish.put("ц", "c");
        russianIntoEnglish.put("ч", "ch");
        russianIntoEnglish.put("ш", "sh");
        russianIntoEnglish.put("щ", "sch");
        russianIntoEnglish.put("э", "e");
        russianIntoEnglish.put("ю", "yu");
        russianIntoEnglish.put("я", "ya");
        russianIntoEnglish.put(" ", " ");
        return russianIntoEnglish;
    }

    public static String transriptFromRussianIntoEnglish(String word) {
        String[] lettersArray = word.split("");
        ArrayList<String> result = new ArrayList();
        for (int i = 0; i < lettersArray.length; i++) {
            result.add(getRussianLettersIntoEnglish().get(lettersArray[i].toLowerCase()));
        }
        String resultString = String.join("", result);
        return resultString;
    }

    public static void main (String[] args) {
        System.out.println(transriptFromRussianIntoEnglish("Четвёртая домашняя работа"));
    }
}
