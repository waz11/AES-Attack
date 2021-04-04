
public class Block {
	private String[][] values;
	public int rows;
	private int cols;
	public int lastRow;
	public int lastCol;


	public Block() {
		this.values = new String[4][4];
		this.rows = 4; this.cols = 4;
		this.lastRow = 0; this.lastCol = 0;
	}

	public void add(String input) {
		if(!this.isFull()) {
			this.values[this.lastRow][this.lastCol] = input;
			this.increaseIndex();
		}
	}
	
	public String getValue(int row, int col) {
		return values[row][col];
	}

	public void increaseIndex() {
		if(lastRow<=3) {
			if(lastCol == 3) {
				lastCol = 0;
				lastRow++;
			}
			else if(lastCol < 3) {
				lastCol++;
			}
		}
	}

	public boolean isFull() {
		return (lastRow >= rows) || (lastCol >= cols);
	}

	public void changeValue(int row, int col, String value) {
		values[row][col] = value;
	}

	public int getRows() {
		return rows;
	}

	public int getCols() {
		return cols;
	}
	
	public void swipeIndexex(){
		for(int row = 0; row < this.rows; row++) {
			for(int col = row + 1; col < this.cols; col++) {
				swipe(row, col);
			}
		}
	}

	public void print() {
		for (int i = 0; i < this.rows; i++) {
			for (int j = 0; j < this.cols; j++) {
				System.out.print(this.values[i][j]);
				if(j < this.cols) System.out.print(" ");
			}
			System.out.println();
		}
		System.out.println();
	}

	
	//	********* Additional Functions ********* //
	private void swipe(int i, int j) {
		String temp = this.values[i][j];
		this.values[i][j] = this.values[j][i];
		this.values[j][i] = temp;
	}
	
}
