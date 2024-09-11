package com.ohgiraffers.level02.normal;

public class StudentDTO {
    private int grade;
    private int classroom;
    private String name;
    private double height;
    private char gender;


    public StudentDTO(){}

    public StudentDTO(int grade, int classroom, String name, double height, char gender){
        this.grade=grade;
        this.classroom=classroom;
        this.name=name;
        this.height=height;
        this.gender=gender;
    }

    public void SetGrade(int grade){
        this.grade =grade;
    }
    public void SetClassroom(int classroom){
        this.classroom =classroom;
    }
    public void SetName(String name){
        this.name =name;
    }
    public void SetHeight(double height){
        this.height =height;
    }
    public void SetGender(char gender){
        this.gender =gender;
    }

    public int GetGrade(){
        return grade;
    }
    public int GetClassroom(){
        return classroom;
    }
    public String GetName(){
        return name;
    }
    public double GetHeight(){
        return height;
    }
    public char GetGender(){
        return gender;
    }
    public void printInformation(){
        System.out.println("학년 : " + this.grade);
        System.out.println("반 : " + this.classroom);
        System.out.println("이름 : " + this.name);
        System.out.println("키 : " + this.height);
        System.out.println("성별 : " + this.gender);
    }
}
