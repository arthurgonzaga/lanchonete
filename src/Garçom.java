
import java.util.Scanner;
public class Garçom {
    public void servico(){
        Scanner ler = new Scanner(System.in);
        int P;
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("                                GARÇOM                                   ");
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("Por Favor Informe Qual e Operação Que Deseja Realizar?");
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("|1|  Visualizar o cardápio");
        System.out.println("|2|  Realizar um novo pedido");
        System.out.println("|3|  Sair");
        System.out.println("-------------------------------------------------------------------------");
        P = ler.nextInt();
        if (P==3){ 
        Interface o =new Interface();
         o.visão();
       } 
    }
}
