import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
	private static Logger logger = LoggerFactory.getLogger(Main.class);

	public static void main(String[] args) {
		
		
		List<Product> products = new ArrayList<>();
		
		products.add(new Product("chair", "wood", 5.5));
		products.add(new Product("laptop", "glass", 5.5));
		products.add(new Product("cover", "glass", 150));
		products.add(new Product("harry potter", "books", 120.50));
		products.add(new Product("towards heaven", "books", 150.50));
		products.add(new Product("Rancor", "books", 50.20));
		
		
		List<Order> orders = new ArrayList<>();
		
		
		
		logger.info("Benvenuto");
		List<String> ExpensiveBooks = products.stream().filter(book -> book.getCategory().equals("books")).filter(book -> book.getPrice() > 100).map(books -> books.getName()).toList();	
		logger.info("Books with a value > 100 are: " +ExpensiveBooks );
	}
}
