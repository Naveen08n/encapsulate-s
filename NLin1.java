import java.util.Scanner;

class Demo{
	private int  Id;
	private String Name;
	private String Address;
	private long Phone;
	private String Mail;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public long getPhone() {
		return Phone;
	}
	public void setPhone(long phone) {
		Phone = phone;
	}
	public String getMail() {
		return Mail;
	}
	public void setMail(String mail) {
		Mail = mail;
	}
	
	
	
}
public class NLin1 {

	public static void main(String[] args) {
		Demo de =new Demo();
		Scanner scan=new Scanner(System.in);
				
		System.out.println("Enter ID");
		de.setId(scan.nextInt());
		System.out.println("Enter Name");
		de.setName(scan.next());
		System.out.println("Enter phone Number");
		de.setPhone(scan.nextLong());
		System.out.println("Enter mail");
		de.setName(scan.next());
		System.out.println("Enter Address");
		scan.nextLine();
		de.setAddress(scan.nextLine());
		
		Demo[] cus=new Demo[1];
		cus[0]=de;
		System.out.println(cus[0].getId()+" "+cus[0].getAddress());
		
	}

}
