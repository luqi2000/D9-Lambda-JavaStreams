import java.time.LocalDate;
import java.util.List;
import java.util.Random;

public class Order {
	private long id;
	private String status;
	private LocalDate orderDate;
	private LocalDate deliverydate;
	private List<Product> products;
	private Customer customer;
	
	public Order(String status, LocalDate orderDate, LocalDate deliverydate, List<Product> products,
		Customer customer) {
		
		this.id = setId(id);
		this.status = status;
		this.orderDate = orderDate;
		this.deliverydate = deliverydate;
		this.products = products;
		this.customer = customer;
	}

	public long getId() {
		return id;
	}

	public long setId(long id) {
		Random rand = new Random();
		return this.id = rand.nextLong();
	}
	
}
