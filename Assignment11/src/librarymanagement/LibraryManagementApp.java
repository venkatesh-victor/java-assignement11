package librarymanagement;

import java.util.Arrays;

import librarymanagement.books.Books;
import librarymanagement.members.Members;
import librarymanagement.library.Library;

public class LibraryManagementApp {
    public static void main(String[] args) {
        Library.getInstance().setLibraryName("ZSGS LIBRARY");
        Library.getInstance().setLibraryMobileNo("46466465");
        Library.getInstance().setLibraryId(123);

        Books book1 = new Books();
        book1.setName("Sherlock Holmes");
        book1.setAuthor("Sir Arthur Conan Doyle");
        book1.setPublisher("Hills");

        Books book2 = new Books();
        book2.setName("Harry Potter");
        book2.setAuthor("JK Rowling");
        book2.setPublisher("McGraw Hill");

        Library.getInstance().addBooks(book1);
        Library.getInstance().addBooks(book2);

        Members m1 = new Members();
        m1.setEmail("max2002@gmail.com");
        m1.setName("Max Neils");
        m1.setUserId(111);
        m1.addBooks(book2);

        Members m2 = new Members();
        m2.setEmail("sam2002@gmail.com");
        m2.setName("Sam Spade");
        m2.setUserId(112);
        m2.addBooks(book2);

        Library.getInstance().addMembers(m2);
        Library.getInstance().addMembers(m1);

        for(Members m : Library.getInstance().getMembers()) {
            System.out.println(m.getName() + " " + m.getUserId() + " " + m.getEmail());
        }
    }
}
