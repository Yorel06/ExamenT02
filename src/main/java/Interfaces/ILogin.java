package Interfaces;

import java.util.List;

import model.TblUsuariocl2;



public interface ILogin {

	//declaramos los metodos..
		void RegistrarLogin(TblUsuariocl2 tblusuariocl2);
		void ActualizarLogin(TblUsuariocl2 tblusuariocl2);
		void EliminarLogin(TblUsuariocl2 tblusuariocl2);
		List<TblUsuariocl2> ListadoLogin();
		TblUsuariocl2 BuscarLogin(TblUsuariocl2 tblusuariocl2);
	
}
