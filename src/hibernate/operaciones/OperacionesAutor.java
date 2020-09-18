package hibernate.operaciones;
import hibernate.beans.Autor;
import hibernate.conexion.CrearConexion;
import org.hibernate.Session;

public class OperacionesAutor {
	public void insertarAutor(Autor autor) {
		try {
	            Session sesion=CrearConexion.getSessionFactory().openSession();
	            sesion.beginTransaction();
	            sesion.save(autor);
	            System.out.println("Autor Registrado");
	            sesion.getTransaction().commit();
	            sesion.close();
	            
	           					
		  }
		catch (Throwable ex){
			System.err.println("No se pudo crear la sesion"+ ex);
			throw new ExceptionInInitializerError(ex);
				
			
		}
	}
}
	
	
	


