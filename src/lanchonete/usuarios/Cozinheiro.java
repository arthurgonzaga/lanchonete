package lanchonete.usuarios;



import lanchonete.Escolher;
import java.util.Scanner;
import lanchonete.Escolher;

public class Cozinheiro{
    public static final String TIPO = "COZINHEIRO";
    
    private Scanner ler;

    public Cozinheiro(){
        ler = new Scanner(System.in);
        cozinheiroOperações();
        int entrada = ler.nextInt();
        new Escolher(TIPO, entrada);
    }
    
    private void cozinheiroOperações() {
        System.out.println(
                "\n"
                + "\n"
                + "\n"
                + "                                COZINHEIRO                                   \n"
                + "-------------------------------------------------------------------------\n"
                + "Por Favor Informe Qual e Operação Que Deseja Realizar\n"
                + "-------------------------------------------------------------------------\n"
                + "|1|  Verificar próximo pedido da fila\n"
                + "|2|  Marcar um pedido como atendido\n"
                + "|3|  Sair\n"
                + "-------------------------------------------------------------------------\n"
        );
    }
}
