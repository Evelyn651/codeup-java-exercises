package practice;

import java.awt.print.Book;
import java.util.Arrays;

public class BooksTestDrive {
    public static void main(String[] args){

        Books[] myBooks = new Books[3];
        int x =0;
        myBooks[0] = new Books(); //
        myBooks[1] = new Books(); //
        myBooks[2] = new Books(); //the original example was missing this part. making new books to put into the array
        myBooks[0].title = "The Grapes of Wrath";
        myBooks[1].title = "The Great Gatsby";
        myBooks[2].title = "The Java Cookbook";
        myBooks[0].author = "John Steinbeck";
        myBooks[1].author = "F. Scott Fitzgerald";
        myBooks[2].author = "Ian Eisenhower";

        while(x < myBooks.length){
            System.out.println(myBooks[x].title);
            System.out.println(" by ");
            System.out.println(myBooks[x].author);
            x = x + 1;

        }

    }
}
