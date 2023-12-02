package obj;

import java.util.ArrayList;

public class Mascota {

	private int ident;
	private String nombre;
	private String especie;
	private String sexo;
	private int edad;
	
	private ArrayList<Cita> historia;

	public Mascota(int ident, String nombre, String especie, String sexo, int edad, ArrayList<Cita> historia) {
		super();
		this.ident = ident;
		this.nombre = nombre;
		this.especie = especie;
		this.sexo = sexo;
		this.edad = edad;
		this.historia = historia;
	}

	public int getIdent() {
		return ident;
	}

	public void setIdent(int ident) {
		this.ident = ident;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public ArrayList<Cita> getHistoria() {
		return historia;
	}

	public void setHistoria(ArrayList<Cita> historia) {
		this.historia = historia;
	}
	
	
	

}
