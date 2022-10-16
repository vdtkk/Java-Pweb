package sesliHarfler;

import java.lang.reflect.Array;

public class Main {

	public static void main(String[] args) {
		char harf='i';
		
		
		char[] sesliler={'a','e','i','ö','ü'};
		 
		for (int i=0;i<=sesliler.length;i++) {
			
			
		if(sesliler[i]==harf) {
			
			System.out.println("sayı mevct");
		break;
		}
	
		}
		
		
		//switch ile 
		
		switch (harf) {
		case 'A' :
		case 'I':	
		case 'O':
		case 'U':
		
		System.out.println("kalın sesli harf");
		default:
			System.out.println("ince sesli harf");
		}
		
		
			
			
		}
		

	}


