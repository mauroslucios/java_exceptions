package br.com.udemy.read;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		File file = new File("/home/mauroslucios/Documentos/Java/leitura.txt");
		Scanner entrada = null;
		try {
			entrada = new Scanner(file);
			while(entrada.hasNextLine()) {
				System.out.println(entrada.nextLine());
			}
		}catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		finally {
			if(entrada != null) {
			entrada.close();
			}
		}
	}
}
