package pakage2;

public class MyParent {
	
	private int prv;
	int dft;
	protected int prt;
	public int pbl;
	
	public MyParent() {}
	
	public MyParent(int prv, int dft, int prt, int pbl) {
		this.prv = prv;
		this.dft = dft;
		this.prt = prt;
		this.pbl = pbl;
	}

	void printMembers1() {
		System.out.print(this.prv + " ");
		System.out.print(this.dft + " ");
		System.out.print(this.prt + " ");
		System.out.println(this.pbl);
	}
	
	public void printMembers2() {
		System.out.print(this.prv + " ");
		System.out.print(this.dft + " ");
		System.out.print(this.prt + " ");
		System.out.println(this.pbl);
	}

}
