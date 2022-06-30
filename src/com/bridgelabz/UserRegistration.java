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

    }

}
