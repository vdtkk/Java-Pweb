package Diziler;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String[] ogrenciler = new String[3];
		ogrenciler[0]="vedat";
		ogrenciler[1]="ahmet";
		ogrenciler[2]="mehmet";
		ogrenciler[3]="ali";
		ogrenciler[4]="elif";
		
		System.out.println("--------------");
		System.out.println(ogrenciler[1]);
		
		
		for(int i=0; i<ogrenciler.length; i++) {
			
			System.out.println(ogrenciler[i]);
		}
		
		
		
		for(String ogrenci:ogrenciler){
			
			System.out.println(ogrenci);
			
		}
	}

}
