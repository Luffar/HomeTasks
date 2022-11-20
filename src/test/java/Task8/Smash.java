package Task8;

import java.util.*;
import java.util.stream.Collectors;

public class Smash {
    public static void main(String[] args) {
        String programmingLanguagesName = "java, python, java, c#, ruby, python, c++, ruby";
        firstUpperCase(programmingLanguagesName);
    }

    private static void firstUpperCase(String programmingLanguagesName) {
        String[] words = programmingLanguagesName.split(", ");
        Set<String> items = new HashSet<>(Arrays.asList(words));
        for (String s:items){
            s = s.substring(0, 1).toUpperCase() + s.substring(1);
            System.out.println(s);
        }
    }
}
