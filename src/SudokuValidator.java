import java.util.*;

public class SudokuValidator {
	//SudokuValidator m = new SudokuValidator();
	Scanner in = new Scanner(System.in);
	public Boolean validateSudoku(int m)
	{    
		
		int i,j,k;
		int[][] matrix = new int[m][m];
		boolean result = true;
		System.out.println("Enter the "+m+"x"+m+" matrix:");
		if(m==3)
		{
			System.out.println("!!!Just Enter value between 1 to 3 only.!!!!");
		}else if(m==5)
		{
			System.out.println("!!!Just Enter value between 1 to 5 only.!!!!");
		}else if(m==6)
		{
			System.out.println("!!!Just Enter value between 1 to 6 only.!!!!");
		}else if(m==7)
		{
			System.out.println("!!!Just Enter value between 1 to 7 only.!!!!");
		}
		else if(m==9)
		{
			System.out.println("!!!Just Enter value between 1 to 9 only.!!!!");
		}
		for (i = 0; i <m; i++) {
			System.out.println("Enter the "+(i+1)+"st Row:");
			for (j = 0; j <m; j++) {
				matrix[i][j] = in.nextInt();
				if(matrix[i][j]>m)
				{
					System.out.println("!!!!!!!!!!Error:Enter values between 1 and "+m+" only.!!!!!!!!!!!");
					System.exit(0);
				}
				
			}
		}
		//row
		for (i = 0; i < m; i++) {
			for (j = 0; j <m; j++) {
				int temp = matrix[i][j];
				for (k = j + 1; k <m; k++) {
					if (temp == matrix[i][k]) {
					    result = false;
					}
				}
			}
		}
	
			for (j = 0; j <m; j++) {
				int temp = matrix[0][j];
				for (k = 1; k <m; k++) {
					if (temp == matrix[k][j]) {
					    result = false;
					}
				}
			}
		
		
		return result;
		
	}
	public boolean exampleCases(int[][] matrix,int n)
	{   
		int i,j,k;
		int[][] matrix1 = matrix;
		boolean result = true;
		for (i = 0; i < n; i++) {
			for (j = 0; j < n; j++) {
				int temp = matrix1[i][j];
				for (k = j + 1; k < n; k++) {
					if (temp == matrix1[i][k]) {
						result = false;
					}
				}
			}
		}
		for (j = 0; j <n; j++) {
			int temp = matrix[0][j];
			for (k = 1; k <n; k++) {
				if (temp == matrix[k][j]) {
				    result = false;
				}
			}
		}
		return result;
	}
	

}
