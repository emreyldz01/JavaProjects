package Projects;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import javax.swing.JOptionPane;

public class Client
{
	

	
	public static void main(String[] args)
	{
		clientFunction();
	}

	public static void clientFunction()
	{

		// port, ipAdress, user data
		String ipAdress = SocketOne.ipAdress;
		String vocabulary = JOptionPane.showInputDialog("Please Type Something");

		try (DataOutputStream dataOutputStream = new DataOutputStream(new Socket(ipAdress, 1234).getOutputStream()))
		{
			dataOutputStream.writeUTF(vocabulary);
		} catch (IOException ex)
		{
			System.out.println("IO");
			ex.printStackTrace();
		} catch (Exception e)
		{
			System.out.println("EX");
			e.printStackTrace();
			// TODO: handle exception
		}
	}}