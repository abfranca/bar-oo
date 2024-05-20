import java.util.Locale;
import java.util.Scanner;

import entities.Bill;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        Bill conta = new Bill();

        System.out.print("Sexo: ");
        conta.setGender(sc.nextLine().charAt(0));

        System.out.print("Quantidade de cervejas: ");
        conta.setBeer(sc.nextInt());

        System.out.print("Quantidade de refrigerantes: ");
        conta.setSoftDrink(sc.nextInt());

        System.out.print("Quantidade de espetinhos: ");
        conta.setBarbecue(sc.nextInt());

        System.out.println("\nRELATÓRIO:");
        System.out.printf("Consumo = R$ %.2f\n", conta.feeding());

        if (conta.cover() == 0.00) {
            System.out.print("Isento de Couvert\n");
        } else {
            System.out.printf("Couvert = R$ %.2f\n", conta.cover());
        }

        System.out.printf("Ingresso = R$ %.2f\n", conta.ticket());
        System.out.printf("\nValor a pagar = R$ %.2f", conta.total());

        sc.close();
    }
}
