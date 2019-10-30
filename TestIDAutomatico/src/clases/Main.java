package clases;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		Trabajador.id = cargar();
		Trabajador t = new Trabajador();
		System.out.println(Trabajador.id);
		Trabajador t2 = new Trabajador();
		System.out.print(Trabajador.id);
		escribir();
	}
	
	static int cargar() throws NumberFormatException, IOException {
		File archivo = new File("contador.txt");
		BufferedReader leerFichero = new BufferedReader(new FileReader(archivo));
		int id = Integer.parseInt(leerFichero.readLine());
		leerFichero.close();
		return id;
	}
	
	static void escribir() throws IOException {
		File archivo = new File("contador.txt");
		BufferedWriter escribirFichero = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(archivo), "utf-8"));
		escribirFichero.write(String.valueOf(Trabajador.id));
		escribirFichero.close();
	}

}
