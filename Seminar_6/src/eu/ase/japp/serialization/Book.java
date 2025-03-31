package eu.ase.japp.serialization;

import java.io.*;

public class Book implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;
    private int publishingYear;
    private String title;
    private Author author;

    public Book(int publishingYear, String title, Author author) {
        this.publishingYear = publishingYear;
        this.title = title;
        this.author = author;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

//    public void saveBookToFile(String filename) {
//        try {
//
//            DataOutputStream dos = new DataOutputStream((new BufferedOutputStream(new FileOutputStream(filename))));
//            dos.writeInt(getPublishingYear());
//            dos.writeUTF(getTitle());
//            dos.writeUTF(getAuthor());
//
//            dos.close();
//
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//
//
//    }
//
//    public Book readBookFromFIle(String filename) throws IOException {
//        DataInputStream dis = new DataInputStream(new BufferedInputStream(new FileInputStream(filename)));
//
//        Book book = new Book(dis.readInt(), dis.readUTF(), dis.readUTF());
//        dis.close(); // Close the stream
//        return book;
//    }


    @Override
    public String toString() {
        return "Book{" +
                "publishingYear=" + publishingYear +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }

}
