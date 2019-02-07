package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Welcome to SMS! What would you like to do today?  \n Options: \n Clear messages(Clear) \n Retrieve messages(Retrieve) \n Send message(Send) \n");
        Scanner firstName = new Scanner(System.in);
        String fn = firstName.nextLine();

        if(fn.equalsIgnoreCase("Send")) {

            System.out.println("Perfect! Who would you like to send a message to?");
            Scanner sendName = new Scanner(System.in);
            String sn = sendName.nextLine();

            System.out.println("What would you like to say to " + sn + "?");
            Scanner sendingMessage = new Scanner(System.in);
            String message = sendingMessage.nextLine();


            Message nm = new Message(sn, message);
            MessageList nml = new MessageList(nm);

        } else if(fn.equalsIgnoreCase("Clear")){

            System.out.println("Whose messages would you like to clear?");
            Scanner clearm = new Scanner(System.in);
            String cm = clearm.nextLine();



        } else if(fn.equalsIgnoreCase("Retrieve")){

            System.out.println("Whose messages would you like to retrieve?");
            Scanner retrievem = new Scanner(System.in);
            String rm = retrievem.nextLine();

        }



    }
}
