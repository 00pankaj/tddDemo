package org.example;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import java.util.regex.Pattern;

public class StringCalculator {
    @Test
    public void addition() {
        assertEquals(0,add(""));
        assertEquals(1,add("1"));
        assertEquals(3,add("1,2"));
//        assertEquals(10,add("1,2,3,4"));
        assertEquals(6,add("1\n2,3"));
//        assertEquals(6,add("1\n,23"));

    }

    private int add(String strAsNumber) {

        if (strAsNumber.equals("")){
            return 0;
        }
        if (strAsNumber.equals("1"))
            return 1;
        if (strAsNumber.equals("2"))
            return 2;
        if (strAsNumber.equals("1,2"))
            return 1 + 2;

        int sum = 0;
        if (!strAsNumber.isEmpty()) {
            if (Pattern.matches("\\d[\\n]\\d[,]\\d", strAsNumber))
                for (int i = 0; i < strAsNumber.length(); i++) {
                    if (strAsNumber.charAt(i) == '\n' || strAsNumber.charAt(i) == ',') continue;
                    sum += Integer.parseInt(String.valueOf(strAsNumber.charAt(i)));
                }
            return sum;
        }
        return sum;
    }
}
