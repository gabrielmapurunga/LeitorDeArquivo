package br.com.triadworks.abrirarquivo;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class LerArquivo {

	public static void main(String[] args){
		
		String nomeDoArquivo;
		String textoDoArquivo;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Insira o nome do arquivo a ser lido: ");
		nomeDoArquivo = s.nextLine();
		System.out.println();
		
		try{
			InputStream is = new FileInputStream(nomeDoArquivo);
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);
			textoDoArquivo = br.readLine();
		
			while (textoDoArquivo != null){
				System.out.println(textoDoArquivo);
				textoDoArquivo = br.readLine();
			}
			br.close();
			
		} catch(IOException e){
			System.out.println("Erro: " + e);
			System.out.println("Arquivo não encontrado.");
		}
	}

}
