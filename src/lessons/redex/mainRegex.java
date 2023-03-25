package lessons.redex;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class mainRegex {
    public static void main(String[] args) {

        String str = "Hello I am 28 years old ";
        Pattern pattern = Pattern.compile("[0-9]+");
        Matcher matcher = pattern.matcher(str);
//        System.out.println(matcher);

        String answer = matcher.replaceAll("0");
        System.out.println(answer);

        System.out.println(matcher.find());
        System.out.println(matcher.group());




//        String[] strings = str.split("\\d");
//        System.out.println(Arrays.toString(strings));
//        String resualt = str.replaceAll("[\\d]+", "{it was numbers her}");
//        System.out.println(resualt);
    }
}
