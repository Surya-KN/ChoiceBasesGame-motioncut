package org.SuryaKN;

import java.util.Scanner;

public class Main {

    // Define the ANSI escape codes for colors
    public static final String RESET = "\u001B[0m";
    public static final String BLACK = "\u001B[30m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";
    public static final String PURPLE = "\u001B[35m";
    public static final String CYAN = "\u001B[36m";
    public static final String WHITE = "\u001B[37m";

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("What is your name: ");
        String name = input.nextLine();

        printWordByWord("\n\nWelcome, " + name + ", to the Future Gadget Lab!");
        printWordByWord("Our mission is to build a working time machine.");

        printWordByWord("\n1. Begin working on the time machine");
        printWordByWord("2. Discuss the mission with lab members");

        int choice = input.nextInt();
        printWordByWord("\nAs time passes, you face challenges and critical decisions.");

        printWordByWord("1. Push through and complete the time machine");
        printWordByWord("2. Reflect on the potential consequences of time travel");

        if (choice == 1) {
            printWordByWord("\nYou complete the time machine, but doubts linger about its safety.");
            // New scenario: SERN detects your time machine and sends agents to capture you
            printWordByWord("\nSuddenly, you hear a loud knock on the door.");
            printWordByWord(RED + "Okabe: Who is it?" + RESET); // Use red color for Okabe's dialogue
            printWordByWord(RED + "Voice: Open up! This is SERN!" + RESET); // Use red color for SERN's dialogue
            printWordByWord("You realize that SERN, the European Organization for Nuclear Research, has detected your time machine and wants to take it for themselves.");
            printWordByWord("Do you:\n");
            printWordByWord("1. Escape with the time machine");
            printWordByWord("2. Surrender to SERN");

            choice = input.nextInt();

            if (choice == 1) {
                printWordByWord("\nYou decide to escape with the time machine, hoping to find a safe place to hide.");
                printWordByWord("You grab the device and run out of the lab, followed by your friends.");
                printWordByWord("SERN agents chase you through the streets, shooting at you.");
                printWordByWord("Do you:\n");
                printWordByWord("1. Use the time machine to go back in time");
                printWordByWord("2. Keep running and hope for the best");

                choice = input.nextInt();

                if (choice == 1) {
                    printWordByWord("\nYou activate the time machine and set it to go back in time by one hour.");
                    printWordByWord("You hope that this will give you enough time to avoid SERN's detection.");
                    printWordByWord("The device makes a loud noise and flashes a bright light.");
                    printWordByWord("You feel a strange sensation as you travel through time.");
                    // New scenario: You go back in time and meet yourself
                   // System.out.println(SEPARATOR); // Print the separator between scenes
                    printWordByWord("\nYou arrive at the lab one hour before you completed the time machine.");
                    printWordByWord("You see yourself working on the device, unaware of what's about to happen.");
                    printWordByWord("You realize that you have created a paradox by meeting yourself.");
                    printWordByWord("Do you:\n");
                    printWordByWord("1. Warn yourself about SERN");
                    printWordByWord("2. Pretend to be a visitor and act casual");

                    choice = input.nextInt();

                    if (choice == 1) {
                        // New scenario: You warn yourself about SERN and change the course of events
                        printWordByWord("\nYou decide to warn yourself about SERN and tell yourself to stop working on the time machine.");
                        printWordByWord("Yourself: What? Who are you? How do you know about SERN?");
                        printWordByWord("You: I'm you from the future. Trust me, SERN is coming for us. We need to destroy the device and get out of here.");
                        printWordByWord("Yourself: This is crazy. How can I believe you?");
                        printWordByWord("You: Look at this. It's the same as yours. It's a time machine.");
                        printWordByWord("Yourself: What? How did you get that?");
                        printWordByWord("You: I just told you. I came from the future. Now listen, we don't have much time. We need to act fast.");
                        // New ending: You prevent SERN from capturing you and change history
                        printWordByWord("\nYou convince yourself to destroy the time machine and escape from the lab.");
                        printWordByWord("You avoid SERN's agents and find a safe place to hide.");
                        printWordByWord("You realize that you have changed history and created a new world line.");
                        printWordByWord("You wonder what will happen next.");
                        printWordByWord("\nCongratulations! You've unlocked the 'Paradox Ending'!");
                        printWordByWord("You've created a paradox by meeting yourself and changed history.");
                    } else {
                        // New scenario: You pretend to be a visitor and act casual
                        printWordByWord("\nYou decide to pretend to be a visitor and act casual.");
                        printWordByWord("You introduce yourself as a friend of Kurisu and say that you came to see the lab.");
                        printWordByWord("Yourself: Oh, I see. Well, welcome to the Future Gadget Lab. I'm Okabe, the founder and leader of this lab.");
                        printWordByWord("You: Nice to meet you, Okabe. I'm... uh... John. John Smith.");
                        printWordByWord("Yourself: John Smith? That's a very common name.");
                        printWordByWord("You: Yeah, I know. It's a coincidence.");
                        printWordByWord("Yourself: Well, anyway, this is the time machine we're working on. It's almost finished.");
                        // New ending: You watch yourself complete the time machine and get captured by SERN
                        printWordByWord("\nYou watch yourself complete the time machine and activate it.");
                        printWordByWord("You feel a surge of emotion as you see your past self achieve your dream.");
                        printWordByWord("However, your joy is short-lived as SERN agents break into the lab and capture you and your friends.");
                        printWordByWord("You try to escape with the time machine, but it's too late. They take it from you and shoot you in the head.");
                        printWordByWord("\nGame Over. You've unlocked the 'Tragic Ending'!");
                        printWordByWord("You've witnessed your own death and failed to save yourself and your friends.");
                    }
                } else {
                    // New scenario: You keep running and hope for the best
                    printWordByWord("\nYou decide to keep running and hope for the best.");
                    printWordByWord("You dodge the bullets and look for a place to hide.");
                    printWordByWord("You see a police car parked nearby. Maybe they can help you.");
                    printWordByWord("Do you:\n");
                    printWordByWord("1. Ask the police for help");
                    printWordByWord("2. Steal the police car and drive away");

                    choice = input.nextInt();

                    if (choice == 1) {
                        // New scenario: You ask the police for help
                        printWordByWord("\nYou run towards the police car and shout for help.");
                        printWordByWord("Police: What's going on? Who are you?");
                        printWordByWord("You: Please, help us! We're being chased by SERN agents!");
                        printWordByWord("Police: SERN? What are you talking about?");
                        // New ending: You get arrested by the police for causing trouble
                        printWordByWord("\nThe police don't believe you and think that you're crazy or involved in some illegal activity.");
                        printWordByWord("They arrest you and your friends and take you to the station.");
                        printWordByWord("SERN agents follow them and retrieve the time machine from your possession.");
                        printWordByWord("\nGame Over. You've unlocked the 'Arrested by Police Ending'!");
                        printWordByWord("You've been arrested by the police for causing trouble and lost the time machine to SERN.");
                    } else {
                        // New scenario: You steal the police car and drive away
                        printWordByWord("\nYou decide to steal the police car and drive away.");
                        printWordByWord("You jump into the driver's seat and start the engine.");
                        printWordByWord("Police: Hey, stop! That's our car!");
                        printWordByWord("You ignore them and speed off, leaving them behind.");
                        // New ending: You escape from SERN but become wanted by the police
                        printWordByWord("\nYou manage to escape from SERN's agents, but now you have another problem. You've stolen a police car and become wanted by the law.");
                        printWordByWord("You hide in an abandoned warehouse with your friends and try to figure out what to do next.");
                        printWordByWord("\nCongratulations! You've unlocked the 'Wanted by Police Ending'!");
                        printWordByWord("You've escaped from SERN but become wanted by the police for stealing their car.");
                    }
                }

            }

            printWordByWord("\nFearing the consequences, you decide to destroy the time machine.");
            printWordByWord("You accept that the past cannot be changed.");
            printWordByWord("\nYou chose not to pursue time travel.");
            printWordByWord("This is the 'No Time Travel Ending.'");
        }
    }

    public static void printWordByWord(String text) {
        for (String word : text.split(" ")) {
            System.out.print(word + " ");
            try {
                Thread.sleep(300); // pause for 100 ms
            } catch (InterruptedException ignored) {
            }
        }
        System.out.println();
    }
}
