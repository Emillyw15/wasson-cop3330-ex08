/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Emilly Wasson
 */

import java.util.Scanner;

public class prog8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("How many people? ");
        int num_people = in.nextInt();
        System.out.print("How many pizzas do you have? ");
        int pizzas_ordered = in.nextInt();
        System.out.print("How many slices per pizza? ");
        int slice_per_pizza = in.nextInt();

        int slice_total = pizzas_ordered * slice_per_pizza;

        System.out.println(num_people + " people with " + pizzas_ordered + " pizzas (" + slice_total + " slices).");

        int slice_per_person = slice_total / num_people;
        int leftover = slice_total - slice_per_person * num_people;

        System.out.println("Each person gets " + slice_per_person + " pieces of pizza.");
        System.out.println("There are " + leftover + " leftover pieces.");
    }

}
