package myProject;

import java.util.Scanner;

public class AklindaBirSayiTut {
	private static int aklindaBirSayi(int sayi) 
	{
		int result = ((((sayi)*2)+22)/2) - sayi;
		return result;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int sayi;
		while(true) 
		{
			System.out.println("0 ile 100 arasında bir değer giriniz");
			sayi = sc.nextInt();
			if(sayi>0&&sayi<100) 
			{
				System.out.println(aklindaBirSayi(sayi));
			}
			else 
			{
				System.out.println("gecersiz deger");
			}
			
		}
		
		
		
		
	}

}
