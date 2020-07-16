package br.com.udemy.read;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderBufferedReader {
	
	public static void main(String[] args) {
		
		/*
		 * lendo arquivos com FilerReader e BufferedReader
		 */
		
		String path = "/home/mauroslucios/Documentos/Java/leitura.txt";
				
		try (BufferedReader br = new BufferedReader(new FileReader(path))){
			String line = br.readLine();
			
			while(line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		}catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
	}
}
