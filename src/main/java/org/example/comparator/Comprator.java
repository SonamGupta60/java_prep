package org.example.comparator;

import java.util.*;
import java.util.Comparator;

class Student {
    int rollNumber;
    String name;
    public Student(int rollNumber, String name){
        this.rollNumber=rollNumber;
        this.name=name;
    }
    public String toString(){
        return this.rollNumber+" "+this.name;
    }
}
class sortByRollNumber implements Comparator<Student> {
    public int compare(Student a, Student b){
        boolean aIsEven=a.rollNumber%2==0;
        boolean bIsEven=b.rollNumber%2==0;
        if(aIsEven && !bIsEven){
            return -1;
        }else if(!aIsEven && bIsEven){
            return 1;
        }else
            return a.rollNumber-b.rollNumber;
    }
}
class Comprator {
    public static void main (String[]args){
        ArrayList<Student> s=new ArrayList<>();
        s.add(new Student(10,"John"));
        s.add(new Student(1,"Adam"));
        s.add(new Student(6,"Farh"));
        s.add(new Student(4,"Dain"));
        s.add(new Student(5,"Eirish"));
        s.add(new Student(9,"Isha"));
        s.add(new Student(3,"Cat"));
        s.add(new Student(2,"Bubby"));
        s.add(new Student(7,"Gyn"));
        s.add(new Student(8,"Herry"));

        Collections.sort(s, new sortByRollNumber());
        for(int i=0;i<s.size();i++){
            System.out.println(s.get(i));
        }
    }
}


