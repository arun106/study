package com.library;

public interface LibraryInterface {

	public void addBook(Book book);
	public void addStudent(Student Student);
	public void deleteBook(String book);
	public void deleteStudent(String student);
	public boolean checkBookIsBorrowedISBN(String ISBN);
	public boolean searchBookbyTitle(String title);
	public boolean searchBookPartialbyTitle(String title);
	public boolean searchBookbyAuthor(String author);
	public void borrowBook(String studentId,String ISBN);
	public void returnBook(String ISBN);

}
