package ro.ase.acs.server;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.Scanner;

public class UDPServer extends Thread {
    private final int port = 7777;
    private DatagramSocket socket;


    public UDPServer() {
        try {
            socket = new DatagramSocket(port);
            System.out.println("UDP Server started on port " + port );
        } catch (SocketException e) {
            throw new RuntimeException(e);
        }
    }
    @Override
    public void run() {
      while (true) {
          byte[] buffer = new byte[1024];
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

    public static void main(String[] args) {
     final int port = 7777;
     Scanner scanner = new Scanner(System.in);
     UDPServer server = new UDPServer();

     try{
         byte[] buffer = new byte[1024];
         DatagramPacket packet = new DatagramPacket(buffer, buffer.length);

         server.socket.receive(packet);
         String message = new String(packet.getData(), 0, packet.getLength());
         System.out.println(message);


         server.start();

         InetAddress address = packet.getAddress();
         int clientPort = packet.getPort();

         while(true){
             String msg = scanner.nextLine();
             byte[] buffer2= msg.getBytes();

             DatagramPacket packet2 = new DatagramPacket(buffer2,buffer2.length,address,clientPort);
             server.socket.send(packet2);
         }


     } catch (IOException e) {
         e.printStackTrace();
     }
    }
}
