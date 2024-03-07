package com.sg.foundations.flowcontrol.ifs;

import java.util.Scanner;

public class MiniZork {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.println("You are standing in an open field west of a white house,");
        System.out.println("With a boarded front door.");
        System.out.println("There is a small mailbox here.");
        System.out.print("Go to the house, or open the mailbox? ");

        String action = userInput.nextLine();

        if (action.equals("open the mailbox")) {
            System.out.println("You open the mailbox.");
            System.out.println("It's really dark in there.");
            System.out.print("Look inside or stick your hand in? ");
            action = userInput.nextLine();

            if (action.equals("look inside")) {
                System.out.println("You peer inside the mailbox.");
                System.out.println("It's really very dark. So ... so very dark.");
                System.out.print("Run away or keep looking? ");
                action = userInput.nextLine();

                if (action.equals("keep looking")) {
                    System.out.println("Turns out, hanging out around dark places isn't a good idea.");
                    System.out.println("You've been eaten by a grue.");
                } else if (action.equals("run away")) {
                    System.out.println("You run away screaming across the fields - looking very foolish.");
                    System.out.println("But you alive. Possibly a wise choice.");
                }
            } else if (action.equals("stick your hand in")) {
                System.out.println("you stick your hand in the mailbox");
                System.out.println("you feel a letter and a square box");
                System.out.println("take the paper or the box?");
                action = userInput.nextLine();
                if (action.equals("take the letter")){
                    System.out.println("you find a letter addressed to you ");
                    System.out.println("read the letter, or burn the letter");
                    action = userInput.nextLine();
                    if(action.equals("read the letter")){
                        System.out.println("you read the letter");
                        System.out.println("The letter is a curse");
                        System.out.println("you are dead.");
                    } else if (action.equals("burn the letter")) {
                        System.out.println("you burn the letter");
                        System.out.println("the letter was cursed");
                        System.out.println("you run from the house");
                        System.out.println("You are not dead!");
                    }
                } else if (action.equals("take the box")) {
                    System.out.println("you find a small box with an image of yourself carved into the it");
                    System.out.println("open the box, throw box away? ");
                    action = userInput.nextLine();
                    if (action.equals("open the box")){
                        System.out.println("you are transported to a world inside the box");
                        System.out.println("The world is full of zombies");
                        System.out.println("you are eaten by a zombie");
                        System.out.println("you are dead.");
                    } else if (action.equals("throw box away")) {
                        System.out.println("You throw the box as far as you can");
                        System.out.println("you run from the house");
                        System.out.println("you are not dead!");
                    }
                }
            }
        } else if (action.equals("go to the house")) {
            System.out.println("You look at the boarded door and notice the boards are loose");
            System.out.print("Pry the boards loose, or find another entrance? ");
            action = userInput.nextLine();

            if (action.equals("pry the boards")){
                System.out.println("You pry the boards loose and open the door");
                System.out.println("you are now confronted with a set off stairs on the right, and a room to the left");
                System.out.println("Do you walk up the stairs, or go into the room?   ");
                action = userInput.nextLine();

                if (action.equals("walk up the stairs")){
                    System.out.println("you go up the stairs");
                    System.out.println("as you step on the last step, a creek is heard under your foot");
                    System.out.println("the grue hears you and rushes up the stairs");
                    System.out.println("you are dead.");

                } else if (action.equals("go into room")) {
                    System.out.println("you go into the room");
                    System.out.println("inside is full of old antiques");
                    System.out.println("you trip on an antique and hit your head");
                    System.out.println("you are dead.");

                }
            } else if(action.equals("find another entrance")){
                System.out.println("You look to the left of the door and find an open window");
                System.out.println("You climb through the empty window into a room with a corridor on the right");
                System.out.println("search the room or go into the corridor?   ");
                action = userInput.nextLine();

                if(action.equals("search the room")){
                    System.out.println("You search the room");
                    System.out.println("It's full of old antiques");
                    System.out.println("two antiques in particular catch your eye");
                    System.out.println("an old book, and a peculiar doll");
                    System.out.println("pickup the book, or the doll?");
                    action = userInput.nextLine();

                    if (action.equals("pickup the book")){
                        System.out.println("You pickup the book and start reading");
                        System.out.println("You speak the words on the first page");
                        System.out.println("you become cursed by the words");
                        System.out.println("you are dead.");
                    } else if (action.equals("pickup the doll")) {
                        System.out.println("you pickup the doll and are transported to another world");
                        System.out.println("The world is full of zombies");
                        System.out.println("you are eaten by a zombie");
                        System.out.println("you are dead.");

                    }

                } else if (action.equals("go into the corridor")) {
                    System.out.println("you go into the corridor and see a set of stairs going upwards");
                    System.out.println("before the stairs is a bookshelf");
                    System.out.println("go up the stairs, or look at the bookshelf?   ");
                    action = userInput.nextLine();

                    if (action.equals("go up the stairs")){
                        System.out.println("you go up the stairs");
                        System.out.println("as you step on the last step, a creek is heard under your foot");
                        System.out.println("the grue hears you and rushes up the stairs");
                        System.out.println("you are dead.");

                    } else if (action.equals("look at the bookshelf")) {
                        System.out.println("You pickup a book and start reading");
                        System.out.println("You speak the words on the first page");
                        System.out.println("you become cursed by the words");
                        System.out.println("you are dead.");
                    }
                }
            }
        }
    }
}