package sayiBulma;

public class Main {

	public static void main(String[] args) {
		int sayilar[]= new int[] {1,2,3,4,5,6};
		int aranacakSayi=1;
		boolean varmi=false;
		
		
		for(int sayi: sayilar)
		{
			if(sayi==aranacakSayi) {
				
				varmi=true;
				break;
			}
		

	}
		if(varmi) {
			
			System.out.println("sayı mevcut");
		}
		else System.out.println("sayı mevcut değil");
	  	
}
}