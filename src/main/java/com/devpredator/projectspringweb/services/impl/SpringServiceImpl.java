/**
 * 
 */
package com.devpredator.projectspringweb.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devpredator.projectspringweb.dao.EmpleadoDAO;
import com.devpredator.projectspringweb.services.SpringService;

/**
 * @author cesarjimenez
 *
 */

@Service 	//GENERAR OBJETOS DE TIPO LOGICO
public class SpringServiceImpl implements SpringService {

	@Autowired //
	private EmpleadoDAO empleadoDAOImpl;
	
	
	@Override
	public String mostrarNombreEmpresa() {
		// TODO Auto-generated method stub
		return "Anotaciones con Spring y JSF";
	}


	@Override
	public String mostrarNombreEmpleado() {
		return this.empleadoDAOImpl.consultarNombreEmpleado();
	}

	
}
