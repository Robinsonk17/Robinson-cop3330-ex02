package oop.exercises;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {

        Scanner input = new Scanner (System.in);
        System.out.print("What is the input string?");

        String stringInput = input.nextLine();
        int outputNumber = stringInput.length();

        System.out.println(stringInput + " has " + outputNumber + " characters.");
    }
}