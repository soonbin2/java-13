package com.ohgiraffers.level01.basic;

public class MemberDTO {
    private String id;
    private String pwd;
    private String name;
    private int age;
    private char gender;
    private String phone;
    private String email;

    public MemberDTO(){}

    public void SetId(String id){
        this.id=id;
    }
    public void SetPwd(String pwd){
        this.pwd=pwd;
    }
    public void SetName(String name){
        this.name=name;
    }
    public void SetAge(int age){
        this.age=age;
    }
    public void SetGender(char gender){
        this.gender=gender;
    }
    public void SetPhone(String phone){
        this.phone=phone;
    }
    public void SetEmail(String email){
        this.email=email;
    }


    public String GetId(){
        return id;
    }
    public String GetPwd(){
        return pwd;
    }
    public String GetName(){
        return name;
    }
    public int GetAge(){
        return age;
    }
    public char GetGender(){
        return gender;
    }
    public String GetPhone(){
        return phone;
    }
    public String GetEmail(){
        return email;
    }
}
