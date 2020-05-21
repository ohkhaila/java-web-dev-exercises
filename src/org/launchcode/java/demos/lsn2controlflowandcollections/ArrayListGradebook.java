package org.launchcode.java.demos.lsn2controlflowandcollections;

import java.util.ArrayList; //import that allows us to take advantage of tools and methods of ArrayList
import java.util.Scanner;

public class ArrayListGradebook {

    public static void main(String[] args) {

        ArrayList<String> students = new ArrayList<>(); //initialized this object (students) which is an Arraylist of strings
        ArrayList<Double> grades = new ArrayList<>(); //initialized this object (grades) which is an Arraylist of doubleend rs
        Scanner input = new Scanner(System.in);
        String newStudent;

        System.out.println("Enter your students (or ENTER to finish):");

        // Get student names
        do {
            newStudent = input.nextLine(); //turns the input into a string

            if (!newStudent.equals("")) { //if the name input isn't empty
                students.add(newStudent); //.add() is an ArrayLIst method
            }

        } while(!newStudent.equals("")); //while new student isn't empty

        // Get student grades
        for (String student : students) {
            System.out.print("Grade for " + student + ": ");
            Double grade = input.nextDouble();
            grades.add(grade);
        }

        // Print class roster
        System.out.println("\nClass roster:");
        double sum = 0.0;

        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i) + " (" + grades.get(i) + ")");
            sum += grades.get(i);
        }

        double avg = sum / students.size();
        System.out.println("Average grade: " + avg);
    }
}
