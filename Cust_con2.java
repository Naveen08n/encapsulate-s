class Cust{
	private int cId;
	private String cName;
	private int cNum;
	
	Cust(int cId,String cName){
		this.cId=cId;
		this.cName=cName;
		System.out.println("two parametes");
		
	}
	Cust(int cNum){
		this(1,"Alex");
		this.cNum=cNum;
		System.out.println("one parameter");
		
	}
	Cust(int cId, String cName, int cNum){
		this();
		this.cName=cName;
		System.out.println("three parameters");
	}
	Cust(){
		this(690532);
		System.out.println("Zero parameters ");
		
	}
	public int getcId() {
		return cId;
	}
	public String getcName() {
		return cName;
	}
	public int getcNum() {
		return cNum;
	}	
}


public class Cust_con2 {

	public static void main(String[] args) {
		Cust c=new Cust(2,"Alen",9160690);
		System.out.println(c.getcId());
		System.out.println(c.getcName());
		System.out.println(c.getcNum());
		

	}

}
