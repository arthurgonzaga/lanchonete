import java.util.Scanner;
public class Cozinheiro {
     public void prepara(){
         Scanner ler = new Scanner(System.in);
        int p;
         System.out.println("\n");
        System.out.println("\n");
        System.out.println("                                Cozinheiro                                   ");
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("Por Favor Informe Qual e Operação Que Deseja Realizar");
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("|1|  Verificar próximo pedido da fila");
        System.out.println("|2|  Marcar um pedido como atendido");
        System.out.println("|3|  Sair");
        System.out.println("-------------------------------------------------------------------------");
        p = ler.nextInt();
        if (p==3){ 
        Interface o =new Interface();
         o.visão();
       } 
    }
}
