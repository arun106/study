package com.library;

import java.util.ArrayList;
import java.util.Iterator;

public class Library implements LibraryInterface {

	ArrayList<Book> booklist;
	ArrayList<Student> studentlist;
	ArrayList<Registry> registry;
	
	public Library()
	{
		booklist = new ArrayList<>();
		studentlist = new ArrayList<>();
		registry = new ArrayList<>();	
	}
	
	@Override
	public void addBook(Book book) {
		// TODO Auto-generated method stub
		booklist.add(book);
	}

	@Override
	public void addStudent(Student student) {
		// TODO Auto-generated method stub
		studentlist.add(student);
	}

	@Override
	public void deleteBook(String ISBN) {
		// TODO Auto-generated method stub
		Iterator<Book> itr = booklist.iterator();
		while(itr.hasNext())
		{
			Book book = (Book) itr.next();
			if(book.ISBN.equalsIgnoreCase(ISBN))
				itr.remove();
		}
	}

	@Override
	public void deleteStudent(String studentId) {
		// TODO Auto-generated method stub
		Iterator<Student> itr = studentlist.iterator();
		while(itr.hasNext())
		{
			Student student = (Student) itr.next();
			if(student.studentId.equalsIgnoreCase(studentId))
				itr.remove();
		}
	}

	@Override
	public boolean checkBookIsBorrowedISBN(String ISBN) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean searchBookbyTitle(String title) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean searchBookPartialbyTitle(String title) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean searchBookbyAuthor(String author) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void borrowBook(String studentId, String ISBN) {
		registry.add(new Registry(studentId,ISBN));
	}

	@Override
	public void returnBook(String ISBN) {
		Iterator<Registry> itr = registry.iterator();
		while(itr.hasNext())
		{
			Registry reg = (Registry) itr.next();
			if(reg.ISBN.equalsIgnoreCase(ISBN))
				itr.remove();
		}		
	}
	
	public static void main(String args[])
	{
		Library library = new Library();
		
		Book book1 = new Book("1","JK Rowling","Harry potter");
		Book book2 = new Book("2","George RR Martin","Game of thrones");
		
		//Add books to library
		library.addBook(book1);
		library.addBook(book2);
		
		Student student1 = new Student("101","Arun Mohan");
		Student student2 = new Student("102","Arya Soman");
		
		//Add students to library list
		library.addStudent(student1);
		library.addStudent(student2);
		
		library.borrowBook("101","1");
		
		//For studying class hierarchy
	}

	
}
