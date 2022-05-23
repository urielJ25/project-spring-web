/**
 * 
 */
package com.devpredator.projectspringweb.controllers;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import com.devpredator.projectspringweb.services.SpringService;

/**
 * @author cesarjimenez
 * 
 * CONTROLADOR DE EJEMPLO PARA DEMOSTRAR INTEGRACION DE SPRING CON JSF
 *
 */
@ManagedBean// Controlador de bean
@ViewScoped // Alcance del contolador = pantalla
public class SpringJSFController {
	
	// CREAR OBJ
	
	private String nombreEmpresa;
	
	private String nombreEmpleado;
	
	@ManagedProperty("#{springServiceImpl}") // Inyectar objeto
	private SpringService springServiceImpl; // En donde se inyectará
	

	@PostConstruct //Ejecuta método y incializa
	public void init() { // INICIALIZAR PANTALLA DE JSF
		
		String nombre = this.springServiceImpl.mostrarNombreEmpresa();
		System.out.println(nombre);
		this.nombreEmpresa = nombre;
		
		
		String nombreEmpleado = this.springServiceImpl.mostrarNombreEmpleado();
		System.out.println(nombreEmpleado);
		this.nombreEmpleado = nombreEmpleado;
	}


	/**
	 * @return the springServiceImpl
	 */
	public SpringService getSpringServiceImpl() {
		return springServiceImpl;
	}


	/**
	 * @param springServiceImpl the springServiceImpl to set
	 */
	public void setSpringServiceImpl(SpringService springServiceImpl) {
		this.springServiceImpl = springServiceImpl;
	}


	/**
	 * @return the nombreEmpresa
	 */
	public String getNombreEmpresa() {
		return nombreEmpresa;
	}


	/**
	 * @param nombreEmpresa the nombreEmpresa to set
	 */
	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}


	/**
	 * @return the nombreEmpleado
	 */
	public String getNombreEmpleado() {
		return nombreEmpleado;
	}


	/**
	 * @param nombreEmpleado the nombreEmpleado to set
	 */
	public void setNombreEmpleado(String nombreEmpleado) {
		this.nombreEmpleado = nombreEmpleado;
	}
	
}
