package DaoImp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Interfaces.IProveedor;
import model.TblProveedorcl2;

public class ClassProveedorImp implements IProveedor {

	@Override
	public void RegistrarProveedor(TblProveedorcl2 tblproveedorcl2) {
		//establecemos conexion con la unidad de persistencia...
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("LPII_CL2_MamaniVilcaJoel");
		//permite gestionar entidades..
		EntityManager em=emf.createEntityManager();
		//iniciamos la transaccion
		em.getTransaction().begin();
		//registramos
		em.persist(tblproveedorcl2);
		//emitimos mensaje por pantalla....
		System.out.println("Proveedor registrado en BD correctamente!!!!!!!!");
		//confirmamos
		em.getTransaction().commit();
		//cerramos la transaccion...
		em.close();		
		
	}

	@Override
	public void ActualizarProveedor(TblProveedorcl2 tblproveedorcl2) {
		
		//establecemos conexion con la unidad de persistencia...
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("LPII_CL2_MamaniVilcaJoel");
		EntityManager em=emf.createEntityManager();
				
		//iniciamos la transaccion
		em.getTransaction().begin();
				
		//actualizamos
		em.merge(tblproveedorcl2);
				
		//emitimos mensaje por consola
		System.out.println("Datos actualizados correctamente");
				
		//confirmamos
		em.getTransaction().commit();
				
		//cerramos
		em.close();
				
	}

	@Override
	public void EliminarProveedor(TblProveedorcl2 tblproveedorcl2) {
		
		//establecemos conexion con la unidad de persistencia...
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("LPII_CL2_MamaniVilcaJoel");
		EntityManager em=emf.createEntityManager();
						
		//iniciamos la transaccion
		em.getTransaction().begin();
						
		//recuperamos el cod a eliminar
		TblProveedorcl2 tblprod=em.merge(tblproveedorcl2);
				
		//procedemos a eliminar
		em.remove(tblprod);
					
		//emitimos mensaje por consola
		System.out.println("Dato eliminado correctamente");
						
		//confirmamos
		em.getTransaction().commit();
						
		//cerramos
		em.close();
		
	}

	@Override
	public List<TblProveedorcl2> ListadoProveedor() {
		
		//establecemos conexion con la unidad de persistencia...
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("LPII_CL2_MamaniVilcaJoel");
		//gestionamos las entidades...
		EntityManager em=emf.createEntityManager();
		//iniciamos la transaccion...
		em.getTransaction().begin();
		//recuperamos el listado de la base de datos..
		List<TblProveedorcl2> listadoproveedor=em.createQuery("select p from TblProveedorcl2 p",TblProveedorcl2.class).getResultList();
		//confirmamos
		em.getTransaction().commit();
		//cerramos
		em.close();
		//retornamos el listado...
		return listadoproveedor;
	}

	@Override
	public TblProveedorcl2 BuscarProveedor(TblProveedorcl2 tblproveedorcl2) {
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("LPII_CL2_MamaniVilcaJoel");
		EntityManager em=emf.createEntityManager();
		
		//iniciamos la transaccion
		em.getTransaction().begin();
		
		//recuperamos el codigo buscar
		TblProveedorcl2 tblprov=em.find(TblProveedorcl2.class,tblproveedorcl2.getIdproveedorcl2());
		
		//confirmamos
		em.getTransaction().commit();
		
		//cerramos
		em.close();
		
		return tblprov;
	}

}
