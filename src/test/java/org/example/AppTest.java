package org.example;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        String userName = "PankajChauhan";
        String userName1 = "Pankaj Chauhan";
        String userName2 = "Pankaj_Chauhan";
        String userName3 = "Pankaj@Chauhan";
        String userName4 = "Pankaj/Chauhan";
        String userName5 = "Pankaj#Chauhan";
        assertTrue(isValidUserName(userName));
        assertFalse(isValidUserName(userName1));
        assertFalse(isValidUserName(userName2));
        assertFalse(isValidUserName(userName3));
        assertFalse(isValidUserName(userName4));
        assertFalse(isValidUserName(userName5));
        assertTrue( true );
    }

    private boolean isValidUserName(String userName) {
        return !userName.contains(" ") && !userName.contains("_") && !userName.contains("@") && !userName.contains("#") && !userName.contains("/");
    }
}
