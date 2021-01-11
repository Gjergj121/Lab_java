
public class TestSudokuZgjidhur {

	public static void main(String[] args) {
		
		int[][] elementi = {{9, 2, 5, 6, 3, 1, 8, 4, 7},
							{6, 1, 8, 5, 7, 4, 2, 9, 3},
							{3, 7, 4, 9, 8, 2, 5, 6, 1},
							{7, 4, 9, 8, 2, 6, 1, 3, 5},
							{8, 5, 2, 4, 1, 3, 9, 7, 6},
							{1, 6, 3, 7, 9, 5, 4, 8, 2},
							{2, 8, 7, 3, 5, 9, 6, 1, 4},
							{4, 9, 1, 2, 6, 7, 3, 5, 8},
							{5, 3, 6, 1, 4, 8, 7, 2, 9},
						
							};
		
		SudokuZgjidhur sudoku = new SudokuZgjidhur(elementi);
		
		Boolean saktesia = sudoku.zgjidhja_sudokut();
		
		if(saktesia == true)
			System.out.print("Sudoku eshte zgjidhur sakte! Urime :)");
		else
			System.out.print("Zgjidhja e Sudoku-t nuk eshte e sakte!");
	}

}
