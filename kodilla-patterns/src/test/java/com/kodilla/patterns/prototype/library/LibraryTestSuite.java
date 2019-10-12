package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;
import java.time.LocalDate;
import java.util.stream.IntStream;

public class LibraryTestSuite {

    @Test
    public void testGetBooks() {
        //Given
        Library library = new Library("Library 1");
        IntStream.iterate(1, t -> t + 1)
                .limit(5)
                .forEach(t -> library.getBooks().add(new Book("Book" + t, "Author" + t,
                        LocalDate.parse("2019-10-12"))));

        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("Library 2");
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("Library 3");
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        System.out.println(library.getName());
        library.getBooks().forEach(System.out::println);
        System.out.println(clonedLibrary.getName());
        clonedLibrary.getBooks().forEach(System.out::println);
        System.out.println(deepClonedLibrary.getName());
        deepClonedLibrary.getBooks().forEach(System.out::println);
        //When
        //Then
        Assert.assertEquals(5, library.getBooks().size());
        Assert.assertEquals(5, clonedLibrary.getBooks().size());
        Assert.assertEquals(5, deepClonedLibrary.getBooks().size());
        Assert.assertEquals(clonedLibrary.getBooks(), deepClonedLibrary.getBooks());

    }
}
