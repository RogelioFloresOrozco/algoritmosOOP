package com.algoritmosoop.main;
import java.util.Scanner;

import com.algoritmosoop.misclases.Mascota;
public class AppAlbergue {

	public static void main(String[] args) 
	{ 
		Mascota objperro1;
		objperro1=new Mascota();
		
		Mascota objperro2;
		objperro2=new Mascota();
		
		Mascota objperro3;
		objperro3=new Mascota();
		
		Scanner entrada=new Scanner(System.in);
		
		objperro1.setId("1p1");
		objperro1.setNombre("Hanna");
		//objperro1.setRaza("Golden Retriever");
		//objperro1.setDescripcion("Va por la pelota y es color oro");
		
		System.out.println("El id es: ");
		objperro3.setId(entrada.nextLine());
		System.out.println("El nombre es: ");
		objperro3.setNombre(entrada.nextLine());
		//System.out.println("La Raza es: ");
		//objperro3.setRaza(entrada.nextLine());
		//System.out.println("La descripcion es: ");
		//objperro3.setDescripcion(entrada.nextLine());
		
		System.out.println("El id es: "+objperro1.getId());
		System.out.println("El nombre es: "+objperro1.getNombre());
		//System.out.println("La raza es: "+objperro1.getRaza());
		//System.out.println("La descripcion es: "+objperro1.getDescripcion());
		
		System.out.println("El id es: "+objperro2.getId());
		System.out.println("El nombre es: "+objperro2.getNombre());
		//System.out.println("La raza es: "+objperro2.getRaza());
		//System.out.println("La descripcion es: "+objperro2.getDescripcion());
		
		System.out.println("El id es: "+objperro3.getId());
		System.out.println("El nombre es: "+objperro3.getNombre());
		//System.out.println("La raza es: "+objperro3.getRaza());
		//System.out.println("La descripcion es: "+objperro3.getDescripcion());
	}

}
