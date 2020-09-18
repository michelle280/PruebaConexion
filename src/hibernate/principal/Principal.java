package hibernate.principal;
  import hibernate.conexion.CrearConexion;
  import hibernate.beans.Autor;
  import hibernate.operaciones.OperacionesAutor;
  import hibernate.operaciones.OperacionesCliente;
  import hibernate.beans.Cliente;
  import hibernate.operaciones.OperacionesLibros;
import hibernate.operaciones.OperacionesPrestamo;
import hibernate.beans.Libros;
import hibernate.beans.Prestamo;
  
  
   
public class Principal {
	
	
	 public static void main(String[] args)  {
						
			/*
			 * Session sesion = CrearConexion.getSessionFactory().openSession(); String
			 * sql="SELECT VERSION()"; String resultado = (String)
			 * sesion.createNativeQuery(sql).getSingleResult();
			 * System.out.println("La versión que estás usando es: " + resultado);
			 * CrearConexion.getSessionFactory().close();
			 */
			 
				 			 
	      //  insertarAutor();
	       // insertarCliente();
	        insertarLibros();
	        //insertarPrestamo();
	        CrearConexion.closeSessionFactory();
	 }
	
	
		 public static void insertarAutor() { 
	     OperacionesAutor operaciones= new  OperacionesAutor(); 
	     Autor autor=new Autor(); 
	     autor.setIdAutor(103);
		 autor.setNombre("J.K");
		 autor.setApellidoMaterno("");
		 autor.setApellidoPaterno("Rowling");
		 autor.setFechadenacimiento("1900-04-04"); 
		 operaciones.insertarAutor(autor); 
		
		 }
		public static void insertarCliente() {
		   	OperacionesCliente operaciones =new OperacionesCliente();
		   	Cliente cliente=new Cliente();
		   	cliente.setIdCliente(202);
		   	cliente.setNombre("Michelle");
		   	cliente.setApellidoPaterno("Carranza");
		   	cliente.setApellidoMaterno("Gutierrez");
		   	cliente.setDireccion("Luis Lara 53 CDMX Iztapalapa");
		   	cliente.setEmail("mcarrgut@amigo.com");
		   	cliente.setTelefono(55112332);
		   	operaciones.insertarCliente(cliente);
		          }
		public static void insertarLibros() {
			OperacionesLibros operaciones= new OperacionesLibros();
			Libros libros=new Libros();
			libros.setAutorIdAutor(101);
			libros.setISBN(1234324);
			libros.setNejemplares(4);
			libros.setNombrelibro("Cien años de soledad");
			libros.setEdicion(1001);
			libros.setNpaginas(231);
			libros.setAno("1985-12-02");
			System.out.println("holaaa");
			operaciones.insertarLibros(libros);
			
		}
		public static void insertarPrestamo() {
			OperacionesPrestamo operaciones=new OperacionesPrestamo();
			Prestamo prestamo=new Prestamo();
			prestamo.setClienteIdCliente(202);
			prestamo.setFechaDevolucion("2020-08-23");
			prestamo.setFechaPrestamo("2020-10-23");
			prestamo.setLibrosISBN(1234324);
			prestamo.setNprestamo(1);
			operaciones.insertarPrestamo(prestamo);
					
		}
		
		
}
		
		
		
		
		