package myProject;

import java.util.Scanner;

public class Faktoriyel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int result = 1;
		sc.close();
		for(int i = num; 1<i ;i--) 
		{
			result *=i;
			
		}
		System.out.println(num+"! = "+result);
	}

}
