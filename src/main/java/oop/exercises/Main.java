package oop.exercises;
import java.util.Scanner;
/*
 * UCF cop3330 Summer 2021 Assignment 1 solutions
 * Copyright 2021 Keondez Robinson
 */

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