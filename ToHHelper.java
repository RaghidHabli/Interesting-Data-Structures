
public class ToHHelper {
	private int N;
	
	public ToHHelper(int N) {
		this.N = N;
	}
	
	
	public void solve() {
		moveTower(N, 1, 3, 2);
	}
	
	private void moveTower(int nbOfDisks, int start, int end, int extra) {
		if(nbOfDisks == 0)
			return;
		else {
			moveTower(nbOfDisks-1, start, extra, end);
			moveOneDisk(start, end);
			moveTower(nbOfDisks-1, extra, end, start);
		}
	}
	
	private void moveOneDisk(int start, int end) {
		System.out.println(start + "->" + end);
	}

}
