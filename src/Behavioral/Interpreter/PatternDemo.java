package Behavioral.Interpreter;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternDemo {
    public static void main(String[] args) {
        String input = "Lions and tigers, and bears!";

        Pattern p = Pattern.compile("(lion|cat|dog|wolf|bear|tiger|liger|Lion)");
        Matcher m = p.matcher(input);
        while (m.find()) {
            System.out.println("Found a " + m.group() + ".");
        }
        // Case sensitive => no lion
        // can change regex for upper and lower case
    }
}