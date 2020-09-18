package hibernate.beans;

public class Autor {
	private int idAutor;
	private String Nombre;
	private String ApellidoPaterno;
	private String ApellidoMaterno;
	private String Fechadenacimiento;
	private String Pais;
	public int getIdAutor() {
		return idAutor;
	}
	public void setIdAutor(int idAutor) {
		this.idAutor = idAutor;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	
	public String getApellidoMaterno() {
		return ApellidoMaterno;
	}
	public void setApellidoMaterno(String apellidoMaterno) {
		ApellidoMaterno = apellidoMaterno;
	}
	public String getFechadenacimiento() {
		return Fechadenacimiento;
	}
	public void setFechadenacimiento(String fechadenacimiento) {
		Fechadenacimiento = fechadenacimiento;
	}
	public String getPais() {
		return Pais;
	}
	public void setPais(String pais) {
		Pais = pais;
	}
	public String getApellidoPaterno() {
		return ApellidoPaterno;
	}
	public void setApellidoPaterno(String apellidoPaterno) {
		ApellidoPaterno = apellidoPaterno;
	}

}
