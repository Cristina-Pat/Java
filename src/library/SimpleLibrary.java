package library;

import java.util.ArrayList;

public class SimpleLibrary {
	
private ArrayList<String> library;
    
	public SimpleLibrary()
    {
        library = new ArrayList<>();
    }
    
    public void addLibrary(String book)
    {
        library.add(book);
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
     * Show a list of all the books in the collection
     */
    public void listAllBooks()
    {
        int position = 1;
        for(String book:library) {
            System.out.println(position + ". "+ book);
            position ++;
        }
    }
    /**
     * List the name of books matching the given search string
     */
    public void listMaching(String searchString) 
    {
    	for(String book:library) {
    		if(book.contains(searchString)) {
    			System.out.println(book);
    		}
    	}
    }

}
