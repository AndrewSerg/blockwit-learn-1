package com.blockwit.learn1.AndrewSerg;

public class Task3 {
    public static void main(String[]args){
        Book book = new Book("Harry Potter","Rowling J.K.",2021 );
        System.out.println("Книга называется " + book.getTitle() );
        System.out.println("Автор книги "+ book.getAuthor());
        System.out.println("Год выпуска книги "+ book.getYearRelease());
    }
}
