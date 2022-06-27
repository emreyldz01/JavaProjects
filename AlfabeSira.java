package myProject;

import java.util.Scanner;

public class AlfabeSira {
	static Scanner sc = new Scanner(System.in);
	static String alfabe = "defgauğıvijçklümnocöprsyhbştz";
	public static boolean siraKontrol(String[] kelimeler) 
	{
		char temp = '*';
		for (int x = 0; x < 3; x++) {
			char[] tempArr = kelimeler[x].toCharArray();
		for (int i = 0; i <= kelimeler[x].length() - 1; i++)
		{
		for (int j = 1; j <= kelimeler[x].length() - 1; j++)
		{
	
			if (getIndex(tempArr[j - 1] )> getIndex(tempArr[j]))
			{
			temp = tempArr[j - 1];
			tempArr[j - 1] = tempArr[j];
			tempArr[j] = temp;
			}
		
		}
		}
		System.out.println(tempArr);
		}
		return true;
		
	}
	public static int getIndex(char ch)
	{
		
		return alfabe.indexOf(ch);
	} 
	{
		
	}
	public static void main(String[] args) {
		
		
		String[] kelime = {"ahmet","ayşe","mehmet"};
		System.out.println(alfabe.indexOf('f'));
		siraKontrol(kelime);
	}

}
