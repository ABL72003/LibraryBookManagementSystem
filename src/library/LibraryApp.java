package library;

public class LibraryApp {


	public static void main(String[] args) {
		
		/**
		 * calling the library constructor to create a new library called "newLibrary".
		 */
		Library newLibrary = new Library();
		/**
		 * adding books output similar to the homework doc.
		 */
			Book book1 = new Book("Clean Code", "Robert C. Martin", "978-0135166307", 40.99);
			Book book2 = new Book("Storm of Swords", "George R.R. Martin", "345-7394873949", 50.99);
			Book book3 = new Book("Aliens", "Ridley Scott", "843-9481037189", 60.99);
			
			/**
			 * out message to print before calling to insert the books.
			 */
			System.out.println("inserting books into newLibrary...");
			newLibrary.addBook(book1);
			newLibrary.addBook(book2);
			newLibrary.addBook(book3);
			/**
			 * print message stating success
			 */
			System.out.println("books added successfully!");
			/**
			 * creating a string to search for and utilizing the searchbyISBN function to find if it exists
			 */
			String search = "943-9481037189";
			System.out.println("searching books with ISBN: " + search);
			Book found = newLibrary.searchByISBN(search);
			
			/**
			 * if book doesn't exist
			 * "book not found" else, "book found: (insert book name)"
			 */
			if(found == null) {
				System.out.println("book not found.");
			}
			else {
			System.out.println("Book found:" + found);
			}
	        System.out.println();
	        
	        newLibrary.displayBooks();
	        newLibrary.removeBook(book2);
	        
	        

	}
}
