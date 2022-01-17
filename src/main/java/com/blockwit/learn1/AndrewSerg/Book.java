package com.blockwit.learn1.AndrewSerg;

public class Book {
    String Title;
    String Author;
    int YearRelease;

    public Book (String inputTitle,String inputAuthor,int inputYearRelease){
        Title=inputTitle;
        Author= inputAuthor;
        YearRelease=inputYearRelease;
    }
    public String getTitle(){
        return Title;
    }
    public String getAuthor(){
        return Author;
    }
    public  int getYearRelease(){
        return YearRelease;
    }
}

