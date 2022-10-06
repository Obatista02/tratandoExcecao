package application1;

import java.util.Scanner;

import model.entities1.conta;
import model.entities1.exception;

public class program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Digite os dados da conta: ");
		System.out.print("Numero: ");
		int numero = sc.nextInt();
		System.out.print("Titular: ");
		String holder = sc.next();
		System.out.print("Saldo inicial: ");
		double balance = sc.nextDouble();
		System.out.print("Limite de Saque: ");
		double saqueLimit = sc.nextDouble();

		conta cont = new conta(numero, holder, balance, saqueLimit);

		System.out.println();
		System.out.print("Digite a quantidade de saque: ");
		double saque = sc.nextDouble();

		sc.close();
		try {
			cont.saque(saque);
			System.out.printf("Novo saldo: 5.2f%n", cont.getBalance());
		} catch (exception e) {
			System.out.println(e.getMessage());
		}
	}

}
