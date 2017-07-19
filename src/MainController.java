
import java.util.Scanner;

public class MainController {
	public static void main(String args[]) {
		MainController m = new MainController();
		SudokuValidator s = new SudokuValidator();
		Scanner in = new Scanner(System.in);
		System.out.println("The Valid Sudoku Cases:");
		int[][] matrix3 = { { 1, 2, 3 }, { 3, 1, 2 }, { 2, 3, 1 } };
		m.exampleTestCases(s.exampleCases(matrix3, 3), 3);
		int[][] matrix5 = { { 5, 1, 3, 4, 2 }, { 4, 2, 5, 3, 1 }, { 2, 3, 4, 1, 5 }, { 1, 4, 2, 5, 3 },
				{ 3, 5, 1, 2, 4 } };
		m.exampleTestCases(s.exampleCases(matrix5, 5), 5);
		int[][] matrix6 = { { 6, 5, 2, 4, 3, 1 }, { 3, 2, 4, 6, 1, 5 }, { 4, 3, 6, 1, 5, 2 }, { 1, 2, 5, 3, 6, 4 },
				{ 2, 4, 3, 5, 1, 6 }, { 5, 6, 1, 2, 4, 3 } };
		m.exampleTestCases(s.exampleCases(matrix6, 6), 6);
		int[][] matrix7 = { { 1, 2, 4, 5, 3, 7, 6 }, { 3, 4, 5, 1, 2, 6, 7 }, { 2, 7, 6, 4, 5, 3, 1 },
				{ 6, 3, 7, 2, 1, 5, 4 }, { 5, 1, 3, 6, 7, 4, 2 }, { 4, 5, 2, 7, 6, 1, 3 }, { 7, 6, 1, 3, 4, 2, 5 } };
		m.exampleTestCases(s.exampleCases(matrix7, 7), 7);
		int[][] matrix9 = { { 7, 2, 3, 8, 4, 6, 1, 5, 9 }, { 6, 1, 5, 3, 9, 2, 4, 7, 8 }, { 8, 4, 9, 7, 1, 5, 6, 3, 2 },
				{ 3, 7, 8, 6, 5, 4, 9, 2, 1 }, { 1, 9, 4, 2, 8, 7, 3, 6, 5 }, { 2, 5, 6, 9, 3, 1, 8, 4, 7 },
				{ 5, 6, 1, 4, 7, 9, 2, 8, 3 }, { 4, 8, 7, 1, 2, 3, 5, 9, 6 }, { 9, 3, 2, 5, 6, 8, 7, 1, 4 } };
		m.exampleTestCases(s.exampleCases(matrix9, 9), 9);
		System.out.println();
		System.out.println("The Invalid Sudoku Cases:");
		int[][] matrixi3 = { { 1, 2, 3 }, { 3, 3, 2 }, { 2, 3, 1 } };
		m.exampleTestCases(s.exampleCases(matrixi3, 3), 3);
		int[][] matrixi5 = { { 5, 1, 4, 4, 2 }, { 4, 2, 5, 3, 1 }, { 2, 3, 4, 1, 5 }, { 1, 4, 2, 5, 3 },
				{ 3, 5, 1, 2, 4 } };
		m.exampleTestCases(s.exampleCases(matrixi5, 5), 5);
		int[][] matrixi6 = { { 6, 5, 2, 4, 3, 1 }, { 3, 2, 4, 6, 1, 5 }, { 4, 3, 6, 1, 5, 2 }, { 1, 2, 5, 3, 6, 4 },
				{ 2, 4, 3, 5, 1, 6 }, { 5, 6, 1, 4, 4, 3 } };
		m.exampleTestCases(s.exampleCases(matrixi6, 6), 6);
		int[][] matrixi7 = { { 1, 2, 4, 5, 3, 7, 6 }, { 3, 4, 5, 1, 2, 6, 7 }, { 2, 7, 6, 4, 5, 3, 1 },
				{ 6, 3, 7, 2, 1, 5, 4 }, { 5, 5, 3, 6, 7, 4, 2 }, { 4, 5, 2, 7, 6, 1, 3 }, { 7, 6, 1, 3, 4, 2, 5 } };
		m.exampleTestCases(s.exampleCases(matrixi7, 7), 7);
		int[][] matrixi9 = { { 7, 2, 3, 8, 4, 6, 1, 5, 9 }, { 6, 1, 5, 3, 9, 2, 4, 7, 8 },
				{ 8, 4, 9, 7, 1, 5, 6, 3, 2 }, { 3, 7, 8, 6, 5, 4, 9, 9, 1 }, { 1, 9, 4, 2, 8, 7, 3, 6, 5 },
				{ 2, 5, 6, 9, 3, 1, 8, 4, 7 }, { 5, 6, 1, 4, 7, 9, 2, 8, 3 }, { 4, 8, 7, 1, 2, 3, 5, 9, 6 },
				{ 9, 3, 2, 5, 6, 8, 7, 1, 4 } };
		m.exampleTestCases(s.exampleCases(matrixi9, 9), 9);
		System.out.println();

		System.out.println("Enter the sudoku Board size:");
		int n = in.nextInt();
		m.testCasesForUserInput(s.validateSudoku(n), n);

	}

	public void testCasesForUserInput(Boolean a, int n) {
		if (a == true) {
			System.out.println(n + "x" + n + " is a valid Sudoku");
			System.out.println("Test pass");
		} else {
			System.out.println(n + "x" + n + " is a Invalid Sudoku");
			System.out.println("Test Fail!!!!");
		}
	}

	public void exampleTestCases(Boolean a, int n) {
		if (a == true) {
			System.out.println(n + "x" + n + " is a valid Sudoku");
			System.out.println("Test pass");
		} else {
			System.out.println(n + "x" + n + " is a Invalid Sudoku");
			System.out.println("Test Fail!!!!");
		}
	}

}
