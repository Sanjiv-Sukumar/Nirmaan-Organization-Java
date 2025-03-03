package FH;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

import library.libraryManagement;


public class FileHandling {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		libraryManagement library = new libraryManagement();
		ArrayList<libraryManagement> lm = new ArrayList<libraryManagement>();
		
		String path = "C:\\Users\\lalse\\OneDrive\\Desktop\\Sanjiv\\sample.txt";
		
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
				lm = readFile(path);
				System.out.println("Enter your bookId : ");
				int bookId = input.nextInt();
				input.nextLine();
				System.out.println("Enter your book name : ");
				String bookName = input.nextLine();
				System.out.println("Enter your author : ");
				String author = input.nextLine();
				System.out.println("Enter your book price :");
				double price = input.nextDouble();
				library = new libraryManagement(bookId , bookName , author ,price);
				lm.add(library);
				
				writeFile(path, lm);
			} 
			
			
			else if(key == 2) {
				lm = readFile(path);
				System.out.println("Enter your bookId");
				int bookId = input.nextInt();
				int count = 0;
				for(libraryManagement lib : lm) {
					count++;
					if(lib.getBookId() == bookId) {
						System.out.println(lib);
						break;
					}
					if(count == lm.size()) {
						isTrue = false;
						System.out.println("not found");
					}
				}
				
			} 
			
			
			else if(key == 3) {
				lm = readFile(path);
				System.out.println(lm);
			} 
			
			
			else if(key == 4) {
				lm = readFile(path);
				
				input.nextLine();
				System.out.println("Enter your bookId");
				int bookId = input.nextInt();
				int count = 0;
				for(libraryManagement lib : lm) {
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
					
					if(count == lm.size()) {
						isTrue = false;
						System.out.println("not found");
					}
				}
				writeFile(path, lm);
			}
			
			
			else if(key == 5) {
				lm = readFile(path);
				
				int count = 0;
				System.out.println("Enter your bookId");
				int bookId = input.nextInt();
				for(libraryManagement lib : lm) {
					count++;
					if(lib.getBookId() == bookId) {
						lm.remove(lib);
						break;
					}
					if(count == lm.size()) {
						isTrue = false;
						System.out.println("not found");
					}
				}
				writeFile(path, lm);
			}
			
			
			else if(key == 6) {
				isTrue = false;
				System.out.println("Thank you");
			}
			
		}
		
		
		
	}

	private static void writeFile(String path, ArrayList<libraryManagement> lm) {
		try {
			FileOutputStream fos = new FileOutputStream(path);
		
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			oos.writeObject(lm);
			
			oos.close();
			fos.close();
		} catch (Exception e) {
			System.out.println("Error Occured");
		}
		
	}

	private static ArrayList<libraryManagement> readFile(String path) {
		ArrayList<libraryManagement> lm = new ArrayList<libraryManagement>();

			try {
				FileInputStream fis = new FileInputStream(path);
			
				ObjectInputStream ois = new ObjectInputStream(fis);
				
				
				lm = (ArrayList<libraryManagement>) ois.readObject();
				
				System.out.println("Success");
				
				ois.close();
				fis.close();
			} catch (Exception e) {
				System.out.println("File is empty ready to store data");
			}

		
		return lm;
	}
	
	
	

}
