/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Fouad Braimoh
 */

import java.util.Scanner;




public class Exercise4 {
    public static void main(String[] args) {
        System.out.println("Enter two Noun's:");
        Scanner Noun = new Scanner(System.in);
        String NounA = Noun.nextLine();
        String NounB = Noun.nextLine();
        System.out.println("Enter two Verb's");
        Scanner verb = new Scanner(System.in);
        String verbA = verb.nextLine();
        String verbB = verb.nextLine();
        System.out.println("Enter an Adjective");
        Scanner Adjective = new Scanner(System.in);
        String AdjectiveA = Adjective.nextLine();
        System.out.println("Enter an Adverb");
        Scanner Adverb = new Scanner(System.in);
        String AdverbA = Adverb.nextLine();
        System.out.println("Do you "+ verbA +" in your "+ AdjectiveA+" "+ NounA +" and then "+ AdverbA +" " +verbB +" into "+ NounB +" That's Insane");
        System.out.println("Do you like your story?\nYes\nNo");
        Scanner Answer = new Scanner(System.in);
        String AnswerA = Answer.nextLine();
        if (AnswerA.equals("Yes")){
            System.out.println("Perfect have a nice day");
        }else if(AnswerA.equals("No")){
            System.out.println("How about\n"+"Do you "+ verbB +" in your "+ AdjectiveA+" "+ NounB +" and then "+ AdverbA +" " +verbA +" into "+ NounA +" That's Interesting");
        }else if(AnswerA != "No"){
            System.out.println("Please choose between Yes and No");
        }
    }
}