package myProject;

import java.util.Scanner;
	
	
public class Radar {
	private static int amount, count =0;
	private static int ceza(int hız) 
	{
		if(hız>120) 
		{	count++;
			System.out.println(hız+ " hızı için ceza 2000");
			amount+=2000;
			return amount;
		}
		else if(hız>95&&hız<120) 
		{count++;
			//radar'a girince amountı sıfırlamamız daha doğru olmaz mı
			System.out.println(hız+ " hızı için ceza 1200");
			amount+=1200;
			return amount;
		}
		else if(hız>79&&hız<95) 
		{count++;
			System.out.println(hız+ " hızı için ceza 800");
			amount+=800;
			return amount;
		}
		else 
		{count++;
			System.out.println(hız+ " hızı için ceza 0");
			amount+=0;
			return amount;
		}
	}

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int x = 5;
		do
		{
			x = sc.nextInt();
			if(x>0) 
			{System.out.println("alınan toplam ceza: "+ceza(x));
			System.out.println("radardan "+count+" kere geçildi");}
			else {System.out.println("gecersiz deger");}
		}while(true);
		

	}

}
