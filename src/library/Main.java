package library;

public class Main {

	public static void main(String[] args) {
		SimpleLibrary e = new SimpleLibrary();
		e.addLibrary("The Tale of Peter Rabbit");
		e.addLibrary("Grimm's Fairy Tales");
		e.addLibrary("A Bear Called Paddington");
		e.checkIndex(5);
		e.listAllBooks();
		e.listMaching("Grimm's Fairy Tales");
	}
}


