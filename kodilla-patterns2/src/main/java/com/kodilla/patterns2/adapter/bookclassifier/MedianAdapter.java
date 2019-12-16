package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclassifier.librarya.Book;
import com.kodilla.patterns2.adapter.bookclassifier.librarya.Classifier;
import com.kodilla.patterns2.adapter.bookclassifier.libraryb.BookB;
import com.kodilla.patterns2.adapter.bookclassifier.libraryb.BookSignature;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class MedianAdapter extends MedianAdaptee implements Classifier {
    @Override
    public double publicationYearMedian(Set<Book> bookSet) {
        Map<BookSignature, BookB> bookMap = new HashMap<>();
        for (Book book : bookSet) {
            BookB bookB = new BookB(book.getAuthor(), book.getTitle(), book.getPublicationYear());
            bookMap.put(new BookSignature(book.getSignature(), bookB), bookB);
        }
        return medianPublicationYear(bookMap);
    }
}