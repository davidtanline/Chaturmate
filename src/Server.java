package src;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.io.BufferedReader;
import java.io.PrintWriter;

public class Server implements Runnable {

    @Override
    public void run() {
        try {
            ServerSocket server = new ServerSocket(1234);
            Socket client = server.accept();
        } catch (IOException e) {
            // TODO: handle
        }
    }

    class ConnectionHandler implements Runnable {

        private Socket client;
        private BufferedReader in;
        private PrintWriter out;

        public ConnectionHandler(Socket client) {
            this.client = client;
        }

        @Override
        public void run() {
            try {
                out = new PrintWriter(client.getOutputStream(), true);
            } catch (IOException e) {
                // TODO: handle
            }
        }
    }
}