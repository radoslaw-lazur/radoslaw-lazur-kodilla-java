package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclassifier.librarya.Book;
import org.junit.Assert;
import org.junit.Test;
import java.util.HashSet;
import java.util.Set;

public class MedianAdapterTestSuite {

    @Test
    public void publicationYearMedianTest() {
        //Given
        Set<Book> bookSet = new HashSet<>();
        bookSet.add(new Book("Author1", "Title1", 2000, "Signature1"));
        bookSet.add(new Book("Author2", "Title2", 1989, "Signature2"));
        bookSet.add(new Book("Author3", "Title3", 2005, "Signature3"));
        bookSet.add(new Book("Author4", "Title4", 2003, "Signature4"));
        MedianAdapter medianAdapter = new MedianAdapter();
        //When
        double median = medianAdapter.publicationYearMedian(bookSet);
        System.out.println(median);
        //Then
        Assert.assertEquals(2003.0, median, 0);
    }
}
