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
			System.out.println("N�mero menor que zero n�o � permitido.");
		} else {
			
		Integer soma;
		Integer multiplicar;
		float dividir;
		Integer subtrair;
		String tipo;
		System.out.println("Insira a opera��o matem�tica");
		tipo = sc.next();
		switch (tipo) {
		case "+":
		soma = num1 + num2;
		System.out.println("A soma �: " + soma);
		break;
		}
		switch(tipo) {
		case "-":
		subtrair = num1 - num2;
		System.out.println("A subtra��o �: " + subtrair);
		break;
		}
		switch(tipo) {
		case "*":
		multiplicar = num1 * num2;
		System.out.println("A multiplica��o �: " + multiplicar);
		break;
		}
		switch(tipo) {
		case "/":
		dividir = num1 / num2;
		System.out.println("A divis�o �: " + dividir);
		}
	}
	}
}
