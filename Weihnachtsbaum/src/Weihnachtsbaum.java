import java.util.Random;      

public class Weihnachtsbaum {
	public static void main(String[] args){
		
		int breite=100;
		int stars=1;
		int staticbreite=breite;
		Random rand=new Random();
		
		while (breite>0){//Leerzeichen
			
			for (int i=0; i<breite/2;i++){
				System.out.print(" ");	
				
			}
			
			//Nadeln
			for (int i=0; i<stars;i++){
				
				int number=rand.nextInt(15)+1;
				
				if (number==1){
					System.out.print("*");
					
				}
				else{
					System.out.print("x");
				}
			}
			
			stars+=2;
			
			System.out.println("");
	
			breite -=2;
		
	
	}
		//Stamm
		for (int i=0; i<staticbreite/2;i++){
			System.out.print(" ");
		}
		System.out.print("x");
}
}
