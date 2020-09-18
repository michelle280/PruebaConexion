package hibernate.operaciones;
import hibernate.beans.Libros;
import org.hibernate.Session;
import hibernate.conexion.CrearConexion;

public class OperacionesLibros {
	public  void insertarLibros(Libros libros) {
		try {
			Session sesion= CrearConexion.getSessionFactory().openSession();
			System.out.println("creando conexión");
			sesion.beginTransaction();
			sesion.save(libros);
			
			sesion.close();
			
		}
		catch(Throwable ex){
			System.err.println("No se pudo crear la sesion"+ex);
			throw new ExceptionInInitializerError(ex);
			
		}
	}

}
