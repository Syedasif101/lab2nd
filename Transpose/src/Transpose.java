// Program to transpose of matrix
public class Transpose {
	public static void main(String[] args) {//Main method
		//Given matrix 
		int given[][]= {{1,2},{4,5},{8,9}};
		//another matrix to store transpose of matrix 
		int transpose[][]=new int[2][3];//matrix with 2 rows and three columns
		//Transpose of matrix using for loop
		for(int i=0;i<2;i++) {//for rows 
			for(int j=0;j<3;j++) { //for columns
				transpose[i][j]=given[j][i];
			}
		}
		
		System.out.println("Transpose of matrix:");//Displaying transpose of matrix 
		for(int i=0;i<2;i++){  //rows  
			for(int j=0;j<3;j++){ //columns  
			System.out.print(transpose[i][j]+" "); //printing matrix transpose 
		
	}
			System.out.println();//new line 
		
		

		}
	}
}

