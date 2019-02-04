package com.company;

import java.util.Scanner;
import java.time.ZonedDateTime;

public class Main {

    public static void main(String[] args) {

        System.out.println("Welcome to SMS! What is your name or number?");
        Scanner firstName = new Scanner(System.in);
        String fn = firstName.nextLine();

        System.out.println("Perfect! Who would you like to send a message to?");
        Scanner sendName = new Scanner(System.in);
        String sn = sendName.nextLine();

        System.out.println("What would you like to say to " + sn + "?");
        Scanner sendingMessage = new Scanner(System.in);
        String message = sendingMessage.nextLine();

        System.out.println(ZonedDateTime.now());






    }
}
