package ie.atu.StudentApp;

import java.util.Scanner;

public class StudentApp {
    public static void main(String[] args) {

        System.out.println("Please enter your name:");
        Scanner input = new Scanner(System.in);
        Student studentInfo = new Student(); //First Object
        String name = input.nextLine();
        studentInfo.setName(name);
        System.out.println("You entered: " + studentInfo.getName());

        System.out.println("Please enter your student email:");
        String email = input.nextLine();
        studentInfo.setEmail(email);
        System.out.println("You entered: " + studentInfo.getEmail());

        System.out.println("Please enter the name of your course:");
        String course = input.nextLine();
        studentInfo.setCourse(course);
        System.out.println("You entered: " + studentInfo.getCourse());

        System.out.println("Please enter a second student name:");
        Student studentInfo2 = new Student(); //Second Object
        String name2 = input.nextLine();
        studentInfo2.setName(name2);
        System.out.println("You entered: " + studentInfo2.getName());

        System.out.println("Please enter a second student email:");
        String email2 = input.nextLine();
        studentInfo2.setEmail(email2);
        System.out.println("You entered: " + studentInfo2.getEmail());

        System.out.println("Please enter a second student course:");
        String course2 = input.nextLine();
        studentInfo2.setCourse(course2);
        System.out.println("You entered: " + studentInfo2.getCourse());

    }
}
