package com.dataStructureSoln;

public class StudentManagerArray {
    private String[] students;
    private int count;

    public StudentManagerArray(int size) {
        students = new String[size];
        count = 0;
    }

    public static void main(String[] args) {
        StudentManagerArray sa = new StudentManagerArray(5);
        sa.addStudent("Alice");
        sa.addStudent("Bob");
        sa.addStudent("Charlie");

        sa.displayStudents();

//        System.out.println("Index of Bob: " + sa.searchStudent("Bob"));

        sa.deleteStudent("Bob");
        sa.displayStudents();
    }

    public void addStudent(String name) {
        if (count < students.length) {
            students[count] = name;
            count++;
        } else {
            System.out.println("Array is full, cannot add more students.");
        }
    }

    public int searchStudent(String name) {
        for (int i = 0; i < count; i++) {
            if (students[i].equals(name)) {
                return i;
            }
        }
        return -1;
    }

    public void deleteStudent(String name) {
        int index = searchStudent(name);
        if (index != -1) {

            for (int i = index; i < count - 1; i++) {
                students[i] = students[i + 1];
            }
            students[count - 1] = null;
            count--;
        } else {
            System.out.println("Student not found.");
        }
    }

    public void displayStudents() {
        for (int i = 0; i < count; i++) {
            System.out.println(students[i]);
        }
    }
}
