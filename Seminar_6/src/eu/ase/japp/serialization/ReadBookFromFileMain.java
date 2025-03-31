package eu.ase.japp.serialization;

import java.io.*;

public class ReadBookFromFileMain {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        FileInputStream fis = new FileInputStream("sbook.bin");
        ObjectInputStream ois = new ObjectInputStream(fis);


        Book b200 = (Book) ois.readObject();
        Book b100 = (Book) ois.readObject();

        Author a = (Author) ois.readObject();

        boolean stmt = a ==  b100.getAuthor() && b100.getAuthor() == b200.getAuthor();
        System.out.println(stmt);


        System.out.println(b100);
        System.out.println(b200);
        System.out.println(a);


    }
}