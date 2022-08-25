  
public class Hcf {

	public static void main(String[] args) {  //Main method 
		int a =60; //Declaring First number(a) as 60
		int b =36; // Declaring second number(b) as 36
		int i , hcf =0; //Initializing i and hcf
		for(i=1;i<=a;i++) {//loop where i starts from 1 and is less of equal to 60
			if(a%i==0 && b%i==0) {// checking where a modulo i and b modulo i is equal to zero
				hcf =i;
			}
		
			 
		}
		 System.out.print("HCF of 60 and 36 is: " +hcf);//printing hcf of two numbers 
	}

}