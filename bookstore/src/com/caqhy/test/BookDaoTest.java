package com.caqhy.test;

import com.caqhy.dao.BookDao;
import com.caqhy.dao.impl.BookDaoImpl;
import com.caqhy.pojo.Book;
import com.caqhy.pojo.Page;
import org.junit.Test;

import java.math.BigDecimal;


public class BookDaoTest {
    private BookDao bookDao = new BookDaoImpl();

    @Test
    public void addBook() {
        bookDao.addBook(new Book(null,"邱昊阳哥哥为什么这么帅！", "191125", new BigDecimal(9999),1100000,0,null));
    }

    @Test
    public void deleteBookById() {
        bookDao.deleteBookById(21);
    }

    @Test
    public void updateBook() {
        bookDao.updateBook(new Book(22,"大家都可以这么帅！", "邱昊阳小帅哥", new BigDecimal(9999),1100000,0,null
        ));
    }

    @Test
    public void queryBookById() {
        System.out.println( bookDao.queryBookById(1) );
    }

    @Test
    public void queryBooks() {
        for (Book queryBook : bookDao.queryBooks()) {
            System.out.println(queryBook);
        }
    }

    @Test
    public void queryForPageTotalCount() {
        System.out.println( bookDao.queryForPageTotalCount() );
    }

    @Test
    public void queryForPageTotalCountByPrice() {
        System.out.println( bookDao.queryForPageTotalCountByPrice(10, 50) );
    }

    @Test
    public void queryForPageItems() {
        for (Book book : bookDao.queryForPageItems(8, Page.PAGE_SIZE)) {
            System.out.println(book);
        }
    }
    @Test
    public void queryForPageItemsByPrice() {
        for (Book book : bookDao.queryForPageItemsByPrice(0, Page.PAGE_SIZE,10,50)) {
            System.out.println(book);
        }
    }

}