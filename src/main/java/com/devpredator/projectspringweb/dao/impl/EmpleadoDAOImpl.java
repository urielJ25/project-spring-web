/**
 * 
 */
package com.devpredator.projectspringweb.dao.impl;

import org.springframework.stereotype.Repository;

import com.devpredator.projectspringweb.dao.EmpleadoDAO;

/**
 * @author cesarjimenez
 *
 */
@Repository //Todas las clases sean como clase java de DAO
public class EmpleadoDAOImpl implements EmpleadoDAO {

	@Override
	public String consultarNombreEmpleado() {
		// TODO Auto-generated method stub
		return "Diego Paniagua Lopez";
	}

	
}
