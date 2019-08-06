package Controle;

import java.io.File;
import java.util.Scanner;

public class Venda {

    @SuppressWarnings("empty-statement")

    public void Pedido() {
        Scanner ler = new Scanner(System.in);
        int z = 2, n;
        float TXBURGUER = 0, TXSALADA = 0, TXEGG = 0, TXBACON = 0, TXCALABRESA = 0, TXTUDO = 0, TBATATA = 0, TLATA350M = 0, TREFRIGERANTE2L = 0, Q, Total;
        int QXBURGUER = 0, QXSALADA, QXEGG, QXBACON, QXCALABRESA, QXTUDO, QBATATA, QLATA350M, QTREFRIGERANTE2L;

        while (z == 2) {
            System.out.println("-------------------------------------------------------------------------");
            System.out.println("Adicione o ID do Produto");
            System.out.println("-------------------------------------------------------------------------");
            n = ler.nextInt();
            
            if (n == 1) {
                System.out.println("X-BURGUER PREÇO:R$6,00");
                System.out.println("Quantidade");
                Q = ler.nextInt();
                TXBURGUER = Q * 6;
                QXBURGUER = (int) Q;
            } else if (n == 2) {
                System.out.println("X-SALADA:R$7,00");
                System.out.println("Quantidade");
                Q = ler.nextInt();
                TXSALADA = Q * 7;
                QXSALADA = (int) Q;
            } else if (n == 3) {
                System.out.println("X-EGG:R$9,00");
                System.out.println("Quantidade");
                Q = ler.nextInt();
                TXEGG = Q * 9;
                QXEGG = (int) Q;
            } else if (n == 4) {
                System.out.println("X-BACON:R$10,00");
                System.out.println("Quantidade");
                Q = ler.nextInt();
                TXBACON = Q * 10;
                QXBACON = (int) Q;
            } else if (n == 5) {
                System.out.println("X-CALABRESA :R$7,00");
                System.out.println("Quantidade");
                Q = ler.nextInt();
                TXCALABRESA = Q * 7;
                QXCALABRESA = (int) Q;
            } else if (n == 6) {
                System.out.println("X-TUDO :R$12,00");
                System.out.println("Quantidade");
                Q = ler.nextInt();
                TXTUDO = Q * 12;
                QXTUDO = (int) Q;
            } else if (n == 7) {
                System.out.println("BATATA FRITA :R$5,00");
                System.out.println("Quantidade");
                Q = ler.nextInt();
                TBATATA = Q * 5;
                QBATATA = (int) Q;
            } else if (n == 8) {
                System.out.println("REFRIGERANTE LATA 350ML :R$3,00");
                System.out.println("Quantidade");
                Q = ler.nextInt();
                TLATA350M = Q * 3;
                QLATA350M = (int) Q;
            } else if (n == 9) {
                System.out.println("REFRIGERANTE 2 LITROS :R$7,00");
                System.out.println("Quantidade");
                Q = ler.nextInt();
                TREFRIGERANTE2L = Q * 7;
                QTREFRIGERANTE2L = (int) Q;
            }
            System.out.println("O Total Fianal e:");
            Total = TXBURGUER + TXSALADA + TXEGG + TXBACON + TXCALABRESA + TXTUDO + TBATATA + TLATA350M + TREFRIGERANTE2L;
            System.out.println(Total + "R$");
            Scanner g = new Scanner(System.in);
            int o;
            System.out.println("Continuar (0)");
            System.out.println("Concluir Venda(1)");
            System.out.println("Cancelar Venda(2)");
            //Em construção//

        }

    }

}
