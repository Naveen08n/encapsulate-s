import java.util.Scanner;

class Bank_account{
	protected String accNumber;
	protected String accName;
	protected String bankName;
	public Bank_account(String accName, String accNumber, String bankName) {
		this.accName=accName;
		this.accNumber=accNumber;
		this.bankName=bankName;
	}
	public void disp() {
		System.out.println("Account Name: "+accName);
		System.out.println("Account Number: "+accNumber);
		System.out.println("Bank Name: "+bankName);
		
	}
	@Override
	public String toString() {
		return "AccName : "+accName +"\nAccNumber : "+accNumber+"\nbankName : "+bankName;
	}
	
}
class CurrentAccount extends Bank_account{
	private String tinNum;
	public CurrentAccount(String accName, String accNumber , String bankName,String tinNum ){
		super(accName,accNumber,bankName);
		this.tinNum=tinNum;
	}
	@Override
	public void disp() {
		super.disp();
		System.out.println("Tin Number: "+tinNum);
	}
	@Override
	public String toString() {
		return super.toString() +"\nTin NUmber :" +tinNum;
	}
}
class SavingAccount extends Bank_account{
	private String orgName;
	public SavingAccount(String accName, String accNumber, String bankName, String orgName){
		super(accName,accNumber,bankName);
		this.orgName=orgName;
	}
	@Override
	public void disp() {
		super.disp();
		System.out.println("org Name: "+orgName);
	}
	@Override
	public String toString() {
		return super.toString() +"\nOrgName :" +orgName;
	}

}
public class Banking_System {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("choose the type of bank");
		System.out.println("1.currentaccount ");
		System.out.println("2.saving account ");
		int choice=scan.nextInt();
		
		scan.nextLine();
		
		if(choice==1) {
		String accdetails=scan.nextLine();
		String[] details=accdetails.split(",");
		CurrentAccount c=new CurrentAccount(details[0],details[1],details[2],details[3]);
		//c.disp();
		System.out.println(c);
		
		}else if(choice==2) {
		String accdetails=scan.nextLine();
		String[] details=accdetails.split(",");
		SavingAccount s=new SavingAccount(details[0],details[1],details[2],details[3]);
		//s.disp();
		System.out.println(s);
		
		}else {
			System.out.println("Invalid choice");
		}
	}

}
