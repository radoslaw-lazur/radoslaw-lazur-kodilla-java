package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclassifier.libraryb.Book;
import com.kodilla.patterns2.adapter.bookclassifier.libraryb.BookSignature;
import com.kodilla.patterns2.adapter.bookclassifier.libraryb.BookStatistics;
import com.kodilla.patterns2.adapter.bookclassifier.libraryb.Statistics;
import java.util.Map;

public class MedianAdaptee implements BookStatistics {
    private static final Statistics STATISTICS = new Statistics();
    @Override
    public double averagePublicationYear(Map<BookSignature, Book> books) {
        return STATISTICS.medianPublicationYear(books);
    }

    @Override
    public double medianPublicationYear(Map<BookSignature, Book> books) {
        return STATISTICS.medianPublicationYear(books);
    }
}
