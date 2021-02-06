package interview;

//bean class which contains variables name of goodie and the price of it
public class Goodie
{
	private String name;
	private int price;
	
	//parametrized constructor for class goodie
	public Goodie(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

	//getter and setter methods for this class
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

	//in order to print the output we have overriden the tostring method
	@Override
	public String toString() {
		return name + ":"+ price;
	}
	
}
