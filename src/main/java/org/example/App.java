package org.example;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args ) {
        Scanner input = new Scanner(System.in);
        String noun, verb, adjective, adverb;
        System.out.println("Enter a noun:");
        noun = input.nextLine();
        System.out.println("Enter a verb:");
        verb = input.nextLine();
        System.out.println("Enter an adjective");
        adjective = input.nextLine();
        System.out.println("Enter an adverb:");
        adverb = input.nextLine();

        System.out.printf("Do you %s your %s %s %s? That's hilarious!", verb, adjective, noun, adverb);
    }
}
