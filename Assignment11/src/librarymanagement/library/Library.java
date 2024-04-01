package librarymanagement.library;

import java.util.ArrayList;
import java.util.List;

import librarymanagement.books.Books;
import librarymanagement.members.Members;
public class Library {
    private static int libraryId;
    private static String libraryName;
    private static String libraryMobileNo;
    private static Library library;
    private static List<Books> booksList = new ArrayList<>();
    private static List<Members> memberList = new ArrayList<>();

    private Library() { super(); }

    public static Library getInstance() {
        if(library == null) {
            library = new Library();
        }
        return library;
    }

    public static int getLibraryId() {
        return libraryId;
    }

    public static void setLibraryId(int libraryId) {
        Library.libraryId = libraryId;
    }

    public static String getLibraryName() {
        return libraryName;
    }

    public static void setLibraryName(String libraryName) {
        Library.libraryName = libraryName;
    }


    public static void setLibraryMobileNo(String libraryMobileNo) {
        Library.libraryMobileNo = libraryMobileNo;
    }

    public static Library getLibrary() {
        return library;
    }

    public static void setLibrary(Library library) {
        Library.library = library;
    }

    public static List<Books> getBooksList() {
        return booksList;
    }

    public static void setBooksList(List<Books> booksList) {
        Library.booksList = booksList;
    }

    public static List<Members> getMemberList() {
        return memberList;
    }

    public static void setMemberList(List<Members> memberList) {
        Library.memberList = memberList;
    }

    public void addMembers(Members member) {
        memberList.add(member);
    }

    public List<Members> getMembers() {
        return memberList;
    }

    public void addBooks(Books book) {
        booksList.add(book);
    }
}
