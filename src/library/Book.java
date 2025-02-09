package library;

public class Book {

	private String title;
	private String author;
	private String ISBN;
	private double price;

	/**
	 * This is the default constructor of a book, it will initialize all of the elements of the book
	 * with one call.
	 */
	public Book() {
		this.title = "unknown";
		this.author = "unknown";
		this.ISBN = "unknown";
		this.price = 0.0;
	}
/**
 * This is a getter function that just returns thee title of a book.
 * @return
 */
	public String getTitle() {
		return title;
	}
	/**
	 * This is a setter title that sets the title of a book. It takes the title as a parameter.
	 * @param title
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * This is a getter function that returns the author and takes no parameters.
	 * @return
	 */
	public String getAuthor() {
		return author;
	}
	/**
	 * This is a setter function that takes an author and sets the book's author.
	 * @param author
	 */
	public void setAuthor(String author) {
		this.author = author;
	}
	/**
	 * This is a getter function that takes nothing but returns the ISBN string.
	 * @return
	 */
	public String getISBN() {
		return ISBN;
	}
	/**
	 * This is a setter function that takes a ISBN string and sets the book's ISBN.
	 * @param iSBN
	 */
	public void setISBN(String iSBN) {
		this.ISBN = iSBN;
	}
	/**
	 * THis is a getter function that takes nothing but returns the price of a book. 
	 * @return
	 */
	public double getPrice() {
		return price;
	}
	/**
	 * This is a setter function that sets the price of a book. It takes a price.
	 * @param price
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	
}
