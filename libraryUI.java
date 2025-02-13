package library;

import java.util.*;

public class libraryUI {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		libraryManagement lm = new libraryManagement();
		ArrayList<libraryManagement> arr = new ArrayList<libraryManagement>();
		
		boolean isTrue = true;
		
		while(isTrue) {
			
			System.out.println("Enter 1 for add book details : ");
			System.out.println("Enter 2 for show book details : ");
			System.out.println("Enter 3 for show all book details : ");
			System.out.println("Enter 4 for update book : ");
			System.out.println("Enter 5 for delete book : ");
			System.out.println("Enter 6 for exit : ");
			
			int key = input.nextInt();
			
			
			if(key == 1) {
				System.out.println("Enter your bookId : ");
				int bookId = input.nextInt();
				input.nextLine();
				System.out.println("Enter your book name : ");
				String bookName = input.nextLine();
				System.out.println("Enter your author : ");
				String author = input.nextLine();
				System.out.println("Enter your book price :");
				double price = input.nextDouble();
				lm = new libraryManagement(bookId , bookName , author ,price);
				arr.add(lm);
			} 
			
			
			else if(key == 2) {
				System.out.println("Enter your bookId");
				int bookId = input.nextInt();
				int count = 0;
				for(libraryManagement lib : arr) {
					count++;
					if(lib.getBookId() == bookId) {
						System.out.println(lib);
						break;
					}
					if(count == arr.size()) {
						isTrue = false;
						System.out.println("not found");
					}
				}
			} 
			
			
			else if(key == 3) {
				System.out.println(arr);
			} 
			
			
			else if(key == 4) {
				input.nextLine();
				System.out.println("Enter your bookId");
				int bookId = input.nextInt();
				int count = 0;
				for(libraryManagement lib : arr) {
					input.nextLine();
					count++;
					if(lib.getBookId() == bookId) {
						System.out.println("Enter your book name : ");
						String bookName = input.nextLine();
						lib.setBookName(bookName);
						System.out.println("Enter your author : ");
						String author = input.nextLine();
						lib.setAuthor(author);
						System.out.println("Enter your book price :");
						double price = input.nextDouble();
						lib.setPrice(price);
						break;
					}
					
					if(count == arr.size()) {
						isTrue = false;
						System.out.println("not found");
					}
				}
			}
			
			
			else if(key == 5) {
				int count = 0;
				System.out.println("Enter your bookId");
				int bookId = input.nextInt();
				for(libraryManagement lib : arr) {
					count++;
					if(lib.getBookId() == bookId) {
						arr.remove(lib);
						break;
					}
					if(count == arr.size()) {
						isTrue = false;
						System.out.println("not found");
					}
				}
			}
			
			
			else if(key == 6) {
				isTrue = false;
				System.out.println("Thank you");
			}
			
		}
	}
}
