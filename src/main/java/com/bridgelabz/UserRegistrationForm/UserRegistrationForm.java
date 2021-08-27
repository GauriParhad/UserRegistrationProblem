package com.bridgelabz.UserRegistrationForm;
import java.util.regex.*;

public class UserRegistrationForm {
    public static boolean isValidEmail(String name) {
        String regex = "^[Cap]\\w{5,29}[A-Za-z]$";

        Pattern p = Pattern.compile("\\B[A-Z0-9._%-]+@[A-Z0-9.-]+\\.[A-Z]{2,4}\\b");

        Matcher m = p.matcher("thegauriparhad@gmail.com");

        if (m.find())
            System.out.println("Correct!");

        //Return if the username
        return m.matches();

        //checking Email-Id.
        String email = "the.gauri@gmail.co.in";
        System.out.println(isValidEmail(email));
    }
    @Test
    public static boolean isValidmobilenumber() {
        String regex = "^[Cap]\\w{5,29}[A-Za-z]$";

        Pattern pattern = Pattern.compile("^\\d{10}$");

        Matcher matcher = pattern.matcher("91 9985467725");
        assertTrue(matcher.matches());
    }
    //checking mobile number.
        System.out.println(isValidmobilenumber());
    }
}
