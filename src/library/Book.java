package library;

public class Book {

	private String title;
	private String author;
	private String ISBN;
	private Double price;

	
	public Book() {
		title = "unknown";
		author = "unknown";
		ISBN = "unknown";
		price = 0.0;
	}
/**
 * 
 * @return
 */
	public String getTitle() {
		return title;
	}
	/**
	 * 
	 * @param title
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * 
	 * @return
	 */
	public String getAuthor() {
		return author;
	}
	/**
	 * 
	 * @param author
	 */
	public void setAuthor(String author) {
		this.author = author;
	}
	/**
	 * 
	 * @return
	 */
	public String getISBN() {
		return ISBN;
	}
	/**
	 * 
	 * @param iSBN
	 */
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	/**
	 * 
	 * @return
	 */
	public Double getPrice() {
		return price;
	}
	/**
	 * 
	 * @param price
	 */
	public void setPrice(Double price) {
		this.price = price;
	}
	
}
