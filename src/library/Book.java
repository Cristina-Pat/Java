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
}