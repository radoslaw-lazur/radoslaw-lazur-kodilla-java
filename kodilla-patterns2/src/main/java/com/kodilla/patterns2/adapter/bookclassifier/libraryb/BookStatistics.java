package com.kodilla.patterns2.adapter.bookclassifier.libraryb;

import java.util.Map;

public interface BookStatistics {
    double averagePublicationYear(Map<BookSignature, Book> books);
    double medianPublicationYear(Map<BookSignature, Book> books);
}
