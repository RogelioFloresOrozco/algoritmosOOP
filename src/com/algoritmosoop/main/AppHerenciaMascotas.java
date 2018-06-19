package com.algoritmosoop.main;

import com.algoritmosoop.misclases.GatoDomestico;
import com.algoritmosoop.misclases.GatoSalvaje;
import com.algoritmosoop.misclases.Mascota;

public class AppHerenciaMascotas {

	public static void main(String[] args) 
	{
		Mascota objMascota1=new Mascota();
		
		objMascota1.setNombre("Alligator");
		System.out.println("El nombre es: "+objMascota1.getNombre());
		
		GatoSalvaje objGato1=new GatoSalvaje();
		GatoDomestico objGato2=new GatoDomestico();
		GatoDomestico objGato3=new GatoDomestico();
		GatoDomestico objGato4=new GatoDomestico();
		
		objGato1.setNombre("Tom");
		objGato2.setNombre("Gato Silvestre");
		objGato3.setNombre("Gato felix");
		objGato4.setNombre("pelusa");
		
		System.out.println("El gato 1 se llama: "+objGato1.getNombre());
		System.out.println("El gato 2 se llama: "+objGato2.getNombre());
		System.out.println("La edad maxima: "+objGato2.EdadMaxima);
		System.out.println("El gato 3 se llama: "+objGato3.getNombre());
		System.out.println("La edad maxima: "+objGato3.EdadMaxima);
		System.out.println("El gato 4 se llama: "+objGato4.getNombre());
		System.out.println("La edad maxima: "+objGato4.EdadMaxima);
	}

}
