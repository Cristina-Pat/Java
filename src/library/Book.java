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
}