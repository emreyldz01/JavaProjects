package myProject;

import java.util.Scanner;

public class asalSayi {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		int num = sc.nextInt();
		for(int i = num; i>1;i--) 
		{
			if(num%i==0) 
			{
				count++;
			}
		}
		if(count==1) 
		{
			System.out.println(num+" asal bir sayidir");
			}
		else {System.out.println(num + " asal sayi değildir");}
	}

}
