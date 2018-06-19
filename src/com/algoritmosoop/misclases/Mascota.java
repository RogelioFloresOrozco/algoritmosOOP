package com.algoritmosoop.misclases;

import java.util.Date;

public class Mascota 
{
	private String id;
	private String nombre;
	private String especie;
	private Date fechaIngreso;
	private Date fechaSalida;
	private String estado;
	
	public Mascota()
	{
		
		
	}
	
	public String getId()
	{
		return id;
	}
	public void setId(String id)
	{
		this.id=id;
	}
	
	public String getNombre()
	{
		return nombre;
	}
	public void setNombre(String nombre)
	{
		this.nombre=nombre;
	}
	
	public String getEspecie()
	{
		return especie;
	}
	
	public void setEspecie(String especie)
	{
		this.especie=especie;
	}
	public String getEstado()
	{
		return estado;
	}
	
	public void setEstado(String estado)
	{
		this.estado=estado;
	}
	
	public Date getFechaIngreso()
	{
		return fechaIngreso;
	}
	
	public void setFechaIngreso(Date fechaIngreso)
	{
		this.fechaIngreso=fechaIngreso;
	}
	public Date getFechaSalida()
	{
		return fechaSalida;
	}
	
	public void setFechaSalida(Date fechaSalida)
	{
		this.fechaSalida=fechaSalida;
	}
	
}
