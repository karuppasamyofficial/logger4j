package dao;

import java.util.logging.Logger;

import model.BookRatings;

public class TestBookRatingsDAO {
	public static final Logger logger = Logger.getLogger("BookRatings.class");
public static void main(String[]args)
{
	BookRatingsDAO books = new BookRatingsDAO();
	
	System.out.println(books.findAll());
	
	System.out.println(books.findTotalBookRatings());
	
	   books.findTotalBookRatings();
	    books.delete(25);
	
	
   




}
}
