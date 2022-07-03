package Projects;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

public class SocketPort {
	static Random random = new Random();
	public static final int PORT = 1234;
	static String ipAdress = "localhost";
	static Client client = new Client();


	static void serverFunction() {
		String clientValue;
		// PORT = randomPort();
		System.out.println("Port: " + PORT);
		System.out.println("Server Ready...");
		try (DataInputStream dataInputStream = new DataInputStream(new ServerSocket(PORT).accept().getInputStream())) {
			clientValue = dataInputStream.readUTF();
			int number = Integer.parseInt(clientValue);
			number = (int) Math.pow(number, 2);
			System.out.println("\n");
			System.out.println(number);
		} catch (Exception e) {
			System.err.println("Error");
			e.printStackTrace();
			
		}
	}
	
	// Server
	private static void serverMethod1() {
		try {
			ServerSocket socket = new ServerSocket(randomPort());// port oluşturma
			System.out.println("Server Ready");
			Socket successPort = socket.accept();// Socket Accept
			InputStreamReader inputStreamReader = new InputStreamReader(successPort.getInputStream());// reading
			BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
			
			// get the client data and show
			String str = bufferedReader.readLine();
			System.out.println("Client : " + str);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	private static final int randomPort()
	{

		return (random.nextInt(1024, 65535) + 1);

	}

}
