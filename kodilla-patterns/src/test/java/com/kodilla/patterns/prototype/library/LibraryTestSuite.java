package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;
import java.time.LocalDate;
import java.util.stream.IntStream;

public class LibraryTestSuite {

    private Library library = new Library("Library 1");

    @Test
    public void testGetBooks() throws CloneNotSupportedException {
        //Given
        IntStream.iterate(1, t -> t + 1)
                .limit(5)
                .forEach(t -> library.getBooks().add(new Book("Book" + t, "Author" + t,
                        LocalDate.now())));

        Library shallowClonedLibrary;
        shallowClonedLibrary = library.shallowCopy();
        shallowClonedLibrary.setName("Library 2");

        Library deepClonedLibrary;
        deepClonedLibrary = library.deepCopy();
        deepClonedLibrary.setName("Library 3");

        System.out.println(library.getName());
        library.getBooks().forEach(System.out::println);
        System.out.println(shallowClonedLibrary.getName());
        shallowClonedLibrary.getBooks().forEach(System.out::println);
        System.out.println(deepClonedLibrary.getName());
        deepClonedLibrary.getBooks().forEach(System.out::println);
        //When
        //Then
        Assert.assertEquals(5, library.getBooks().size());
        Assert.assertEquals(5, shallowClonedLibrary.getBooks().size());
        Assert.assertEquals(5, deepClonedLibrary.getBooks().size());
        Assert.assertEquals(library.getBooks(), shallowClonedLibrary.getBooks());
        Assert.assertEquals(library.getBooks(), deepClonedLibrary.getBooks());
    }

    @Test
    public void testGetBooksRemovalCase() throws CloneNotSupportedException {
        //Given
        IntStream.iterate(1, t -> t + 1)
                .limit(5)
                .forEach(t -> library.getBooks().add(new Book("Book" + t, "Author" + t,
                        LocalDate.now())));

        Library shallowClonedLibraryRemoved;
        shallowClonedLibraryRemoved = library.shallowCopy();
        shallowClonedLibraryRemoved.setName("Library 2 removed");

        Library deepClonedLibraryRemoved;
        deepClonedLibraryRemoved = library.deepCopy();
        deepClonedLibraryRemoved.setName("Library 3 removed");

        System.out.println(shallowClonedLibraryRemoved.getName());
        shallowClonedLibraryRemoved.getBooks().forEach(System.out::println);
        System.out.println(deepClonedLibraryRemoved.getName());
        deepClonedLibraryRemoved.getBooks().forEach(System.out::println);
        //When
        library.getBooks().clear();
        //Then
        Assert.assertEquals(0, library.getBooks().size());
        Assert.assertEquals(0, shallowClonedLibraryRemoved.getBooks().size());
        Assert.assertEquals(5, deepClonedLibraryRemoved.getBooks().size());
    }
}
