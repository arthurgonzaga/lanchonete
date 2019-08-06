package lanchonete.usuarios;




import lanchonete.Escolher;
import java.util.Scanner;
import lanchonete.Escolher;

public class Gerente {
    public static final String TIPO = "GERENTE";
    private Scanner ler;

    public Gerente(){
        ler = new Scanner(System.in);
        gerenteOperações();
        int entrada = ler.nextInt();
        new Escolher(TIPO, entrada);
    }
    
    private void gerenteOperações(){
        System.out.println("\n"
                + "\n"
                + "\n"
                + "                                Gerente                                   \n"
                + "-------------------------------------------------------------------------\n"
                + "Por Favor Informe Qual e Operação Que Deseja Realizar\n"
                + "-------------------------------------------------------------------------\n"
                + "|1|  Consulte a Quantidade De Um Produto Vendidos\n"
                + "|2|  Verificar quanto foi vendido em uma determinada data\n"
                + "|3|  Sair\n"
                + "-------------------------------------------------------------------------");
    }
}
