package lanchonete;


import java.util.ArrayList;
import java.util.Scanner;

public class Inicio {
    
    private static ArrayList<Pedido> fila = new ArrayList<>();
    
    public Inicio(ArrayList<Pedido> fila) {
        this.fila = fila;
        Scanner ler = new Scanner(System.in);
        printFunçoes();
        int entrada = ler.nextInt();
        new Escolher().escolherInicio(entrada, this.fila);
    }
    
    public Inicio() {
        Scanner ler = new Scanner(System.in);
        printBemVindoMensagem();
        int entrada = ler.nextInt();
        new Escolher().escolherInicio(entrada, this.fila);
    }

    private void printBemVindoMensagem() {
        System.out.println(
                "                             BEM-VINDO                                   \n"
                + "-------------------------------------------------------------------------\n"
                + "Por Favor Informe Qual e Sua Função Utilizando o Codigo da Lista Abaixo \n"
                + "-------------------------------------------------------------------------\n"
                + "ID   Nome\n"
                + "|1|  Garçom\n"
                + "|2|  Cozinheiro\n"
                + "|3|  Gerente\n"
                + "-------------------------------------------------------------------------"
        );
    }
    
    private void printFunçoes() {
        System.out.println("\n\n\n\n-------------------------------------------------------------------------\n"
                + "Por Favor Informe Qual e Sua Função Utilizando o Codigo da Lista Abaixo \n"
                + "-------------------------------------------------------------------------\n"
                + "ID   Nome\n"
                + "|1|  Garçom\n"
                + "|2|  Cozinheiro\n"
                + "|3|  Gerente\n"
                + "-------------------------------------------------------------------------"
        );
    }
}
