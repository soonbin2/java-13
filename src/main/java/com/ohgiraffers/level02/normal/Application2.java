package com.ohgiraffers.level02.normal;

import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("학년을 입력하세요 : ");
        int grade = sc.nextInt();

        System.out.print("반을 입력하세요 : ");
        int classroom = sc.nextInt();

        sc.nextLine(); // sc.nextLine() 이전에 써주기 안쓰면 줄바꿈이 형성됨

        System.out.print("이름을 입력하세요 : ");
        String name = sc.nextLine();

        System.out.print("키를 입력하세요 : ");
        double height = sc.nextDouble();

        sc.nextLine(); // sc.nextLine() 이전에 써주기 안쓰면 줄바꿈이 형성됨

        System.out.print("성별을 입력하세요 : ");
        char gender = sc.nextLine().charAt(0);

        StudentDTO st = new StudentDTO(grade, classroom,name,height,gender);

        st.printInformation();


    }
}
