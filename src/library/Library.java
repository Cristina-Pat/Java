package library;
import java.util.ArrayList;


public class Library {

	// A list of books owned by the library, Question 2, b
		private ArrayList<Book> books;
		// The name of the library 
		private String name; 
		
		/**
		 *  Create a new library.
		 */
		public Library(String aName) 
		{
			name = aName; 
			books = new ArrayList<>();
		}
		
		/**
		 * Add a new Book to the library's book collection using the following parameters.
		 * 
		 * @param author The author of the book.
		 * @param title The title of the book.
		 * @param id The id of the book.
		 */
		public void addBook(String author, String title, String id) 
		{
			Book book = new Book(author, title, id);
			books.add(book);
		}
		
		/**
		 * Calculate a fine for returning a book late.
		 * 
		 * @param price The price of book.
		 * @param numberDays The number of days late.
		 * 
		 * @return The fine that the user need to pay.
		 */
		public double calculateFine(double price, int numberDays) 
		{
			double fine = 0;
			fine  = (price * 0.02) * numberDays;
			return fine;
			
		}
}
