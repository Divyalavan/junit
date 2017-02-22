package com.divya.bookapp.dao; 

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import com.divya.bookapp.model.Book;

public class BookDAOTest {
	
	@Test
	public void testSave() {
		
	
	Book book=new Book();
	book.setName("java");
	book.setPrice(500f);
	BookDAO dao=new BookDAO();
	dao.Save(book);
	}
	

	@Test
	public void testFindAll() {
		BookDAO dao=new BookDAO();
		List<Book> list=dao.findAll();
		for(Book b:list)
		{
		System.out.println(b);
		
	}

}
}