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
			System.out.println("The Library is full! You can't add " + book.getTitle().toString() + " by " + 
					   book.getAuthor().toString() + " (ISBN: " +  book.getISBN().toString()
					   + ", $" + book.getPrice() + ")\n");

 
			return false;
		}	
		
		if(books[numOfBooks] == null) {
			books[numOfBooks] = book;
			numOfBooks++;
			System.out.println("Book added successfully!\n");
			return true;
		}
		
		for(int i = 0; i < numOfBooks; i++) {
			if(books[i] == null) {
				books[i] = book;
				numOfBooks++;
				System.out.println("Book added successfully!\n");
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
				
				System.out.println("Removed book: " + book.getTitle().toString() + " by " + 
						   book.getAuthor().toString() + " (ISBN: " +  book.getISBN().toString()
						   + ", $" + book.getPrice() + ").\n");
				
				return true;
			}
		}
		System.out.println("Can't remove " + book.getTitle().toString() + " by " + 
				   book.getAuthor().toString() + " (ISBN: " +  book.getISBN().toString()
				   + ", $" + book.getPrice() + "). It's not in the library\n");

		return false;
	}
	
	/** Searches for book by ISBN and returns the Book object (or null if not found)
	 * 
	 * @param ISBN
	 * @return
	 */
	public Book searchByISBN(String ISBN) {
		System.out.println("Searching for book with ISBN: " + ISBN);
		for(int i = 0; i < totalBooks; i++) {
			
			if(this.books[i] == null) {
				continue;
			}
			
			if(this.books[i].getISBN().equals(ISBN)) {
				System.out.println("Book found: " + books[i].getTitle().toString() + " by " + 
						   books[i].getAuthor().toString() + " (ISBN: " +  books[i].getISBN().toString()
						   + ", $" + books[i].getPrice() + ").\n");
				return books[i];
			}
		}
		System.out.println("Book with ISBN: " + ISBN + " was not found\n");
		return null;
	}
	
	/**
	 * Prints details of all books
	 */
	public void displayBooks() {
		int i = 0;
		int j = i;
		System.out.println("All books in the library:\n");
		for(i = 0; i < totalBooks; i++) {
			j++;
			if(books[i] == null) {
				j--;
				continue;
			}
			if(books[i] != null) {
				
				System.out.println(j + ". " +  books[i].getTitle().toString() + " by " + 
											   books[i].getAuthor().toString() + " (ISBN: " +  books[i].getISBN().toString()
											   + ", $" + books[i].getPrice() + ")");
				
			}
			
		}
	}
	
}
