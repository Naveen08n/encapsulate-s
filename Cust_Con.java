class Customer{
	private int cId;
	private String cName;
	private int cNum;
	
	Customer(int cId,String cName){
		this(9845445);
		this.cId=cId;
		this.cName=cName;
	}
	Customer(int cId, String cName, int cNum){
		this(2,"Alex");
		System.out.println("three parameters");
	}
	Customer(){
		System.out.println("Zero parameters");
	}
	Customer(int cNum){
		this();
		this.cNum=cNum;
		System.out.println("one parameter");
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
	Object
	
}

public class Cust_Con {

	public static void main(String[] args) {
		Customer c=new Customer(1,"Alen",986633434);
		System.out.println(c.getcId());
		System.out.println(c.getcName());
		System.out.println(c.getcNum());
	

	}

}
