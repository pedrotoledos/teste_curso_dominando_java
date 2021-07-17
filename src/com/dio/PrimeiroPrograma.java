package com.dio;

import com.dio.model.gato;


public class PrimeiroPrograma {

	public static void main(String[] args) {

		gato Gato = new gato();
		livros livros = new livros();

		System.out.println(Gato);
		System.out.println(livros);

		/*
		 int a = 2; 
		 int b =3; 
		 System.out.println("hello world!" + (a+b));
		 */
	}

}

class livros {
	private String nome;
	private String npag;

}