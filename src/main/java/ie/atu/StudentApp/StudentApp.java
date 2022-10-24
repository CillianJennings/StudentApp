package ie.atu.StudentApp;

import java.util.Scanner;

public class StudentApp {
    public static void main(String[] args) {

        System.out.println("Please enter your name:");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();

        System.out.println("Please enter your student email:");
        String email = input.nextLine();

        System.out.println("Please enter the name of your course:");
        String course = input.nextLine();
    }
}
