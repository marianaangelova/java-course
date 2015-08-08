package readAndWrite;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class ReadAndWriteFile {
	public static void main(String[] args) {
		try {
			String fileName = "..\\HW-SecondPart\\FileForReading.txt";
			String read = readFile(fileName);
			//System.out.println(read);
		    read = read.replaceAll("[?'.();:]+", "");
		    read = read.replaceAll("-", "");
		    read = read.replaceAll("\"", "");
		    String filePath = "..\\HW-SecondPart\\FileForWrite.txt";
		    writeFile(filePath, read);
		} catch (FileNotFoundException e) {
			System.out.println("The file does not exist! Unable to read it.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static String readFile(String fileName) throws FileNotFoundException,IOException{
			FileInputStream fis = new FileInputStream(fileName);
			BufferedReader in = new BufferedReader(new InputStreamReader(fis));
			StringBuilder fileContent = new StringBuilder();
			while (in.ready()) {
				fileContent.append(in.readLine());
			}
			String content = fileContent.toString();
			
			in.close();
			fis.close();
			return content;
	}
	public static void writeFile(String filePath,String text)throws FileNotFoundException{
		PrintStream fileWriter = new PrintStream(filePath);
		fileWriter.println(text);
		System.out.println("Text copied");
		fileWriter.close();
	}
	
}
