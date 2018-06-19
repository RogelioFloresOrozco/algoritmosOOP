package com.algoritmosoop.main;
import java.util.Scanner;

import com.algoritmosoop.misclases.Libro;
public class AppAlgoritmosOOP {

	public static void main(String[] args) 
	{
		
		Libro objLibro1;
		objLibro1 = new Libro("102B");
		Libro objLibro2;
		objLibro2 = new Libro();
		Libro objLibro3;
		objLibro3 = new Libro();
		char cPastaDura=' ';
		
		Scanner entrada= new Scanner(System.in);
		
		System.out.println(objLibro1.getClass());
		
		objLibro1.ISBN="101B";
		objLibro1.autor="El Macho";
		objLibro1.noHojas=250;
		objLibro1.anio=1998;
		objLibro1.Titulo="La guerra de los mundos";
		objLibro1.precio=200.0;
		objLibro1.isPastaDura=true;
		
		System.out.println("El libro "+objLibro1.Titulo+" Con ISBN"+objLibro1.ISBN+
				" Con el autor "+objLibro1.autor+" Con el NO. de hojas "+objLibro1.noHojas+
				" Con el año "+objLibro1.anio+" Con un precio de "+
				objLibro1.precio+" Con Pasta Dura "+objLibro1.isPastaDura);
		
		System.out.println("Introduce el ISBN del libro: ");
		objLibro2.ISBN=entrada.nextLine();
		
		System.out.println("Introduce el nombre del libro: ");
		objLibro2.Titulo=entrada.nextLine();
		
		System.out.println("Introduce el autor del libro: ");
		objLibro2.autor=entrada.nextLine();
		
		System.out.println("Introduce el numero de hojas del libro: ");
		objLibro2.noHojas= entrada.nextInt();
		
		System.out.println("Introduce el año del libro: ");
		objLibro2.anio= entrada.nextInt();
		
		System.out.println("Introduce el precio del libro: ");
		objLibro2.precio=entrada.nextInt();
		
		System.out.println("Introduce si el libro es de pasta dura S/N : ");	
		cPastaDura= entrada.next().charAt(0);
		
		if(cPastaDura == 'S'|| cPastaDura== 's')
		{
			objLibro2.isPastaDura=true;
		}
		else
		{
			objLibro2.isPastaDura=false;
		}

		System.out.println("El libro "+objLibro2.Titulo+" Con ISBN "+objLibro2.ISBN+
				" Con el autor "+objLibro2.autor+" Con el NO. de hojas "+objLibro2.noHojas+
				" Con el año "+objLibro2.anio+" Con un precio de "+
				objLibro2.precio+" Con Pasta Dura "+objLibro2.isPastaDura);
		
		System.out.println("El libro "+objLibro3.Titulo+" Con ISBN "+objLibro3.ISBN+
				" Con el autor "+objLibro3.autor+" Con el NO. de hojas "+objLibro3.noHojas+
				" Con el año "+objLibro3.anio+" Con un precio de "+
				objLibro3.precio+" Con Pasta Dura "+objLibro3.isPastaDura);
		
		
	}
	
}
