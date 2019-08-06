package lanchonete.usuarios;




import lanchonete.Escolher;
import Controle.Venda;
import java.io.BufferedReader;
import java.util.Scanner;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import lanchonete.Escolher;

public class Garçom {

    public static final String TIPO = "GARÇOM";
    Escolher escolher;
    Scanner ler;

    public Garçom(){
        ler = new Scanner(System.in);
        garçomOperações();
        int numero = ler.nextInt();
        escolher = new Escolher(TIPO, numero);
    }
    
    public void garçomOperações(){
        System.out.println(
                "\n"
                + "\n"
                + "\n"
                + "                                GARÇOM                                   \n"
                + "-------------------------------------------------------------------------\n"
                + "Por Favor Informe Qual e Operação Que Deseja Realizar\n"
                + "-------------------------------------------------------------------------\n"
                + "|1|  Visualizar o cardápio\n"
                + "|2|  Realizar um novo pedido\n"
                + "|3|  Sair\n"
                + "-------------------------------------------------------------------------\n"
        );
    }
    
    public static void lerCardapio() {
        try {
            FileReader fr = new FileReader(new File("Cardapio.txt"));
            BufferedReader br = new BufferedReader(fr);
            String linha = br.readLine();
            while (linha != null) {
                System.out.println(linha);
                linha = br.readLine();
            }
        } catch (IOException ex) {
        }
    }
    
    public static void perguntarPedido(){
        System.out.println("|1|  Realizar o pedido\n"
                        + "|2|  Sair\n"
                        + "-------------------------------------------------------------------------");
    }
    
}
