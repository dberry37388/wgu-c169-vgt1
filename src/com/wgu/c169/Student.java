package com.wgu.c169;

import java.util.Arrays;

class Student {

    private String studentId;
    private String firstName;
    private String lastName;
    private String email;
    private int age;
    private int[] grades;

    Student(
            String studentId,
            String firstName,
            String lastName,
            String email,
            int age,
            int[] grades
    ) {
        setStudentId(studentId);
        setFirstName(firstName);
        setLastName(lastName);
        setEmail(email);
        setAge(age);
        setGrades(grades);
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGrades(int[] grades) {
        this.grades = grades;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }

    public int[] getGrades() {
        return grades;
    }

    public void print() {
        System.out.println("Student ID: " + getStudentId() +
                "\t" + "First Name: " + getFirstName() +
                "\t" + "Last Name: " + getLastName() +
                "\t" + "Email Address: " + getEmail() +
                "\t" + "Age: " + getAge() +
                "\t" + "Grades:" + Arrays.toString(getGrades()));
    }
}
