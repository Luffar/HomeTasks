package Task8;

import java.util.*;
import java.util.stream.Collectors;

public class Smash {
    public static String firstUpperCase(String word){
        if(word == null || word.isEmpty())
            return "";
        return word.substring(0, 1).toUpperCase() + word.substring(1);
    }

    public static void main(String[] args) {

        String programmingLanguagesName = "java, python, java, c#, ruby, python, c++, ruby";
        String[] words = programmingLanguagesName.split(", ");
        Set<String> items = new HashSet<>(Arrays.asList(words));
        for (String s:items){
            System.out.println(firstUpperCase(s));
        }
    }
}
