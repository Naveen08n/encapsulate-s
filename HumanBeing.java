class Human
{
	private String Brain;
	private String Heart;

	public void setter(String x, String y)
	
	{
		Brain=x;
		Heart=y;
	}
	
	public String getter1()
	{
		return Brain;
	}
	
	public String getter2()
	{
		return Heart;
	}


}

public class HumanBeing {

	public static void main(String[] args) {
		Human h=new Human();
		//System.out.println(h.Brain);
		//System.out.println(h.Heart);
		h.setter("grep", "red");
		System.out.println(h.getter1());
		System.out.println(h.getter2());
		
		
	}
}


