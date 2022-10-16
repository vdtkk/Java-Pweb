package asal;

public class Main {

	public static void main(String[] args) {


			int number =5;
			
			boolean isPrime=true;
			int remainder=number %2;
			
			if(number<2) {
				System.out.println("gçersiz sayı");
			return;}
			
		for(int i=0; i<remainder;i++) {
			
			if(number % 2 ==0) {
				
				isPrime=false;
			}
			
			
			if(isPrime) {
				
				System.out.println("sayı asaldır.");
				
			}
			else {
				
				System.out.println("sayı asal değildir.");
			}
			
		}
		

	}

}
