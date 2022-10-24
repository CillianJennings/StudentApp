package ie.atu.StudentApp;

import java.util.Scanner;

public class StudentApp {
    public static void main(String[] args) {

        System.out.println("Please enter your name:");
        Scanner input = new Scanner(System.in);
        Student studentInfo = new Student();
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
    }
}
