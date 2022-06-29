package com.bridgelabz;

import java.util.regex.Pattern;

public class UserRegistration {

    public static void main(String[] args) {
        System.out.println("Welcome to UserRegistration program using Regex ");
        boolean lastName = Pattern.matches("[A-Z][a-z]{3,}", "Sravan");
        System.out.println("LastName : "+lastName);
    }
}
