package Stringler;

public class Main {

	public static void main(String[] args) {
		
		
		String mesaj ="bugün hava güzel.";
		System.out.println(mesaj);	
			
		/*
		 * System.out.println("eleman sayısı :"+ mesaj.length()); //mesajın uzunluğunu
		 * gösterir System.out.println("5. eleman :"+ mesaj.charAt(4)); //4. karakterini
		 * yazar System.out.println(mesaj.concat(" yaşasın")); //sonuna var sa cünle
		 * kelemeye yarar System.out.println(mesaj.startsWith("A")); //mesaj ne ile
		 * başlıyor. System.out.println(mesaj.endsWith(".")); // mesaj stringi ne ile
		 * bitiryor.
		 */		
		
		System.out.println(mesaj.replace(' ','-')); //karakterleri değiştirmeye yarar. örn URL verceksinz urlde boşluk olamyınca aralara - koymak istediğimiz.de
											// bugün hava çok güzel değişkenine arasına boşluk yerine - koydu
		
		
		
	}

}
