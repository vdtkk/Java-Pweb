package intro;

public class recapDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String ortaMetin="ilginiz çekebilir";
		System.out.println(ortaMetin);
		
		double dolarBugun=26.6;
		double dolarDun=25.6;
		
		
		String okYonu="";
		if(dolarBugun<dolarDun) {
			
		okYonu="down.svg";
		System.out.println(okYonu);
		}
		
		else if(dolarBugun>dolarDun) {
			okYonu="up.svg";
			System.out.println(okYonu);
		}
		else
			
		{ okYonu="equals.svg";
			System.out.println(okYonu);
		
		}
			
			

			
			
		}
	}


