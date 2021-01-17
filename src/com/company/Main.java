package com.company;

class Main {

    public static void main(String[] args) {
        System.out.println("Hello world");
        // write your code here
        College c = new College(121, "Sac State", "6000 j street");
        Student s = new Student(12101, "Sahithi", "Female", "Computer science");
        System.out.println("college id of the student is:"+c.getId());
        System.out.println("college name is:"+c.getName());
        System.out.println("college address:"+c.getAddress());
        System.out.println(" student details:" +s.getStudent_Name() +  "\n" +s.getStudent_Id()+ "\n" +s.getBranch());


    }
}