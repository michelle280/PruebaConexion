package hibernate.operaciones;
import org.hibernate.Session;
import hibernate.beans.Cliente;
import hibernate.conexion.CrearConexion;

public class OperacionesCliente {
	public void insertarCliente(Cliente cliente) {
		try {
			Session sesion= CrearConexion.getSessionFactory().openSession();
			sesion.beginTransaction();
			sesion.save(cliente);
			System.out.println("Cliente Registrado");
			sesion.getTransaction().commit();
			sesion.close();
					}
		catch (Throwable ex) {
			System.err.println("No se pudo crear la sesion"+ex);
			throw new ExceptionInInitializerError(ex);
			
		}
	}

}
