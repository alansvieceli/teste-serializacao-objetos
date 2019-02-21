package aplication;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import model.entity.Teste;

public class Main {
	
	private static String arquivo = "teste.bin";

	public static void main(String[] args) throws FileNotFoundException, ParseException, IOException, ClassNotFoundException {
		
		serializar();
		
		deserializa();

	}
	
	public static void serializar() throws ParseException, FileNotFoundException, IOException {
		
		Teste teste = new Teste();
		teste.setNome("Alan");
		teste.setIdade(37);
		teste.setSalario(354.45);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		teste.setData_aniversario(sdf.parse("20/05/1982"));
		
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(arquivo))){
			oos.writeObject(teste);			
		}
		
	}
	
	public static void deserializa() throws FileNotFoundException, IOException, ClassNotFoundException {
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(arquivo))){
			Teste teste = (Teste) ois.readObject();
			System.out.println(teste.getNome());
			System.out.println(teste.getData_aniversario());
		}
		
		
		
	}

}
