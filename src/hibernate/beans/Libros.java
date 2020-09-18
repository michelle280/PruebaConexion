package hibernate.beans;

public class Libros {
	private int ISBN;
	private String Nombrelibro;
	private int nejemplares;
	private int edicion;
	private int npaginas;
	private String Ano;
	private int AutorIdAutor;
	public int getISBN() {
		return ISBN;
	}
	public void setISBN(int iSBN) {
		ISBN = iSBN;
	}
	public String getNombrelibro() {
		return Nombrelibro;
	}
	public void setNombrelibro(String nombrelibro) {
		Nombrelibro = nombrelibro;
	}
	public int getNejemplares() {
		return nejemplares;
	}
	public void setNejemplares(int nejemplares) {
		this.nejemplares = nejemplares;
	}
	public int getEdicion() {
		return edicion;
	}
	public void setEdicion(int edicion) {
		this.edicion = edicion;
	}
	public int getNpaginas() {
		return npaginas;
	}
	public void setNpaginas(int npaginas) {
		this.npaginas = npaginas;
	}
	public String getAno() {
		return Ano;
	}
	public void setAno(String ano) {
		Ano = ano;
	}
	public int getAutorIdAutor() {
		return AutorIdAutor;
	}
	public void setAutorIdAutor(int autorIdAutor) {
		AutorIdAutor = autorIdAutor;
	}
	
	

}
