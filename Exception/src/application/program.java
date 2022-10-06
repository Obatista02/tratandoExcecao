package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entities.Reserva;
import model.exception.excecao;

public class program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			Scanner sc = new Scanner(System.in);
			System.out.print("Numero do quarto: ");
			int numeroQuarto = sc.nextInt();
			System.out.print("Data do Check-in (dd/MM/yyyy): ");
			Date checkin = sdf.parse(sc.next());
			System.out.print("Data do Check-out: ");
			Date checkout = sdf.parse(sc.next());

			Reserva reserva = new Reserva(numeroQuarto, checkin, checkout);

			System.out.println("Reserva: " + reserva);

			System.out.println();
			System.out.println("Entre com as datas atualizadas:");
			System.out.print("Data Check-in (dd/MM/yyyy): ");
			checkin = sdf.parse(sc.next());
			System.out.print("Data Check-out (dd/MM/yyyy): ");
			checkout = sdf.parse(sc.next());

			sc.close();
		} catch (excecao e) {
			System.out.println("Formato de data inválido");
		} catch (ParseException e) {
			System.out.println("Erro em reserva: " + e.getMessage());
		} catch (RuntimeException e) {
			System.out.println("Erro Inesperado: ");
		}
	}

}
