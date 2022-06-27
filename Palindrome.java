package myProject;

import java.util.Scanner;

public class Palindrome {

	public static boolean isPalindrome(String str) 
	{
		for(int i = 0;i<str.length()/2;i++) 
		{
			if(str.charAt(i)!=str.charAt(str.length()-(i+1)))
			{
				//System.out.println(" "+str.charAt(i)+"    "+ str.charAt((str.length()-(i+1))));
				System.out.println(str+": is not palindrome");
				return false;
			}
			
		}
		System.out.println(str+": is palindrome");
		return true;	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println(isPalindrome(sc.nextLine()));
	}

}
