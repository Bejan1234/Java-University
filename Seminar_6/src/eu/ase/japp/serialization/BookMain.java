package eu.ase.japp.serialization;

import java.io.*;

public class BookMain {

    public static void main(String[] args) throws IOException {

        Outer o = new Outer();
        System.out.println(o.getId());

        Outer.Inner i = o.new Inner();
        System.out.println(o.getId());


//        Book b1 = new Book (1925, "The Trial", "Franz Kafka");
//
//        b1.saveBookToFile("book1.bin");
//
//        Book b2 = new Book(0, "", "");
//        b2 = b2.readBookFromFIle("book1.bin");

        Author a1 = new Author(1883, "Franz Kafka");
        Book b1 = new Book (1925, "The Trial", a1);
        Book b2 = new Book (1926, "The Castle", a1);

        boolean stmt = a1 == b1.getAuthor() && b1.getAuthor() == b2.getAuthor();
        System.out.println(stmt);


        FileOutputStream fos = new FileOutputStream("sbook.bin");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(b1);
        oos.writeObject(b2);
        oos.writeObject(a1);
        oos.close();
    }
}
