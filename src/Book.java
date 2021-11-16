
public class Book {
	String title;
	String autor;
	String publisher;
	String isbn;

	public Book(){
	        this.title = "gg";
	        this.autor = "do do";
	        this.publisher = "vncvkhva";
	        this.isbn = "1234567890101";
	}
	    public String getAutor(){
	        return autor;
	    }
	    public String getTitle() 
	    {
	        return title;
	    }
	    public String getIsbn(){
	        return isbn;
	    }
	    public String getPublisher(){
	        return publisher;
	    }
	    public Book(String title, String autor, String publisher, String isbn) 
	    {	  
	        this.title = title;
	        this.autor = autor;
	        this.publisher = publisher;
	        this.isbn = isbn;
	    }
	    public String toString() 
	    {
	        return String.format("%s, %s, %s, %s", getAutor(), getTitle(), getPublisher(), getIsbn());
	    }
	}

