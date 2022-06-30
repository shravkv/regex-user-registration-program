package com.bridgelabz;

import java.util.regex.Pattern;

public class UserRegistration {

    public static void main(String[] args) {
        System.out.println("Welcome to UserRegistration program using Regex ");
        boolean firstName = Pattern.matches("[A-Z][a-z]{3,}", "Vodnala");
        System.out.println("FirstName : "+firstName);
        boolean lastName = Pattern.matches("[A-Z][a-z]{3,}", "Sravan");
        System.out.println("LastName : "+lastName);
        boolean email = Pattern.matches("[a-z]{3,}.[a-z]{3,}[\\d]{2,}@[a-z]{3,}.[a-z]{2,}", "sravan.sunny81@gmail.com");
        System.out.println("Email :"+email);
        boolean phoneNumber = Pattern.matches("[+]91 [6789]\\d{9}", "+91 9052382248");
        System.out.println("PhoneNumber :"+phoneNumber);
        boolean passWord = Pattern.matches("[a-z]{8,}", "sravankum");
        System.out.println("PassWord :"+passWord);
        boolean passWord1 = Pattern.matches("(?=.*?[A-Z])[A-Za-z]{8,}", "SravanKum");
        System.out.println("PassWord1 :"+passWord1);
        boolean passWord2 = Pattern.matches("(?=.*?[A-Z])(?=.*?\\d)[A-Za-z\\d]{8,}", "Sr1avanN4Kum");
        System.out.println("Password2 :" + passWord2);
        boolean passWord3 = Pattern.matches("(?=.*?[A-Z])(?=.*?\\d)(?=.*?[!@#$%^&*_+-])[A-Za-z\\d!@#$%^&*+_-]{8,}", "Sr1a#vanN4Ku@m");
        System.out.println("PassWord3 :"+passWord3);

        System.out.println("-----------------------------------------------------------------------------");

        System.out.println("Valid Emails following below :");
        boolean b1 = Pattern.matches("[a-z]{3,}@[a-z]{2,}.[a-z]{3,},", "abc@yahoo.com,");
        System.out.println("b1 :" + b1);
        boolean b2 = Pattern.matches("[a-z]{3,}-\\d{2,}@[a-z]{2,}.[a-z]{3,},", "abc-100@yahoo.com,");
        System.out.println("b2 :" + b2);
        boolean b3 = Pattern.matches("[a-z]{3,}.\\d{2,}@[a-z]{2,}.[a-z]{3,}", "abc.100@yahoo.com");
        System.out.println("b3 :" + b3);
        boolean b4 = Pattern.matches("[a-z]{3,}\\d{2,}@[a-z]{2,}.[a-z]{3,}", "abc111@abc.com");
        System.out.println("b4 :" + b4);
        boolean b5 = Pattern.matches("[a-z]{3,}-\\d{2,}@[a-z]{2,}.[a-z]{3,},", "abc-100@abc.net,");
        System.out.println("b5 :" + b5);
        boolean b6 = Pattern.matches("[a-z]{3,}.\\d{2,}@[a-z]{2,}.[a-z]{3,}.[a-z]{2,}", "abc.100@abc.com.au");
        System.out.println("b6 :" + b6);
        boolean b7 = Pattern.matches("[a-z]{3,}@\\d.[a-z]{2,}", "abc@1.com");
        System.out.println("b7 :" + b7);
        boolean b8 = Pattern.matches("[a-z]{3,}@[a-z]{2,}.[a-z]{3,}.[a-z]{3,}", "abc@gmail.com.com");
        System.out.println("b8 :" + b8);
        boolean b9 = Pattern.matches("[a-z]{3,}[+]\\d{2,}@[a-z]{2,}.[a-z]{3,}", "abc+100@gmail.com");
        System.out.println("b9 :" + b9);

        System.out.println("----------------------------------------------------");

        System.out.println("Invalid Emails following below :");
        boolean a1 = Pattern.matches("[a-z]{4,}@[a-z].[a-z]{2,}", "abc");  // must contains “@” symbol
        System.out.println("a1 :" + a1);
        boolean a2 = Pattern.matches("[a-z]{3,}@[a-z]{2,}.[a-z]{2,}", "abc@.com.my"); //tld can not start with dot “.”
        System.out.println("a2 :" + a2);
        boolean a3 = Pattern.matches("[a-z\\d]{3,}@[a-z]{2,}.[a-z]", "abc123@.gmail.a");// “.a” is not a valid tld, last tld must contain at least two characters
        System.out.println("a3 :" + a3);
        boolean a4 = Pattern.matches("[a-z\\d]{3,}@[a-z]{2,}.[a-z]{2,}", "abc123@.com"); // tld can not start with dot “.”
        System.out.println("a4 :" + a4);
        boolean a5 = Pattern.matches("[a-z\\d]{3,}@[a-z]{2,}.[a-z]{2,}", "abc123@.com.com");//tld can not start with dot “.”
        System.out.println("a5 :" + a5);
        boolean a6 = Pattern.matches("[a-z]{3,}@[a-z]{2,}.[a-z]{2,}", ".abc@abc.com"); //email’s 1st character can not start with “.”
        System.out.println("a6 :" + a6);
        boolean a7 = Pattern.matches("[a-z]{3,}@[a-z]{3,}.[a-z]{2,}", "abc()*@gmail.com");//email’s is only allow character, digit, underscore and dash
        System.out.println("a7 :" + a7);
        boolean a8 = Pattern.matches("[a-z]{3,}@[a-z]{3,}.[a-z]{2,}", "abc@%*.com");// email’s tld is only allow character and digit
        System.out.println("a8 :" + a8);
        boolean a9 = Pattern.matches("[a-z\\d]{3,}@[a-z]{3,}.[a-z]{2,}", "abc..2002@gmail.com");//double dots “.” are not allow
        System.out.println("a9 :" + a9);
        boolean a10 = Pattern.matches("[a-z]{3,}@[a-z]{2,}.[a-z]{2,}", "abc.@gmail.com");// email’s last character can not end with dot “.”
        System.out.println("a10 :" + a10);
        boolean a11 = Pattern.matches("[abc]{3,}@[a-z]{2,}.[a-z]{2,}", "abc@abc@gmail.com");//double “@” is not allow
        System.out.println("a11 :" + a11);
        boolean a12 = Pattern.matches("[a-z]{3,}@[a-z]{2,}.[a-z]{3,}.[a-z]{2,}", "abc@gmail.com.1a");//email’s tld which has two characters can not contains digit
        System.out.println("a12 :" + a12);
        boolean a13 = Pattern.matches("[abc]{3,}@[a-z]{2,}.[a-z]{3,}.[a-z]{2,}", "abc@gmail.com.aa.au");//cannot have multiple email’s tld
        System.out.println("a13 :" + a13);
    }

}
