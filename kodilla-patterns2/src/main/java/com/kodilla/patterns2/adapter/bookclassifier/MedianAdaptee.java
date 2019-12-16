package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclassifier.libraryb.BookB;
import com.kodilla.patterns2.adapter.bookclassifier.libraryb.BookSignature;
import com.kodilla.patterns2.adapter.bookclassifier.libraryb.BookStatistics;
import com.kodilla.patterns2.adapter.bookclassifier.libraryb.Statistics;
import java.util.Map;

public class MedianAdaptee implements BookStatistics {
    private Statistics statistics = new Statistics();
    @Override
    public double averagePublicationYear(Map<BookSignature, BookB> books) {
        return statistics.medianPublicationYear(books);
    }

    @Override
    public double medianPublicationYear(Map<BookSignature, BookB> books) {
        return statistics.medianPublicationYear(books);
    }
}
