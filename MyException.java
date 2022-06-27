package myProject;

import java.util.Scanner;

public class MyException extends Exception{
	private static final long serialVersionUID = -468055589841571816L;
	
	public MyException(String message) 
	{
		super(message);
	}
	public static void main(String[] args) throws MyException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("bir sayı gir");
		int number = sc.nextInt();
		
		if(number<0) 
		{
			throw new MyException("Sıfırdan küçük giremezsiniz");
		}
		else
		{
			System.out.println(Math.pow(number, 2));
		}
	}

}
