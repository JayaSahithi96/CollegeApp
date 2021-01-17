package com.company;

class Student extends College{
    long student_Id;
    String student_Name;
    String gender;
    String branch;


    public Student(){
    }

    public Student(long student_Id,String student_Name,String gender,String branch){

        this.student_Id= student_Id;
        this.student_Name= student_Name;
        this.gender= gender;
        this.branch= branch;

    }
    public long getStudent_Id(){
        return student_Id;
    }
    public String getStudent_Name(){
        return student_Name;
    }
    public String getGender(){
        return gender;
    }
    public String getBranch(){
        return branch;
    }
    public void printStudentDetails(){
        System.out.println("student details:" +student_Id+ "/n" +student_Name+ "/n" +gender+ "/n" +branch);
    }
}