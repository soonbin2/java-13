package com.ohgiraffers.level03.hard;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("넘버를 입력하세요 : ");
        int number = sc.nextInt();
        sc.nextLine();
        System.out.print("이름을 입력하세요 : ");
        String name = sc.nextLine();


        System.out.print("부서명을 입력하세요 : ");
        String dept = sc.nextLine();


        System.out.print("직급을 입력하세요 : ");
        String job = sc.nextLine();

        System.out.print("나이를 입력하세요 : ");
        int age = sc.nextInt();

        sc.nextLine();
        System.out.print("성별을 입력하세요 : ");
        char gender = sc.nextLine().charAt(0);

        System.out.print("월급을 입력하세요 : ");
        int salary = sc.nextInt();

        System.out.print("보너스를 입력하세요 : ");
        double bonusPoint = sc.nextDouble();

        sc.nextLine();
        System.out.print("핸드폰 번호를 입력하세요 : ");
        String phone  = sc.nextLine();


        System.out.print("주소를 입력하세요 : ");
        String address = sc.nextLine();

        EmployeeDTO ep = new EmployeeDTO();

        ep.setNumber(number);
        ep.setName(name);
        ep.setDept(dept);
        ep.setJob(job);
        ep.setAge(age);
        ep.setGender(gender);
        ep.setSalary(salary);
        ep.setBonusPoint(bonusPoint);
        ep.setPhone(phone);
        ep.setAddress(address);

        System.out.println(ep.getNumber());
        System.out.println(ep.getName());
        System.out.println(ep.getDept());
        System.out.println(ep.getJob());
        System.out.println(ep.getAge());
        System.out.println(ep.getGender());
        System.out.println(ep.getSalary());
        System.out.println(ep.getBonusPoint());
        System.out.println(ep.getPhone());
        System.out.println(ep.getAddress());

    }
}
