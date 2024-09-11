package com.ohgiraffers.level01.basic;

public class Application {
    public static void main(String[] args) {
        MemberDTO mb = new MemberDTO();

        System.out.println("id : " + mb.GetId());
        System.out.println("pwd : " + mb.GetPwd());
        System.out.println("name : " + mb.GetName());
        System.out.println("age : " + mb.GetAge());
        System.out.println("gender : " + mb.GetGender());
        System.out.println("phone : " + mb.GetPhone());
        System.out.println("email : " + mb.GetEmail());

        MemberDTO mb2 = new MemberDTO();
        mb2.SetId("user01");
        mb2.SetPwd( "pass01");
        mb2.SetName("홍길동");
        mb2.SetAge(20);
        mb2.SetGender('M');
        mb2.SetPhone("010-1234-5678");
        mb2.SetEmail("hong123@greedy.com");

        System.out.println("변경 후 id : " + mb2.GetId());
        System.out.println("변경 후 pwd : " + mb2.GetPwd());
        System.out.println("변경 후 name : " + mb2.GetName());
        System.out.println("변경 후 age : " + mb2.GetAge());
        System.out.println("변경 후 gender : " + mb2.GetGender());
        System.out.println("변경 후 phone : " + mb2.GetPhone());
        System.out.println("변경 후 email : " + mb2.GetEmail());
    }
}
