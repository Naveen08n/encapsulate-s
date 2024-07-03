import java.util.Scanner;

class customers{
	private int  Id;
	private String Name;
	private long Phone;
	private String Mail;
	private String Address;
	
	
	public void setId(int Id) {
		this.Id=Id;
	}
	int getId() {
		return Id;
	}
	public void setName(String Name) {
		this.Name=Name;
	}
	String getName() {
		return Name;
	}
	
	public void setPhone(long Phone) {
		this.Phone=Phone;
	}
	long getPhone() {
		return Phone;
	}
	public void setMail(String Mail) {
		this.Mail=Mail;
	}
	String getMail() {
		return Mail;
	}
	public void setAddress(String Address) {
		this.Address=Address;
	}
	String getAddress() {
		return Address;
	}
	
}

public class NLine {

	public static void main(String[] args) {
		customers cust =new customers();
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter ID");
		int a=scan.nextInt();
		System.out.println("Enter Name");
		String b=scan.next();
		//System.out.println(c.getId());
		System.out.println("Enter Phone Number");
		long c=scan.nextLong();
		System.out.println("Enter Mail Id");
		String d=scan.next();
		
		//System.out.println(c.getMail());
		System.out.println("Enter Address");
		scan.nextLine();
		String e=scan.nextLine();
		
		System.out.println(a+" "+b+" "+" "+" "+d+" "+e);
		

	}

}
