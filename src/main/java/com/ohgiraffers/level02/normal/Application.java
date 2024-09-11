package com.ohgiraffers.level02.normal;

public class Application {
    public static void main(String[] args) {

//

        BookDTO bk = new BookDTO();
        bk.GetTitle();
        bk.GetPublisher();
        bk.GetAuthor();
        bk.GetPrice();
        bk.GetDiscountRate();

        bk.printInformation();

        BookDTO bk2 = new BookDTO("자바의 정석", "도우출판", "남궁성");
        bk2.printInformation();

        BookDTO bk3 =new BookDTO("홍길동전", "활빈당", "허균", 50000000, 0.5);

        bk3.printInformation();

    }
}
