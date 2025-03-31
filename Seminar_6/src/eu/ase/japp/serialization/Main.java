package eu.ase.japp.serialization;

import java.io.*;

public class Main {
    public static void main(String[] args) {

        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("file");
            //BufferedOutputStream bos = new BufferedOutputStream( fos);
            DataOutputStream dos = new DataOutputStream(fos);

            dos.writeFloat((45.34f));

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }


}
