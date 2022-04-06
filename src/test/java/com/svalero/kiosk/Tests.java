package com.svalero.kiosk;

import com.svalero.kiosk.domain.Book;
import com.svalero.kiosk.domain.Magazine;
import com.svalero.kiosk.domain.Newspaper;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class Tests {

    private static Book book;
    private static Magazine magazine;
    private static Newspaper newspaper;

    @BeforeAll
    public static void beforeAll() {
        book = new Book("Java 11", "San Valero", "13DE4", 450, 9.50f);
        magazine = new Magazine("Coches", "12dW", 2021, 30, 1.9f);
        newspaper = new Newspaper("Noticias", "El Pais", "12FD45", 2022, 0.9f);
    }

    @Test
    public void checkBookProperties() {
        assertEquals("Java 11", book.getTitle());
        assertEquals("San Valero", book.getAuthor());
        assertEquals("13DE4", book.getISBN());
        assertEquals(450, book.getNumPages());
        assertEquals(9.50f, book.getPrice());
    }

    @Test
    public void checkMagazineProperties() {
        assertEquals("Coches", magazine.getCategory());
        assertEquals("12dW", magazine.getCode());
        assertEquals(2021, magazine.getYearPublication());
        assertEquals(30, magazine.getNumPages());
        assertEquals(1.9f, magazine.getPrice());
    }

    @Test
    public void checkNewspaperProperties() {
        assertEquals("Noticias", newspaper.getCategory());
        assertEquals("El Pais", newspaper.getEditorial());
        assertEquals("12FD45", newspaper.getCode());
        assertEquals(2022, newspaper.getYearPublication());
        assertEquals(0.9f, newspaper.getPrice());
    }

    @Test
    public void BooksAreEquals() {
        assertTrue(book.equals(new Book("13DE4")));
    }

}
