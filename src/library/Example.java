package library;

import java.util.ArrayList;

public class Example {
	    
	private ArrayList<String> library;
    
	public Example()
    {
        library = new ArrayList<>();
    }
    
    public void addElement(String el)
    {
        library.add(el);
    }
    
    /**
     * Check the size of the collection
     */
    public void checkIndex(int index)
    {
        if(library.size() == 0) {
            System.out.println("The collection is empty!");
            }
        if(index >= 0 && index >= library.size()){
            System.out.println("The valid index range is 0 to " + (library.size()-1));
             }
    }
    /**
     * Show a list of all the elements in the collection
     */
    public void listAllElements()
    {
        int position = 1;
        for(String el:library) {
            System.out.println(position + ". "+ el);
            position ++;
        }
    }
    /**
     * List the name of elements matching the given search string
     */
    public void listMaching(String searchString) 
    {
    	for(String el:library) {
    		if(el.contains(searchString)) {
    			System.out.println(el);
    		}
    	}
    }
    /**
     *Calculate a fine for returning a book late.
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