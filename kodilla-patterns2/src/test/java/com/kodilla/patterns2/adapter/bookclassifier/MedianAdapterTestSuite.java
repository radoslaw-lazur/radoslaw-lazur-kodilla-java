package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclassifier.librarya.BookA;
import org.junit.Assert;
import org.junit.Test;
import java.util.HashSet;
import java.util.Set;

public class MedianAdapterTestSuite {

    @Test
    public void publicationYearMedianTest() {
        //Given
        Set<BookA> bookASet = new HashSet<>();
        bookASet.add(new BookA("Author1", "Title1", 2000, "Signature1"));
        bookASet.add(new BookA("Author2", "Title2", 1989, "Signature2"));
        bookASet.add(new BookA("Author3", "Title3", 2005, "Signature3"));
        bookASet.add(new BookA("Author4", "Title4", 2003, "Signature4"));
        MedianAdapter medianAdapter = new MedianAdapter();
        //When
        double median = medianAdapter.publicationYearMedian(bookASet);
        System.out.println(median);
        //Then
        Assert.assertEquals(2003.0, median, 0);
    }
}
