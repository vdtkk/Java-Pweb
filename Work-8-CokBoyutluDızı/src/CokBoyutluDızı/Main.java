package CokBoyutluDızı;

public class Main {

	public static void main(String[] args) {
		String[][] sehirler=new String[3][3];

		sehirler[0][0]="İstanbul";
		sehirler[0][1]="ankara";
		sehirler[0][2]="bursa";
		sehirler[1][0]="konya";
		sehirler[1][1]="İstanbul";
		sehirler[1][2]="antep";
		sehirler[2][0]="ağrı";
		sehirler[2][1]="urfa";
		sehirler[2][2]="hatay";
		
		for(int i=0;i<=2; i++) {
			System.out.println("---------");
			for(int j=0; j<=2;j++) {
				System.out.println(sehirler[i][j]);
				
			}
		}
		
		
	}

}
