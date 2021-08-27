package com.bridgelabz.UserRegistrationForm;
import java.util.regex.*;

public class UserRegistrationForm {

    public static boolean isValidFirstUsername(String name)
    {
        String regex="^[Cap]\\w{5,29}[A-Za-z]$";

        Pattern p=Pattern.compile(regex);

        if (name ==null){
            return false;
        }

        //Pattern class contains matcher() method
        //to find matching between given username
        //and regular expression
        Matcher m =p.matcher(name);

        //Return if the username
        return m.matches();
    }
    public static void main(String[] args)
    {
        String str1="INDIA";
        System.out.println(isValidFirstUsername(str1));

        String str2="MAH56#";
        System.out.println(isValidFirstUsername(str2));

        String str3="DEL357@%";
        System.out.println(isValidFirstUsername(str3));
    }
}
