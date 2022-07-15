package com.cursoJava.demo;

import java.lang.reflect.Array;
import java.util.ArrayList;

import javax.print.DocFlavor.STRING;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CursoDeJavaApplication {

	public static void main(String[] args) {
		SpringApplication.run(CursoDeJavaApplication.class, args);

		String nome = "Vitor ";
		String sobrenome = "Menezes";

		//Criando uma string com instância da String do java.lang
		String string = new String("quantas letras tem essa frase aqui, contando com os espaços hehe");

		final String nomeCompleto = nome + sobrenome; 

		System.out.println("test java Springboot web: " + nomeCompleto);
		//Conta a quantidade de caracteres usando .lenght()
		System.out.println("Quantidade: " + string.length());




		//exemplo de laço de repetição com While
		int i = 1;

		while(i <= 10){
			System.out.println("Número com while : " + i);
			i ++;
		}

		//exemplo de laço de repetição com for
		for(i = 1; i <= 10; i++){
			System.out.println("Número com for: " + i);
		}

		System.out.println("A B C D E F G".toCharArray());
		System.out.println("Aula".concat(" de Java"));
	}


}
