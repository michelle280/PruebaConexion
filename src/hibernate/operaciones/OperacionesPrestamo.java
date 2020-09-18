package hibernate.operaciones;

import org.hibernate.Session;
import hibernate.beans.Prestamo;
import hibernate.conexion.CrearConexion;

public class OperacionesPrestamo {
	public  void insertarPrestamo(Prestamo prestamo) {
		try {
			Session sesion= CrearConexion.getSessionFactory().openSession();
			sesion.beginTransaction();
			sesion.save(prestamo);
			sesion.close();
			
		}
		catch(Throwable ex){
			System.err.println("No se pudo crear la sesion"+ex);
			throw new ExceptionInInitializerError(ex);
			
		}
	}
}


