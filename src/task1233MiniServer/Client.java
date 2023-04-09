package task1233MiniServer;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class Client implements Runnable{
    Socket socket;
    Scanner in;
    PrintStream out;
    ChatServer server;


    public Client(Socket socket, ChatServer server){

        this.socket = socket;
        this.server = server;
        //запускаем поток
        new Thread(this).start();   //1.2 - клиент сам себя запускает
    }

    void receive(String message){   //получаем  сообщение от других клиентов
        out.println(message);
    }

    public void run() {
        try {
            // получаем потоки ввода и вывода
            InputStream is = socket.getInputStream();
            OutputStream os = socket.getOutputStream();

            // создаем удобные средства ввода и вывода
            in = new Scanner(is);
            out = new PrintStream(os);

            // читаем из сети и пишем в сеть
            out.println("Welcome to chat!");
            String input = in.nextLine();
            while (!input.equals("bye")) {
                server.sendAll(input);
                input = in.nextLine();  //принимаем следующую строчку
            }
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
