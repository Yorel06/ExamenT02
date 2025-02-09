package Interfaces;

import java.util.List;

import model.TblProveedorcl2;

public interface IProveedor {

	//declaramos los metodos..
		void RegistrarProveedor(TblProveedorcl2 tblproveedorcl2);
		void ActualizarProveedor(TblProveedorcl2 tblproveedorcl2);
		void EliminarProveedor(TblProveedorcl2 tblproveedorcl2);
		List<TblProveedorcl2> ListadoProveedor();
		TblProveedorcl2 BuscarProveedor(TblProveedorcl2 tblproveedorcl2);
		
}
