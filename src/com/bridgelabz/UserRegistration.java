package com.bridgelabz;

import java.util.regex.Pattern;

public class UserRegistration {

    public static void main(String[] args) {
        System.out.println("Welcome to UserRegistration program using Regex ");
        boolean email = Pattern.matches("[a-z]{3,}.[a-z]{3,}[\\d]{2,}@[a-z]{3,}.[a-z]{2,}", "sravan.sunny81@gmail.com");
        System.out.println("Email :"+email);
    }

}
