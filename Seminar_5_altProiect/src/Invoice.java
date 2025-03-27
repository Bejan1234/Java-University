import java.io.*;

public class Invoice {
    private double[] prices;
    private int[] units;
    private String[] descriptions;

    public Invoice(double[] prices, int[] units, String[] descriptions) {
        this.prices = prices;
        this.units = units;
        this.descriptions = descriptions;
    }

    public void saveInvoiceToFile(String filename) {
        try (DataOutputStream dos = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(filename)))) {
            for (int i = 0; i < prices.length; i++) {
                dos.writeDouble(prices[i]);
                dos.writeInt(units[i]);
                dos.writeUTF(descriptions[i]);
            }
        } catch (IOException e) {
            throw new RuntimeException("Error saving invoice", e);
        }
    }

    public double readInvoiceFromFileAndCalculateTotal(String filename) {
        double total = 0.0;
        try (DataInputStream dis = new DataInputStream(new BufferedInputStream(new FileInputStream(filename)))) {
            while (true) {
                double price = dis.readDouble();
                int unit = dis.readInt();
                String description = dis.readUTF();
                total += unit * price;
                System.out.printf("Read line: %s, unit = %d, price = %.2f%n", description, unit, price);
            }
        } catch (EOFException eofe) {
            System.out.println("End of file");
            System.out.println(total);
        } catch (IOException e) {
            throw new RuntimeException("Error reading invoice", e);
        }
        return total;
    }
}
