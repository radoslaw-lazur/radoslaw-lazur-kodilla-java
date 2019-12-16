package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclassifier.librarya.BookA;
import com.kodilla.patterns2.adapter.bookclassifier.librarya.Classifier;
import com.kodilla.patterns2.adapter.bookclassifier.libraryb.BookB;
import com.kodilla.patterns2.adapter.bookclassifier.libraryb.BookSignature;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class MedianAdapter extends MedianAdaptee implements Classifier {
    @Override
    public double publicationYearMedian(Set<BookA> bookASet) {
        Map<BookSignature, BookB> bookMap = new HashMap<>();
        for (BookA bookA : bookASet) {
            BookB bookB = new BookB(bookA.getAuthor(), bookA.getTitle(), bookA.getPublicationYear());
            bookMap.put(new BookSignature(bookA.getSignature(), bookB), bookB);
        }
        return medianPublicationYear(bookMap);
    }
}