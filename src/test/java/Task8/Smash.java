package Task8;

import java.util.*;
import java.util.stream.Collectors;

public class Smash {
    public static void firstUpperCase(String word) {
        String[] words = word.split(", ");
        Set<String> items = new HashSet<>(Arrays.asList(words));
        for (String s : items) {
            System.out.println(s);
        }
    }
    public static String ss (String str){
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }

    public static void main(String[] args) {
        String programmingLanguagesName = "java, python, java, c#, ruby, python, c++, ruby";
        firstUpperCase(ss(programmingLanguagesName));
    }
}
