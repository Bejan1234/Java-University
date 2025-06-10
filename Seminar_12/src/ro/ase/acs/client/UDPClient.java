package ro.ase.acs.client;

import java.io.IOException;
import java.net.*;
import java.util.Scanner;

public class UDPClient extends Thread {
    private DatagramSocket socket;

    public UDPClient() {
        try {
            socket = new DatagramSocket();
        } catch (SocketException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void run() {
        while(true){
            byte[]buf = new byte[1024];
            DatagramPacket packet2 = new DatagramPacket(buf, buf.length);
            try{
                socket.receive(packet2);
                String message = new String(packet2.getData(), 0, packet2.getLength());
                System.out.println(message);

            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UDPClient client = new UDPClient();
        client.start();
        try{
            InetAddress address = InetAddress.getByName("localhost");
            int port = 7777;
            while(true){
                String message = scanner.nextLine();
                byte[] data = message.getBytes();

                DatagramPacket packet = new DatagramPacket(data, data.length, address, port);
                client.socket.send(packet);
            }
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
