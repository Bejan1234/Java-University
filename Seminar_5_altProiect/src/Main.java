import java.io.*;

//citirea si scrierea din fisier (sunt mai multe metode dar o sa lucram cu streamuri)
public class Main {
    public static void main(String[] args) {

        double[] prices = new double[] {19.99, 8.79, 15.99};
        int[] units = new int[] { 12, 8, 9};
        String[] descriptions = new String[] {"Pen", "Mug", "T-shirt"};

        try {
            // Folosește FileOutputStream pentru a deschide fișierul în mod corect pentru scriere
            FileOutputStream fos = new FileOutputStream("info.txt");
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            DataOutputStream dos = new DataOutputStream(fos);

            // Scrierea datelor în fișier
            for (int i = 0; i < prices.length; i++) {
                dos.writeDouble(prices[i]);
                dos.writeInt(units[i]);
                dos.writeUTF(descriptions[i]);
            }

            // Închidere a DataOutputStream
            dos.close();
            DataInputStream dis = new DataInputStream(new BufferedInputStream(new FileInputStream("info.txt")));
            double price;
            int unit;
            String description;
             for(int i = 0; i < prices.length; i++) {
                 price = dis.readDouble();
                 unit = dis.readInt();
                 description = dis.readUTF();
                 System.out.println(description + " "+ unit + " " + price);
             }

        } catch (FileNotFoundException e) {
            // Tratarea erorii de fișier neexistent
            System.out.println("Fișierul nu a fost găsit: " + e.getMessage());
        } catch (IOException e) {
            // Tratarea altor erori de I/O
            System.out.println("Eroare la scrierea în fișier: " + e.getMessage());
        }
    }
}
