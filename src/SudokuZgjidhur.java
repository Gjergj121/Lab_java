
public class SudokuZgjidhur {

	private int[][] qeliza = new int[9][9];
	
	public SudokuZgjidhur(int[][] zgjidhja) {
		setQeliza(zgjidhja);
	}
	
	public SudokuZgjidhur() {
		System.out.print("Nuk keni zgjidhur nje Sudoku!");
	}
	
	public void setQeliza(int[][] zgjidhja){
		qeliza = zgjidhja;
	}
	
	public int[][] getQeliza(){
		return qeliza;
	}
	
	
	public boolean zgjidhja_sudokut () {
		
		int i, j, k, l;
		int indeks_i, indeks_j;
		
		// kontrolloj nese secili element eshte unik ne rreshtin e tij
		for(i = 0; i < 9; i++) {
			
			for(j = 0; j < 9; j++) {
				
				// kontrolloj nese qeliza mban nje vlere te lejuar
				if(qeliza[i][j] < 1 || qeliza[i][j] > 9) { 
					return false;
				}
				
				for(k = j+1; k < 9; k++) {
					if(qeliza[i][j] == qeliza[i][k]) {
						return false;
					}
				}
				
			}
			
		}
		
		// kontrolloj nese secili element eshte unik ne kolonen e tij
		for(j = 0; j < 9; j++) {
			
			for(i = 0; i < 9; i++) {
				
				// kontrolloj nese qeliza mban nje vlere te lejuar
				if(qeliza[i][j] < 1 || qeliza[i][j] > 9) { 
					return false;
				}
				
				for(k = i+1; k < 9; k++) {
					if(qeliza[i][j] == qeliza[k][j]) {
						return false;
					}
				}
				
			}
			
		}
		
		
		// kontrolloj nese secili element eshte unik ne bllokun e tij
		
		for(i = 0; i < 9; i++) {
			
			for(j = 0; j < 9; j++) {
				
				// kontrolloj nese qeliza mban nje vlere te lejuar
				if(qeliza[i][j] < 1 || qeliza[i][j] > 9) { 
					return false;
				}
				
				//percaktoj bllokun ku ndodhet elementi (jane gjithsej 9 blloqe)
				indeks_i = i/3;
				indeks_j = j/3;
				
				//krahasoj elementin me cdo element te bllokut te tij(pervec vetes)
				for(k = 3*indeks_i; k < 3*indeks_i+3; k++ ) {
					
					for(l = 3*indeks_j; l < 3*indeks_j+3; l++) {
						
						if(qeliza[i][j] == qeliza[k][l] && i!=k && j!=l) {
							return false;
						}
						
					}
					
				}
				
			}
			
		}
		
		return true;
		
	}

}
