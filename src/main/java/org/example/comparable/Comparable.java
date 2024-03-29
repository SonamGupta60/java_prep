package org.example.comparable;
import java.util.ArrayList;
import java.util.Collections;

class student implements Comparable<student> {
    int rollNumber;
    String name;

    public student(int rollNumber, String name) {
        this.rollNumber = rollNumber;
        this.name = name;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return this.rollNumber + " " + this.name;
    }

    @Override
    public int compareTo(student s) {
        // Compare by roll number
        return this.rollNumber - s.rollNumber;
    }
}

class ComparableExample {
    public static void main(String[] args) {
        ArrayList<student> s = new ArrayList<>();
        s.add(new student(10,"John"));
        s.add(new student(1,"Adam"));
        s.add(new student(6,"Farh"));
        s.add(new student(4,"Dain"));
        s.add(new student(5,"Eirish"));
        s.add(new student(9,"Isha"));
        s.add(new student(3,"Cat"));
        s.add(new student(2,"Bubby"));
        s.add(new student(7,"Gyn"));
        s.add(new student(8,"Herry"));

        Collections.sort(s);
        for (int i = 0; i < s.size(); i++) {
            System.out.println(s.get(i));
        }
    }
}

