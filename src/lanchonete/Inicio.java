package lanchonete;


import java.util.Scanner;

public class Inicio {
    
    public Inicio() {
        Scanner ler = new Scanner(System.in);
        printBemVindoMensagem();
        int entrada = ler.nextInt();
        new Escolher().escolherInicio(entrada);
    }

    private void printBemVindoMensagem() {
        System.out.println(
                "                             BEM-VINDO                                   \n"
                + "-------------------------------------------------------------------------\n"
                + "Por Favor Informe Qual e Sua Função Utilizando o Codigo da Laista Abaixo \n"
                + "-------------------------------------------------------------------------\n"
                + "ID   Nome\n"
                + "|1|  Garçom\n"
                + "|2|  Cozinheiro\n"
                + "|3|  Gerente\n"
                + "-------------------------------------------------------------------------"
        );
    }
}
