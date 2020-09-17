package junit.tutorial;

import static org.junit.Assert.assertThat;

import java.awt.print.Book;

import org.junit.Test;

public class BookStoreTest {

	@Test
	public void getTotalPrice() throws Exceptic{
		// SetUp
		BookStore sut = new BookStore();
		Book book= Bookオブジェクトの作成_MartinFowlerのRefactoring();
		sut.addToCart(book, 1);
		// Exercise & Verify
		assertThat(sut.getTotalPrice(), is(4500));
	}
	
	@Test
	public void get_O() throws Exception {
		// SetUp
		BookStore sut = new BookStore();
		Book book= Bookオブジェクトの作成_MartinFowlerのRefactoring(;
		sut.addToCart(book, 1);
		// Exercise & Verify
		assertThat(sut.get(0), is(sameInstance(book)));
	}
}
