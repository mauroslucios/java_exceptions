package br.com.udemy.write;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program {

	public static void main(String[] args) {
		String[] lines = new String[] {"Good morning","Good afternoon","Good night"};
		String path = "/home/mauroslucios/Documentos/Java/out.txt";
		
		/* Usando a opção true junto ao path acrescenta linhas ao final do arquivo
		 * não apagando os dados ou criando um arquivo novo 
		 */
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){
			for(String line : lines) {
				bw.write(line);
				bw.newLine();
				
			}
			System.out.println("Arquivo criado com sucesso!");
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
}
