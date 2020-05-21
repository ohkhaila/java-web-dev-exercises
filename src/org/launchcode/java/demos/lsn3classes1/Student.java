package org.launchcode.java.demos.lsn3classes1;

// Start working here with your Student class.
// To instantiate the Student class, add your code to the main in the file, SchoolPractice.

public class Student {

    private String name;
    private int studentId;
    private int numberOfCredits = 0;
    private double gpa = 0.0;

    public static void main(String[] args) {
        Student malia = new Student();
        malia.name = "Malia Jones";
        malia.numberOfCredits = 1;
        malia.gpa = 4.0;

    }



    public String getName(){
        return name;
    }

    private void  setName(String aName){
        name = aName;
    }

    public int getStudentId(){
        return studentId;
    }

    private void setStudentId(int aStudentId){
        studentId = aStudentId;
    }

    public int getNumberOfCredits(){
        return numberOfCredits;
    }
    private void setNumberOfCredits(int aNumberOfCredits){
        numberOfCredits = aNumberOfCredits;
    }
    public double getGpa(){
        return gpa;
    }
    private void setGpa(double aGpa){
        gpa = aGpa;
    }

}