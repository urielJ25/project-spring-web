/**
 * 
 */
package com.devpredator.projectspringweb.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.devpredator.projectspringweb.services.SpringService;
import com.devpredator.projectspringweb.services.impl.SpringServiceImpl;

/**
 * @author cesarjimenez
 *
 * CLASE DE PRUEBA UNITARIA CON SPRING Y JUNIT 4
 * NO TIENE SOPORTE SPRING TEST PARA JUNIT 5
 *
 */
@RunWith(SpringRunner.class) // ejecutar pruebas unitarias con spring y clases
@ContextConfiguration(locations = {"classpath:applicationContext-test.xml"}) // INDICAR UBICACION DE APPLICATIONCONTEXT
public class SpringJUnit4Test {

	@Autowired
	private SpringService springServiceImpl;
	
	@Test
	public void test() {
		assertNotNull(this.springServiceImpl);
		System.out.println(this.springServiceImpl.mostrarNombreEmpleado());
	}

}
