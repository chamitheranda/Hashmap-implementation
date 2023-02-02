package com.company;

public class Node {
    String bookId;
    String bookName;
    String author;
    int numOfPages;
    int ratingCount;
    Node next;

    public Node(String bookId, String bookName, String author, int numOfPages, int ratingCount) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.author = author;
        this.numOfPages = numOfPages;
        this.ratingCount = ratingCount;
        this.next=null;
    }

    public Node(){
        next=null;
        this.bookId=null;
        this.bookName=null;
        this.author=null;
        this.numOfPages=0;
        this.ratingCount=0;
    }
}
