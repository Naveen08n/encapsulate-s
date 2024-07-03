class MobileTouch
{		
	int contacts;
	String pwd;
	
	public void setter(int x, String y)
	{
		contacts=x;
		pwd=y;
	}
	
	public int getter1() 
	{
		return contacts;
	}
	
	public String getter2()
	{
		return pwd;
	}
	
	
}
public class Mobile {

	public static void main(String[] args) {
		MobileTouch mt = new MobileTouch();
		mt.setter(532, "naveen123");
		System.out.println(mt.getter1());	
		System.out.println(mt.getter2());

	}

}
