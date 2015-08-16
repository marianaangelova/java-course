package library;

import java.util.ArrayList;
import java.util.TreeMap;

public class Library {
	String name;
	String adress;
	private TreeMap<String, ArrayList<Book>> 
	bookCollection = new TreeMap<String, ArrayList<Book>>();
	public Library(String name, String adress, TreeMap<String, ArrayList<Book>> bookCollection) {
		super();
		this.name = name;
		this.adress = adress;
		this.bookCollection = bookCollection;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public TreeMap<String, ArrayList<Book>> getBookCollection() {
		return bookCollection;
	}
	public void setBookCollection(TreeMap<String, ArrayList<Book>> bookCollection) {
		this.bookCollection = bookCollection;
	}
	public String toString() {
		String result = this.name +", "+this.adress+", "+this.bookCollection;
		return result;
	}
	public void addCopy(String name){
		if(bookCollection.containsKey(name)){
			ArrayList<Book> list = bookCollection.get(name);
			if(list.size() != 0){
				Book book = list.get(0);
				Book newBook = book;
				list.add(newBook);
				System.out.println("One copy was added!");
			} else{
				System.out.println("The list is empty!");
			}
		} else{
			System.out.println("There is no book with this name!");
		}
	}
	
	public void removeCopy(String name){
		if(bookCollection.containsKey(name)){
			ArrayList<Book> list = bookCollection.get(name);
			if(list.size() != 1){
				list.remove(list.size()-1);
				System.out.println("One copy was removed!");
			} else{
				System.out.println("There is no copy or list is empty!");
			}
		} else{
			System.out.println("There is no book with this name!");
		}
	}
	
}

