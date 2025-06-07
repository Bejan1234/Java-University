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
        super.run();
        while (true) {
            byte[] buffer = new byte[256];
            DatagramPacket packet2 = new DatagramPacket(buffer, buffer.length);
            try {
                socket.receive(packet2);
                String message2 = new String(packet2.getData(), 0, packet2.getLength());

                System.out.println(message2);

            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }


    }

    //Rulezi main() → creează clientul + pornește threadul
    //
    //Threadul (run) ascultă răspunsuri de la server
    //
    //main() citește mesaje și le trimite

    public static void main(String[] args) throws UnknownHostException {

        Scanner scanner = new Scanner((System.in));
        UDPClient client = new UDPClient();
        client.start();
        try {
            InetAddress address = InetAddress.getByName("localhost");
            int port = 7777;
            while (true) {
                String message = scanner.nextLine();
                byte[] bytes = message.getBytes();

                DatagramPacket packet = new DatagramPacket(bytes, bytes.length, address, port);

                client.socket.send(packet);

            }


        } catch (IOException e) {
            e.printStackTrace();
        }

        scanner.close();
    }
}
