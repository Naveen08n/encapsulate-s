class Dog
{
	private String name;
	private int age;
	private float cost;
	
	Dog(String name,int age){
		this();
		this.name=name;
		this.age=age;
	}
	Dog(float cost){
		//this();
		this.cost=cost;
	}
	Dog(){
		this(4);
		System.out.println("Zero parameters");
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public float getCost() {
		return cost;
	}
	
}
public class Con2 {

	public static void main(String[] args) {
		Dog d=new Dog("maxy",34);
		System.out.println(d.getName());
		System.out.println(d.getAge());
		System.out.println(d.getCost());
		
	}

}
