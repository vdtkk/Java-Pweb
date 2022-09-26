package swicthBloklar;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char grade= 'a';
		
		switch(grade){
			
			case 'A':
				System.out.println("mükemmel gçetiniz..");
				break;
			case 'B':
				System.out.println("çok güzel: Geçtiniz");
				break;
			case 'C':
				System.out.println("fena değil gçetiniz");
				break;
			case 'F':
				System.out.println("KALDINIZ");
				break;
		
			default:
				System.out.println("Gersiz Not Girdiniz.");
		}
		
		
		
		
	}

}
