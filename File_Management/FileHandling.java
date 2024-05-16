import java.io.*;
import java.nio.file.*;
import java.util.Scanner;
import java.util.Date;

public class FileHandling  {
	private static final Scanner sc = new Scanner(System.in);
	private static final String DIARY_FILE = "diary.txt";
	
	// Method to create a new file and write to it
		private static void createAndWriteFile() {
			try {
				Path path = Paths.get(DIARY_FILE);
	
				if (Files.exists(path)) {
					System.out.println("File already exists. Content will be overwritten.");
				} else {
					System.out.println("Creating a new file.");
				}
				System.out.print("Enter your diary entry: ");
				String entry = sc.nextLine();
				String content = new Date() + "\n" + entry;
	
				Files.write(path, content.getBytes());
				System.out.println("Entry saved successfully.");
			} catch (IOException e) {
				System.out.println("Error writing to file: " + e.getMessage());
			}
		}

	// Method to read from a file and display its contents
		private static void readFile() {
			try {
				Path path = Paths.get(DIARY_FILE);
	
				if (!Files.exists(path)) {
					System.out.println("File does not exist.");
					return;
				}
				System.out.println("Diary entries:");
	
				Files.lines(path).forEach(System.out::println);
			} catch (IOException e) {
				System.out.println("Error reading file: " + e.getMessage());
			}
		}

	// Method to append content to an existing file
		private static void appendToFile() {
			try {
				Path path = Paths.get(DIARY_FILE);
	
				if (!Files.exists(path)) {
					System.out.println("File does not exist, creating a new file.");
					createAndWriteFile();
					return;
				}
				System.out.print("Enter your diary entry to append: ");
				String entry = sc.nextLine();
				String content = "\n" + new Date() + "\n" + entry;
	
				Files.write(path, content.getBytes(), StandardOpenOption.APPEND);
				System.out.println("Entry appended successfully.");
			} catch (IOException e) {
				System.out.println("Error appending to file: " + e.getMessage());
			}
		}

	// Method to list all files and directories in a given path
		private static void listFilesAndDirectories() {
			System.out.print("Enter the directory path: ");
			String directoryPath = sc.nextLine();
			File directory = new File(directoryPath);
	
			if (!directory.exists() || !directory.isDirectory()) {
				System.out.println("Directory does not exist or is not a directory.");
				return;
			}
			System.out.println("Listing files and directories:");
	
			String[] fileList = directory.list();
			if (fileList != null) {
				for (String file : fileList) {
					System.out.println(file);
				}
			}
		}

	// Method to filter and list .txt files in a directory
		private static void filterAndListTxtFiles() {
			System.out.print("Enter the directory path to filter .txt files: ");
			String directoryPath = sc.nextLine();
			File directory = new File(directoryPath);
	
			if (!directory.exists() || !directory.isDirectory()) {
				System.out.println("Directory does not exist or is not a directory.");
				return;
			}
			System.out.println("Listing .txt files:");
			File[] files = directory.listFiles((dir, name) -> name.endsWith(".txt"));
			if (files != null) {
				for (File file : files) {
					System.out.println(file.getName());
				}
			}
		}

	// Method to delete a specific file given by the user
		private static void deleteSpecificFile() {
			System.out.print("Enter the file name to delete: ");
			String fileName = sc.nextLine();
			File file = new File(fileName);

			if (!file.exists()) {
				System.out.println("File does not exist.");
				return;
			}
			if (file.delete()) {
				System.out.println("File deleted successfully.");
			} else {
				System.out.println("File could not be deleted.");
			}
		}

	// Method to copy content from one file to another
		private static void copyFileContent() {
			System.out.print("Enter source file path: ");
			String sourcePath = sc.nextLine();
			System.out.print("Enter destination file path: ");
			String destPath = sc.nextLine();
			Path source = Paths.get(sourcePath);
			Path destination = Paths.get(destPath);
			try {

				if (Files.exists(destination)) {
					System.out.print("Destination file already exists. Overwrite? (y/n): ");
					String response = sc.nextLine();
					if (!response.equalsIgnoreCase("y")) {
						System.out.println("Copy operation cancelled.");
						return;
					}
				}

				Files.copy(source, destination, StandardCopyOption.REPLACE_EXISTING);
				System.out.println("File copied successfully.");
			} catch (IOException e) {
				System.out.println("Error copying file: " + e.getMessage());
			}
		}

	// Method to rename a file specified by the user
		private static void renameFile() {
			System.out.print("Enter current file name: ");
			String currentName = sc.nextLine();
			System.out.print("Enter new file name: ");
			String newName = sc.nextLine();
			File file = new File(currentName);
			File newFile = new File(newName);

			if (!file.exists()) {
				System.out.println("File does not exist.");
				return;
			}
			if (file.renameTo(newFile)) {
				System.out.println("File renamed successfully.");
			} else {
				System.out.println("File could not be renamed.");
			}
		}

	// Method to display metadata of a file
		private static void displayFileMetadata() {
			System.out.print("Enter file name: ");
			String fileName = sc.nextLine();
			File file = new File(fileName);
	
			if (!file.exists()) {
				System.out.println("File does not exist.");
				return;
			}

			System.out.println("File Metadata:");
			System.out.println("Size: " + file.length() + " bytes");
			System.out.println("Last Modified: " + new Date(file.lastModified()));
		}

	// Method to recursively list all files and subdirectories in a given directory
		private static void recursiveDirectoryListing() {
			System.out.print("Enter the directory path: ");
			String directoryPath = sc.nextLine();
			File directory = new File(directoryPath);
			if (!directory.exists() || !directory.isDirectory()) {
				System.out.println("Directory does not exist or is not a directory.");
				return;
			}
			System.out.println("Recursive Directory Listing:");
			listDirectory(directory, 0);
		}

	// Helper method to recursively list directory contents
		private static void listDirectory(File dir, int level) {
			if (!dir.isDirectory()) {
				return;
			}
			File[] files = dir.listFiles();
			if (files != null) {
				for (File file : files) {
					for (int i = 0; i < level; i++) {
						System.out.print(" ");
					}
					System.out.println(file.getName());
					if (file.isDirectory()) {
						listDirectory(file, level + 1);
					}
				}
			}
		}
	

	public static void main(String[] args) {
		while (true) {
			System.out.println("\nFile Handling Operations:");
			System.out.println("1. Create and Write to a File");
			System.out.println("2. Read from a File");
			System.out.println("3. Append Content to an Existing File");
			System.out.println("4. List Files and Directories");
			System.out.println("5. Filter and List Specific File Types");
			System.out.println("6. Delete a Specific File");
			System.out.println("7. Copy File Content");
			System.out.println("8. Rename a File");
			System.out.println("9. Display File Metadata");
			System.out.println("10. Recursive Directory Listing");
			System.out.println("11. Exit");
			System.out.print("Choose an operation: ");
			int choice = sc.nextInt();
			sc.nextLine(); // consume the newline
			switch (choice) {
			case 1:
				createAndWriteFile();
				break;
			case 2:
				readFile();
				break;
			case 3:
				appendToFile();
				break;
			case 4:
				listFilesAndDirectories();
				break;
			case 5:
				filterAndListTxtFiles();
				break;
			case 6:
				deleteSpecificFile();
				break;
			case 7:
				copyFileContent();
				break;
			case 8:
				renameFile();
				break;
			case 9:
				displayFileMetadata();
				break;
			case 10:
				recursiveDirectoryListing();
				break;
			case 11:
				System.out.println("Thanks for using our service.");
				System.exit(0);
			default:
				System.out.println("Invalid choice, please choose again.");
			}
		}
	}


}
