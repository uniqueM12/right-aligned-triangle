package com.wizer.test;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the height as integer: ");
        int size = 0;
        try {
            String input = scanner.nextLine();
            size = Integer.parseInt(input);
            if (size <= 0 || size >= 1000){
                error();
            }
        }catch (Exception e){
            error();
        }

        for (int i = 0; i <= size; i++) {
            String value = "";
            for (int j = 0; j < size - i; j++) {
                value = value + " ";
            }
            for (int k = 0; k < i; k++) {
                value = value + "*";
            }
            System.out.println(value);
        }
    }
    private static void error(){
        System.out.println("You did not enter a valid height!");
        System.out.println("Height is a number between 0 and 1000 ");
        System.out.println("\nSystm will exit");
        System.exit(1);
    }
}
