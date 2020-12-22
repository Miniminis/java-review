package com.javareview.objects;

public class ObjectTest {
    public static void run() {
        Book book = new Book("토지", "박경리");
        System.out.println(book);

        String str = new String("토지");
        System.out.println(str);

        /*
        * com.javareview.objects.Book@74a14482
            토지
        * */

        /*
        * Book{title='토지', author='박경리'}
            토지
        * */
    }
}

class Book{
    String title;
    String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}