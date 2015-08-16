package library;

public class Book {
	String name;
	String author;
	int countPages;
	
	public Book(String name, String author, int countPages) {
		super();
		this.name = name;
		this.author = author;
		this.countPages = countPages;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getCountPages() {
		return countPages;
	}
	public void setCountPages(int countPages) {
		this.countPages = countPages;
	}
	public String toString() {
		String result = this.name +", "+this.author+", "+this.countPages;
		return result;
	}
	public boolean equals(Object object) {
		 if(object == null){
		    	return false;
		    }
		    
		    if(!(object instanceof Book)){
		    	return false;
		    }

		    Book book = (Book) object;
		    return this.hashCode() == book.hashCode();
	}
//	public int hashCode() {
//		return (this.name + this.author + this.countPages).hashCode();
//	}

	
}
