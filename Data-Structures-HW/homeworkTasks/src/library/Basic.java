package library;

import java.util.ArrayList;
import java.util.TreeMap;

public class Basic {

	public static void main(String[] args){
		Book ulysses = new Book("Ulysses", "James Joyce", 350);
		Book greatGatsby = new Book("The great gatsby", "F. Scott Fitzgerald", 185);
		Book lolita = new Book("Lolita", "Vladimir Nabokov", 400);
		Book braveNewWorld = new Book("Brave new world", " Aldous Huxley", 400);
		Book dune = new Book("Dune", " Frank Herbert", 500);
		Book nativeSon = new Book("Native son", "Richard Wright", 400);
		
		ArrayList<Book> firstCollection = new ArrayList<>();
		firstCollection.add(ulysses);
		firstCollection.add(greatGatsby);
		
		ArrayList<Book> secondCollection = new ArrayList<>();
		secondCollection.add(lolita);
		secondCollection.add(braveNewWorld);
		
		ArrayList<Book> thirdCollection = new ArrayList<>();
		thirdCollection.add(dune);
		thirdCollection.add(nativeSon);
		
		TreeMap<String, ArrayList<Book>> books = new TreeMap<>();
		books.put("Ulysses", firstCollection);
		books.put("The great gatsby", firstCollection);
		books.put("Lolita", secondCollection);
		books.put("Brave new world", secondCollection);
		books.put("Dune", thirdCollection);
		books.put("Native son", thirdCollection);
		
		Library library = new Library("Lightness", "Sofia", books);
		System.out.println(library);
		
		library.addCopy("Dune");
		library.addCopy("D");
		library.addCopy("Lolita");
		library.addCopy("Dune");
		library.addCopy("Dune");
		library.addCopy("Ulysses");
		library.removeCopy("ne");
		library.removeCopy("Dune");
		library.addCopy("Lolita");
		library.addCopy("Lolita");
		library.removeCopy("Ulysses");
		library.removeCopy("Native son");
		
		System.out.println(library);

	}
}
