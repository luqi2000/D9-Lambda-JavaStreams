import java.util.Random;

public class Product {
	//attributi
	private String name;
	private long id;
	private String category;
	private double price;
	
	//costruttore quindi decido cosa ci passero'
	public Product(String name, String category, double price) {
		this.setName(name);
		this.setCategory(category);
		this.setPrice(price);
		this.setId(id);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public long getId() {
		return id;
	}

	public long setId(long id) {
		Random rand = new Random();
		return this.id = rand.nextLong();
	}
}
