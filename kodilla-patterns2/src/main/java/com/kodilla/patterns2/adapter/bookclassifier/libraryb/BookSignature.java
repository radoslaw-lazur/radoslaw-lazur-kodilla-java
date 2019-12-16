package com.kodilla.patterns2.adapter.bookclassifier.libraryb;

public class BookSignature {
    private final String signature;

    public BookSignature(final String signature, Book book) {
        this.signature = signature;
    }

    public String getSignature() {
        return signature;
    }
}
