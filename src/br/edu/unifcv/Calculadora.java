package br.edu.unifcv;

import java.util.Scanner;

public class Calculadora {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite dois valores: ");
		Integer num1;
		Integer num2;
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		if (num1 < 0 || num2 < 0) {
			System.out.println("Número menor que zero não é permitido.");
		} else {
			
		Integer soma;
		Integer multiplicar;
		float dividir;
		Integer subtrair;
		String tipo;
		System.out.println("Insira a operação matemática");
		tipo = sc.next();
		switch (tipo) {
		case "+":
		soma = num1 + num2;
		System.out.println("A soma é: " + soma);
		break;
		}
		switch(tipo) {
		case "-":
		subtrair = num1 - num2;
		System.out.println("A subtração é: " + subtrair);
		break;
		}
		switch(tipo) {
		case "*":
		multiplicar = num1 * num2;
		System.out.println("A multiplicação é: " + multiplicar);
		break;
		}
		switch(tipo) {
		case "/":
		dividir = num1 / num2;
		System.out.println("A divisão é: " + dividir);
		}
	}
	}
}
