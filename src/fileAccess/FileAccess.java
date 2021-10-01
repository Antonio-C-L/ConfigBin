package fileAccess;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

import clases.Configuracion;

public class FileAccess<E> {

	private File file;


	public static final String NOMBRE="conf.bin";

	public FileAccess() {
		file=new File(NOMBRE);
	}

	public void crearFichero(List<Object> lista) {
		try (
				FileOutputStream fos=new FileOutputStream(file);
				DataOutputStream dos=new DataOutputStream(fos)
				){
			dos.writeBoolean((boolean) lista.get(0));
			dos.writeChar((char) lista.get(1));
			dos.writeDouble((double) lista.get(2));
			dos.writeChars((String) lista.get(3));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public Object buscarDato(String dato) {
		Object obj = null;
		if(existe(file)) {
			try (
					FileInputStream fis=new FileInputStream(file);
					DataInputStream dis=new DataInputStream(fis);
					){
				switch (dato){
				case "boolean": 
					obj=dis.readBoolean();
					break;
				case "char":
					obj=dis.readChar();
					break;
				case "double":
					obj=dis.readDouble();
					break;
				case "string":
					obj=dis.readChar();
					break;
				}

			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException  e) {
				e.printStackTrace();
			} 
		}
		return obj;
	}

	private boolean existe(File file) {
		return file.exists() && !(file.isDirectory());
	}


}
