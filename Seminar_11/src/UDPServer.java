import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.Scanner;

public class UDPServer extends Thread {
    private final int port = 7777;
    private DatagramSocket socket;

    @Override
    public void run() {

        super.run();
        while (true) {
            byte[] buffer = new byte[256];
            DatagramPacket packet = new DatagramPacket(buffer, buffer.length);
            try {
                socket.receive(packet);
                String message = new String(packet.getData(), 0, packet.getLength());
                System.out.println(message);

            } catch (IOException e) {
                throw new RuntimeException(e);
            }


        }
    }

    public UDPServer() {
        try {
            socket = new DatagramSocket(port);
            System.out.println("Server started on port " + port);
        } catch (SocketException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        final int port = 7777;
        Scanner scanner = new Scanner((System.in));
        UDPServer server = new UDPServer();
        try {

            byte[] buffer = new byte[256];
            DatagramPacket packet = new DatagramPacket(buffer, buffer.length);

            server.socket.receive(packet);
            String message = new String(packet.getData(), 0, packet.getLength());
            System.out.println(message);

            //raspund la mesaj
            InetAddress clientAddress = packet.getAddress();
            int clientPort = packet.getPort();

            server.start();

            while (true) {


                String message2 = scanner.nextLine();
                byte[] buffer2 = message2.getBytes();
                DatagramPacket packetToBeSend = new DatagramPacket(buffer2, buffer2.length, clientAddress, clientPort);

                server.socket.send(packetToBeSend);
            }


        } catch (IOException e) {
            e.printStackTrace();
        }

        scanner.close();


    }
}
