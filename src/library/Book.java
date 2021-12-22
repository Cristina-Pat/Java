package library;

/**
 * 
 * A class to model an item (or set of items) in
 * a library: a book.
 * 
 * @author Cristina Pat
 * @version 2021.12.16
 */

public class Book
{
    // Fields of the class Book
    
    private String author;
    private String title;
    private String id;
    private boolean onLoan;
    
    /** 
     * Set the author, title and identifier when this object is instantiated.
     */
    public Book(String anAuthor, String aTitle, String anId) 
    {
        author = anAuthor;
        title = aTitle;
        id = anId;
        onLoan = false;
    }
    
   /**
    * Return the author's name of a book.
    * 
    * @return The author.
    */
   public String getAuthor()
   {
       return author;
    }
   
   /**
    * Return the title of a book.
    * 
    * @return The title.
    */
   public String getTitle()
   {
       return title;
    }
   
   /**
    * Return the availability of a book.
    * 
    * @return Book's availability.
    */
  public boolean isOnLoan()
  {
      return onLoan;
   }
  
   /**
    * Set whether the book is on loan.
    * 
    * @param onLoan The availability of the book. 
    * 
    */
   public void setOnLoan(boolean onLoan) 
   {
    this.onLoan = onLoan;
    }
    
   /**
    * Return a string describing the book and its availability.
    */
   public String toString() 
   {
	   String availability = " (available)";
	   if (onLoan == true) {
		   availability = " (on loan)";
	   }
			   
	   String message = "Title: " + title + "," + " Author: " + author + availability;
	   return message;  
	   
    }
  
   /**
    * Check the validity of the book's id. 
    */
   public boolean verifyId() {
	  if(id.length() < 7) { // Check the length of the id
		  return false;
	  }
	  int total = 0; 
	  for(int i = 0; i < id.length(); i++) { // Iterate trough the length of the id
		  char ch = id.charAt(i); // initialise the ch variable to the character at the current index
		  int result = ch % 10; // compute modulo 10 and assign to a result variable
		  total = total + result; // the result is added to total variable
	  }
	  int finalResult = total % 7; // compute modulo 7 and assign to a final result variable
	  if(finalResult != 0) // test final result variable 
	  {
		  return false; // if different than 0, the id is not valid
	  }
	  return true; // the id is valid
   }
}