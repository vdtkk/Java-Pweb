package methods;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {	
		
		String mesaj="Bugün hava çok güzel";
		String yenimesaj= mesaj.substring(0,2);
		System.out.println(yenimesaj);
		
		int say=topla(15,2);
		System.out.println(say);
		
		
		int toplam2=topla2(2,3,4,5,6);
		System.out.println(toplam2);
		
	}
	
	public static void ekle() {
		System.out.println("eklendi");
		
		
	}
	public static void sil() {
		
		System.out.println("silindi");
		
	}
	public static void guncelle() {
		
		System.out.println("guncellendi");
		
		
	}
	
//istenilen kadar asyı göndermek için variable argumanı kullanılır.
	
	public static int topla2(int... sayilar){
	int toplam=0;
	 for (int say:sayilar) {
		 
		 toplam+=say;
		 
	 
	}
	return toplam;
	
}
			
	public static int topla(int say1, int say2) {
		
		
		return say1+say2;
		
		
	}

}
