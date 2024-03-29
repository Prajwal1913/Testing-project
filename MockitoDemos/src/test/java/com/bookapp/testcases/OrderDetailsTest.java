package com.bookapp.testcases;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import com.bookapp.exception.BookNotFoundException;
import com.bookapp.model.Book;
import com.bookapp.service.IBookService;
import com.bookapp.service.OrderDetails;

@RunWith(JUnitPlatform.class)
@ExtendWith(MockitoExtension.class)

class OrderDetailsTest {

	@Mock
	IBookService bookService; //creating a proxy
	

	@InjectMocks
	OrderDetails orderDetails;
	

	List<Book> bookList;
	Book book1, book2, book3, book4, book5;
	
	@BeforeEach
	void setUp() throws Exception {
		book1 = new Book("Java","James", 101, 1000);
        book2 = new Book("History", "James", 102, 400);
        book3 = new Book("Geography", "James", 103, 900);
        book4 = new Book("Moral", "Nikhil", 104, 300);
        book5 = new Book("Physics", "James", 105, 1500);
        bookList = Arrays.asList(book1,book2,book3,book4,book5);
	}

	@AfterEach
	void tearDown() throws Exception {
		orderDetails = null;
	}

	@Test
	void testShowBooks() throws BookNotFoundException {
		String author = "James";
		List<Book> booksByAuthor = Arrays.asList(book1,book2,book3,book5);
		Mockito.when(bookService.getByAuthor(author)).thenReturn(booksByAuthor);
		List<Book> expected = Arrays.asList(book3,book2,book1,book5);
		//the method to be tested
		List<Book> actual = orderDetails.showBooks(author);
		assertEquals(expected, actual);
	}
	
	@Test
	void testShowEmptyBooks() {
		String author = "Praj";
		Mockito.when(bookService.getByAuthor(author)).thenReturn(new ArrayList<>());
		List<Book> expected = Arrays.asList(book3,book2,book1,book5);
		assertThrows(BookNotFoundException.class, ()->orderDetails.showBooks(author));
	}
	
	@Test
	void testExShowBooks() {
		String author = "Nikhil";
		Mockito.when(bookService.getByAuthor(author)).thenThrow(BookNotFoundException.class);
		assertThrows(BookNotFoundException.class, ()->orderDetails.showBooks(author));
	}
	
}
















