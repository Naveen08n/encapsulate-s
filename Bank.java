class BankDet{
	private int an;
	private int pwd;
	
	/*
	 * public void setter(int an,int pwd) { this.an=an; this.pwd=pwd; } public int
	 * getter1() { return an; } public int getter2() { return pwd; }
	 */
	
	public void setAn(int an) {
		this.an=an;
	}
	public int getAn() {
		return an;
	}
	public void setPwd(int pwd) {
		this.pwd=pwd;
	}
	public int getPwd() {
		return pwd;
	}
}

public class Bank {

	public static void main(String[] args) {
		BankDet bd=new BankDet();
		bd.setAn(3333);
		bd.setPwd(9999);
		System.out.println(bd.getAn());
		System.out.println(bd.getPwd());
		
	}

}
	