package myProject;

import java.util.Scanner;

public class StringReverse {
	
	public static String reverse(String str) 
	{
		String temp = "";
		for(int i = str.length()-1;i>=0;i--) 
		{
			temp += str.charAt(i);
		}
		return temp;
	}
	public static String firsAndLast(String str) 
	{
		String temp = "";
		
		for(int i = 0;i<str.length();i++) 
		{
			if(i==0||i==str.length()-1) 
			{
				temp += str.charAt(i);
			}
			else{temp+='*';}
		}
		return temp;
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(reverse(str));
		System.out.println(firsAndLast(str));
		sc.close();
	}
}
