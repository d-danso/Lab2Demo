package com.dataStructureSoln;

class Student {
    private String name;
    private byte age;
    private char grade;

    public Student(String name, byte age, char grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age + ", Grade: " + grade;
    }
}

public class StudentManagerArray {
    private Student[] students;
    private int count;

    public StudentManagerArray(int size) {
        students = new Student[size];
        count = 0;
    }

    public static void main(String[] args) {
        StudentManagerArray sa = new StudentManagerArray(5);
        sa.addStudent("Alice", (byte) 20, 'A');
        sa.addStudent("Bob", (byte) 10, 'B');
        sa.addStudent("Charlie", (byte) 15, 'C');

        sa.displayStudents();

        System.out.println("Index of Bob: " + sa.searchStudent("Bob"));

        sa.deleteStudent("Bob");
        sa.displayStudents();
    }

    public void addStudent(String name, byte age, char grade) {
        if (count < students.length) {
            students[count] = new Student(name, age, grade);
            count++;
        } else {
            System.out.println("Array is full, cannot add more students.");
        }
    }

    public int searchStudent(String name) {
        for (int i = 0; i < count; i++) {
            if (students[i].getName().equals(name)) {
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
