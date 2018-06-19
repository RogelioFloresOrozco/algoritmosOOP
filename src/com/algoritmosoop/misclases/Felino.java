package com.algoritmosoop.misclases;

import java.util.Date;

public class Felino extends Mascota
{
	private String tipoFelino;
	public Date fechaCambioEstado;
	
	public String getTipoFelino()
	{
		return tipoFelino;
	}
	public void setId(String tipoFelino)
	{
		this.tipoFelino=tipoFelino;
	}
}
