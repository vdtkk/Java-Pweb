package mukemmleSayi;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {

//kendisinden başka pozitiftüm tam bölenlerinin sayısının toplamı kendisine eşit olan sayıalra denir.
		
		//örnek 6 ---> 1,2,3 bölünür toplamları 6 dır.
		
		
		int number=6;
		
		int total=0;
		
		for(int i =1; i<number;i++){
			
			if(number % i==0) {
				
				total=total+1;
			}
		}
		if(total==number) {
			System.out.println("müko sayıdır.");

		}
		else {	System.out.println("müko sayı değildir.");
		}

	}

}
