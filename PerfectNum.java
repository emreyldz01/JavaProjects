package myProject;

import java.util.Scanner;

public class PerfectNum {
	
	private static boolean isPerfect(int num) 
	{
		int counter=0;
		for(int i = num-1;0<i;i--) 
		{
			if(num%i==0) 
			{
				counter+=i;
			}
		}
		return (counter==num);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		if(isPerfect(num)) 
		{
			System.out.println(num+": is perfect number");
		}
		else 
		{
			System.out.println(num+": is not perfect number");
		}
		
		//System.out.println(isPerfect(sc.nextInt()));

	}

}
