package com.company;

class Marks extends Student{
    String subject1,subject2,subject3;
    double marks1,marks2,marks3;

    public Marks(String subject1, String subject2, String subject3,double marks1,double marks2,double marks3){
        this.subject1= subject1;
        this.subject2=subject2;
        this.subject3=subject3;
        this.marks1= marks1;
        this.marks2=marks2;
        this.marks3=marks3;
    }
    public void printSubjects(){
        System.out.println("subjects: " +subject1+ "/n" +subject2+ "/n" +subject3+ "/n");
    }
    public void printMarks(){
        System.out.println("Marks: " +marks1+ "/n" +marks2+ "/n" +marks3+ "/n");
    }
    public double getTotal(){
        return marks1+marks2+marks3;
    }
    public double getPercentage(){
        return (marks1+marks2+marks3)/3;
    }
}