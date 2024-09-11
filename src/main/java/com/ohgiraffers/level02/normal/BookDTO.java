package com.ohgiraffers.level02.normal;

public class BookDTO {
    private String title;
    private String publisher;
    private String author;
    private int price;
    private double discountRate;

    public BookDTO(){}

    public BookDTO(String title, String publisher, String author){
        this.title=title;
        this.publisher=publisher;
        this.author=author;
    }

    public BookDTO(String title, String publisher, String author, int price, double discountRate){
        this.title=title;
        this.publisher=publisher;
        this.author=author;
        this.price=price;
        this.discountRate=discountRate;
    }

    public void SetTitle(String title){
        this.title=title;
    }

    public void SetPublisher(String publisher){
        this.publisher=publisher;
    }

    public void SetAuthor(String author){
        this.author=author;
    }

    public void SetPrice(int price){
        this.price=price;
    }

    public void SetDiscountRate(double discountRate){
        this.discountRate=discountRate;
    }

    public String GetTitle(){
        return title;
    }

    public String GetPublisher(){
        return publisher;
    }

    public String GetAuthor(){
        return author;
    }

    public int GetPrice(){
        return price;
    }

    public double GetDiscountRate(){
        return discountRate;
    }

    public void printInformation(){
        System.out.println(this.title+","+this.publisher+","+this.author+","+this.price+","+this.discountRate);
    }

}
