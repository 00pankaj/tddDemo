package org.example;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class StringCalculator {
    @Test
    public void addition() {
        assertEquals(0,add(""));
        assertEquals(1,add("1"));
        assertEquals(3,add("1,2"));
    }

    private int add(String strAsNumber) {

        if (strAsNumber.equals("")){
            return 0;
        }
        int sum = 0;
        if (!strAsNumber.isEmpty()) {
            for (int i = 0; i < strAsNumber.length(); i++) {
                if (strAsNumber.charAt(i) == ',' || strAsNumber.charAt(i) == '\n') continue;
                sum += Integer.parseInt(String.valueOf(strAsNumber.charAt(i)));
            }
            return sum;
        }
//        if (strAsNumber.equals(""))
//            return 0;
        if (strAsNumber.equals("1"))
            return 1;
//        if (strAsNumber.equals("2"))
//            return 2;
        if (strAsNumber.equals("1,2"))
            return 1 + 2;
//        return sum;
        return 0;
    }
}
