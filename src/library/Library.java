package library;

public class Library {
	private final int totalBooks = 5;
	private Book[] books = new Book[totalBooks];
	private int numOfBooks = 0;
	
	
	/**
	 *  This method will add a book to the Library object
	 *  @param book
	 */
	public boolean addBook(Book book) {
		if (numOfBooks == totalBooks || numOfBooks < 0) {
			System.out.println("The Library is full! You can't add anymore books to the Library!"); 
			return false;
		}	
		
		if(books[numOfBooks] == null) {
			books[numOfBooks] = book;
			numOfBooks++;
			return true;
		}
		
		for(int i = 0; i < numOfBooks; i++) {
			if(books[i] == null) {
				books[i] = book;
				numOfBooks++;
				return true;
			}
		}
		
		return true;
	}
	
	/** 
	 * This method will remove a book from the Library object
	 * @param book
	 */
	public boolean removeBook(Book book) {
		if(numOfBooks <= 0) {
			System.out.println("There are no books in the library right now. You can't remove any books!");
			return false;
		}
		for(int i = 0; i < totalBooks; i++) {
			if(this.books[i].equals(book)) {
				books[i] = null;
				numOfBooks--;
				return true;
			}
		}
		return false;
	}
	
	/** Searches for book by ISBN and returns the Book object (or null if not found)
	 * 
	 * @param ISBN
	 * @return
	 */
	public Book searchByISBN(String ISBN) {
		for(int i = 0; i < totalBooks; i++) {
			if(this.books[i].getISBN().equals(ISBN)) {
				return books[i];
			}
		}
		System.out.println("This book is not in the library!");
		return null;
	}
	
	/**
	 * Prints details of all books
	 */
	public void displayBooks() {
		for(int i = 0; i < totalBooks; i++) {
			if(books[i] != null) {
				System.out.println((i + 1) + ". " +  books[i].getTitle().toString() + " by " + 
											   books[i].getAuthor().toString() + " (ISBN: " +  books[i].getISBN().toString()
											   + ", $" + books[i].getPrice() + ")");
				
			}
		}
	}
	
}
