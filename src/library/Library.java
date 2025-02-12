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
			System.out.println("The Library is full! You can't add anymore books.");
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
		for(int i = 0; i < numOfBooks; i++) {
			if(this.books[i].equals(book)) {
				books[i] = null;
				numOfBooks--;
				return true;
			}
		}
		return false;
	}
	
}
