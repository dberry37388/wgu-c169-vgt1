package com.wgu.c169;

import java.util.ArrayList;

public class Roster {

    private static ArrayList<Student> roster;

    static {
        roster = new ArrayList<>();

        roster.add(new Student("1","John","Smith","John1989@gmail.com",20,new int[]{88,79,89}));
        roster.add(new Student("2","Suzan","Erickson","Erickson_1999@gmailcom",19,new int[]{91,72,85}));
        roster.add(new Student("3","Jack","Napoli","The_lawyer99yahoo.com",19,new int[]{85,84,87}));
        roster.add(new Student("4","Erin","Black","Erin.black@comcast.net",22,new int[]{91,98,82}));
        roster.add(new Student("5","Daniel","Berry","dberry8@wgu.edu",38,new int[]{91,84,98}));
    }

    /**
     * Print all students
     *
     * Method should print a complete tab-separated list of student data using accessor methods.
     * We are using the print method from the Student class to achieve this.
     *
     * This satisfies requirement B.3.b
     */
    public static void print_all() {
        roster.forEach(student -> {
            student.print();
        });
    }

    /**
     * Verify Emails and Print Invalids
     *
     * Method verifies that student e-mail addresses are valid and prints out invalid email addresses.
     *
     * This satisfies requirement B.3.d
     *
     */
    public static void print_invalid_emails() {

        // regex checking our string for a valid at sign (@), a period (.) and no spaces
        String validEmailRegex = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";;

        /*
         we will iterate through each email address. If the email does NOT match
         our regex, we will print it out as being invalid. If the email matches
         the regex, we will do nothing as it is a valid email. There is no need
         for an if/else here, as we are not doing anything with the valid emails
         and are only displaying information back if it is invalid..
        */
        roster.forEach(student -> {
            if (! student.getEmail().matches(validEmailRegex)) {
                System.out.println(student.getFirstName() + " " + student.getLastName() + "has an invalid email address (" + student.getEmail() + ")");
            }
        });
    }

    /**
     * Print the average grade for each student.
     *
     * Correctly prints a student’s average grade by student ID.
     *
     * This satisfies requirement B.3.c
     *
     * @param student
     */
    public static void print_average_grade(Student student) {

        int sum = 0;
        for (int grade : student.getGrades()) sum += grade;
        int average = sum / student.getGrades().length;

        System.out.println(student.getFirstName() + " " + student.getLastName() + ": " + average);
    }

    /**
     * Remove from Roster by Student ID
     *
     * Method takes a student ID and loops through the list to
     * remove entry matching the student ID. We are using a boolean
     * to keep track of whether the entry exists. If we loop through
     * all of our entries and we still have not found the Student ID,
     * then we will display a message to the user telling them so.
     *
     *
     * @param studentId
     */
    public static void remove(String studentId) {

        boolean listContainedStudent = false;

        for (int i = 0; i < roster.size(); i++) {
            String currentStudentId = roster.get(i).getStudentId();

            if (currentStudentId.equals(studentId)) {
                listContainedStudent = true;
                roster.remove(i);

                System.out.println("Student with ID " + studentId + " was not found.");

            }
        }

        if (! listContainedStudent) {
            System.out.println("A student with ID " + studentId + " was not found.");
        }
    }

    public static void main(String[] args) {
        System.out.println("Print All Students Method:");

        print_all();

        System.out.println("\nPrint Invalid Email Addresses:");

        print_invalid_emails();

        System.out.println("\nOutput Average Grade For Each Student:");

        for (Student student : roster) {
            print_average_grade(student);
        }

        System.out.println("\nRemove Student with ID of 3:");
        remove("3");
        remove("3");
    }
}
