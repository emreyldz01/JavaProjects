package myProject;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/**/	 int n1=0,n2=1,n3;
		 
		Scanner sc = new Scanner(System.in);
		System.out.println("kaçıncı elemana kadar görmek isterseniz");
		int move = sc.nextInt();
		sc.close();
		 System.out.print(n2);//printing 0 and 1   
		 for(int i=2;i<move;++i)//loop starts from 2 because 0 and 1 are already printed    
		 {    
			n3=n1+n2;    
			  System.out.print(" "+n3);    
			  n1=n2;    
			  n2=n3;    
		}
	}

}
