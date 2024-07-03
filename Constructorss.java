class Bankd
{
	private int an;
	private int pwd;
	
	Bankd(int an,int pwd){
		this.an=an;
		this.pwd=pwd;
	}
	public int getAn() {
		return an;
	}
	public int getPwd() {
		return pwd;
	}
}

public class Constructorss {

	public static void main(String[] args) {
		Bankd b=new Bankd(33,454);
		System.out.println(b.getAn());
		System.out.println(b.getPwd());
		

	}

}
