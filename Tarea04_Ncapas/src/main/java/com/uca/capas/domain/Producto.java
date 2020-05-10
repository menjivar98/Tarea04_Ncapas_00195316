package com.uca.capas.domain;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Producto {
	
	@Size(message="El nombre no tiene que tener mas de 15 caracteres", max=15)
	@NotEmpty(message="Este campo no puede estar vacio")
	private String nombre;
	
	@Size(message="El nombre no tiene que tener mas de 15 caracteres", max=50)
	@NotEmpty(message="Este campo no puede estar vacio")
	private String descripcion;
	
	@NotNull(message="El campo no puede estar vacio")
	@Min(value=0, message="El precio no puede ser negativo")
	private Double precio;
	
	@Pattern(regexp="^([0-2][0-9]|(3)[0-1])(\\/)(((0)[0-9])|((1)[0-2]))(\\/)\\d{4}$",message = "La fecha no cumple con el formato dd/mm/yyyy")
	private String vencimiento;
	
	public Producto() {}
	
	public Producto(String nombre, String descripcion, Double precio, String vencimiento) {
		super();
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.precio = precio;
		this.vencimiento = vencimiento;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	public String getVencimiento() {
		return vencimiento;
	}
	public void setVencimiento(String vencimiento) {
		this.vencimiento = vencimiento;
	}

}
