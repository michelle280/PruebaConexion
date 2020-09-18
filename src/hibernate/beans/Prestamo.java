package hibernate.beans;

public class Prestamo {
	private int idPrestamo;
	private String FechaPrestamo;
	private String FechaDevolucion;
	private int Nprestamo;
	private int ClienteIdCliente;
	private int LibrosISBN;
	
	
	public int getIdPrestamo() {
		return idPrestamo;
	}
	public void setIdPrestamo(int idPrestamo) {
		this.idPrestamo = idPrestamo;
	}
	public String getFechaPrestamo() {
		return FechaPrestamo;
	}
	public void setFechaPrestamo(String fechaPrestamo) {
		FechaPrestamo = fechaPrestamo;
	}
	public String getFechaDevolucion() {
		return FechaDevolucion;
	}
	public void setFechaDevolucion(String fechaDevolucion) {
		FechaDevolucion = fechaDevolucion;
	}
	
	public int getClienteIdCliente() {
		return ClienteIdCliente;
	}
	public void setClienteIdCliente(int clienteIdCliente) {
		ClienteIdCliente = clienteIdCliente;
	}
	public int getLibrosISBN() {
		return LibrosISBN;
	}
	public void setLibrosISBN(int librosISBN) {
		LibrosISBN = librosISBN;
	}
	public int getNprestamo() {
		return Nprestamo;
	}
	public void setNprestamo(int nprestamo) {
		Nprestamo = nprestamo;
	}
	
	
}
