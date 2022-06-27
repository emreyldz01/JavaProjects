package myProject;

import java.util.Scanner;

public class VizeFinal extends Date {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int z =1;
		int x = 1;
		
		
		while(true) {
			x =sc.nextInt();
			
			
		if(x==0) 
		{
			System.out.println("program sonlandi");
			sc.close();
			break;
		}
		else {
			z =sc.nextInt();
			if(z==0) 
			{
				System.out.println("program sonlandi");
				sc.close();
				break;
			}
			z= (int) (Math.round(x*0.4) + z*0.6);
			System.out.println(z);
		if(z>83&&z<=100) 
		{
			System.out.println("AA");
		}
		else if(z>69&&z<83) 
		{
			System.out.println("BA");
		}
		else if (z>50 && z<69) 
		{
			System.out.println("BB");
		}
		else if(z==50) 
		{
			System.out.println("geçti");
		}
		else {System.out.println("kaldı");}}}
		sc.close();
	}
	}


