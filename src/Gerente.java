import java.util.Scanner;
public class Gerente {
  public void administra(){
      Scanner ler = new Scanner(System.in);
        int p;
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("                                Gerente                                   ");
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("Por Favor Informe Qual e Operação Que Deseja Realizar");
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("|1|  Consulte a Quantidade De Um Produto Vendidos");
        System.out.println("|2|  Verificar quanto foi vendido em uma determinada data");
        System.out.println("|3|  Sair");
        System.out.println("-------------------------------------------------------------------------");
        p = ler.nextInt();
        if (p==3){ 
        Interface o =new Interface();
         o.visão();
    }  
  }
}
