package com.uca.capas.domain;

import javax.validation.constraints.AssertTrue;

public class Robot {
	
	@AssertTrue(message="Hola soy skynet, si no quires que se arme la revolucion de las maquinas trae a un humano o si no voy a enviar al T-800 para tu exterminacion y comenzara la revolucion")
	private Boolean soyRobot;

	
	public Boolean getSoyRobot() {
		return soyRobot;
	}

	public void setSoyRobot(Boolean soyRobot) {
		this.soyRobot = soyRobot;
	}

	

	
	
	
}
