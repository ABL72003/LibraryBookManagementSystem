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
	 * Constructor that takes the fields of the book in and sets the values of the book
	 * returns a boolean value upon completion. 
	 * I also check if a null or negative number is passed A message will play and the constructor will not assign.
	 * @param title
	 * @param author
	 * @param iSBN
	 * @param price
	 * 
	 */
	public Book(String title,String author,String ISBN,double price) {
		
		if(title == null || author == null || ISBN == null || price < 0 ) {
			
			throw new IllegalArgumentException ("invalid book parameters");
		}
		
		this.author = author;
		this.title = title;
		this.ISBN = ISBN;
		this.price = price;
			
	}
	
	/**This is the copy setter that creates a new book as a copy of another book.
	 * 
	 * @param the books contents you want to use to make a copy
	 */
	public Book(Book original) {
		this.title = original.title;
		this.author = original.author;
		this.ISBN = original.ISBN;
		this.price = original.price;
		
	}
/**
 * This is a getter function that just returns the title of a book.
 * @return the title
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
	 * @return the author
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
	 * @return the ISBN number
	 */
	public String getISBN() {
		return ISBN;
	}
	/**
	 * This is a setter function that takes a ISBN string and sets the book's ISBN.
	 * @param ISBN
	 */
	public void setISBN(String ISBN) {
		this.ISBN = ISBN;
	}
	/**
	 * THis is a getter function that takes nothing but returns the price of a book. 
	 * @return the price
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
	

	/**
	 * Override that checks if the object is either null or the right class 
	 * then evaluated the ISBN using casting for the Object. true if they are equal.
	 */
	@Override
	public boolean equals(Object other) {
		if (other == null || this.getClass() != other.getClass()) return false;
		return this.ISBN.equals(((Book) other).ISBN);
	}
	
	/**
	 * turns the book into a returnable string 
	 */
    @Override
    public String toString() {
        return title + " by " + author + " (ISBN: " + ISBN + ", $" + price + ")";
    }
}