package Controlador;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DaoImp.ClassProveedorImp;
import model.TblProveedorcl2;

/**
 * Servlet implementation class ControladorProveedor
 */
public class ControladorProveedor extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public ControladorProveedor() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		//Instanciamos la respectiva clase
		ClassProveedorImp crudimp=new ClassProveedorImp();
		TblProveedorcl2 tblprov=new TblProveedorcl2();
		//Recuperamos el listado de proveedores de la BD
		List<TblProveedorcl2> listadoproves=crudimp.ListadoProveedor();
				
		//enviamos a la vista
		//almacenamos en el respectivo metodo
		request.setAttribute("listado", listadoproves);
				
				
		//Declaramos una variabe de tipo String
		//recibimos el valor según la acción
		String accion=request.getParameter("accion");
				
		//aplicamos una condicion
		if(accion!=null){
					
		//aplicamos un switch
		switch(accion){
					
			case "Modificar":
			//obtenemos el codigo
			int cod=Integer.parseInt(request.getParameter("cod"));
			//asignamos el codigo
			tblprov.setIdproveedorcl2(cod);
			//buscamos el codigo actualizar
			TblProveedorcl2 prod=crudimp.BuscarProveedor(tblprov);
			SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
			//asignamos valores
				request.setAttribute("codigo", prod.getIdproveedorcl2());
				request.setAttribute("proveedor", prod.getNomproveecl2());
				request.setAttribute("ruc", prod.getRucproveecl2());
				request.setAttribute("rsocial", prod.getRsocialproveecl2());
				request.setAttribute("correo", prod.getEmailproveecl2());				
				request.setAttribute("fecha",format.format(prod.getFeingproveecl2()));
				//redireccionamos
				request.getRequestDispatcher("/FrmActualizarProveedor.jsp").forward(request, response);
						
				break; //salimos
						
			case "Registrar":
			//redireccionamos a la vista jsp
			request.getRequestDispatcher("/FrmRegistrarProveedor.jsp").forward(request, response);
			break;
						
			case "Eliminar":
			//obtenemos el codigo
			int codelim=Integer.parseInt(request.getParameter("cod"));
			//asignamos el codigo
			tblprov.setIdproveedorcl2(codelim);
			//invocamos al metodo a eliminar...
			crudimp.EliminarProveedor(tblprov);
			List<TblProveedorcl2> listado=crudimp.ListadoProveedor();
			//enviamos hacia la vista
			request.setAttribute("listado",listado);
			//redireccionamos
			request.getRequestDispatcher("/MenuPrincipal.jsp").forward(request, response);

			break;
						
			case "Listar":
			//redireccionamos a la vista jsp
			request.getRequestDispatcher("/MenuPrincipal.jsp").forward(request, response);
			break;
			}
		}
		
	}
	
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		//recuperamos los datos del formulario
		String codigo=request.getParameter("codigo");	
		
		String proveedor=request.getParameter("proveedor");
		String ruc=request.getParameter("ruc");
		String rsocial=request.getParameter("rsocial");	
		String correo=request.getParameter("correo");		
		Date fecha=new Date();
		Date fechasql=new Date(fecha.getTime());
				
		//hacemos las instancias
				
		TblProveedorcl2 tblprov=new TblProveedorcl2();
		ClassProveedorImp climp=new ClassProveedorImp();
				
		//asignamos valores
		tblprov.setNomproveecl2(proveedor);
		tblprov.setRucproveecl2(ruc);
		tblprov.setRsocialproveecl2(rsocial);
		tblprov.setEmailproveecl2(correo);		
		tblprov.setFeingproveecl2(fechasql);
				
		//aplicamos condicion para actualizar
		if(codigo!=null){
		int cod=Integer.parseInt(codigo);
		//luego asignamos el codigo a actualizar
		tblprov.setIdproveedorcl2(cod);
		//invocamos el metodo a actualizar
		climp.ActualizarProveedor(tblprov);
			}else{
				climp.RegistrarProveedor(tblprov);
			}
				
				
		//invocamos el metodo registrar		
		climp.RegistrarProveedor(tblprov);
				
		//actualizamos el listado
		List<TblProveedorcl2> listado=climp.ListadoProveedor();
				
		//enviamos hacia la vista
		request.setAttribute("listado", listado);
				
		//redireccionamos
		request.getRequestDispatcher("/MenuPrincipal.jsp").forward(request, response);
	}

}
