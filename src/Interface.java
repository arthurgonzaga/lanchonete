
import java.util.Scanner;
public class Interface {
    public void visão(){
        Scanner ler = new Scanner(System.in);
        int n;
       System.out.println("                             BEM-VINDO                                   ");
       System.out.println("-------------------------------------------------------------------------");
       System.out.println("Por Favor Informe Qual e Sua Função Utilizando o Codigo da Laista Abaixo ");
       System.out.println("-------------------------------------------------------------------------");
       System.out.println("ID   Nome");
       System.out.println("-------------------------------------------------------------------------");
       System.out.println("|1|  Garçom");
       System.out.println("|2|  Cozinheiro");
       System.out.println("|3|  Gerente");
       System.out.println("-------------------------------------------------------------------------");
       n = ler.nextInt();
          if (n==1){ //Garçom//
        Garçom x =new Garçom();
        x.servico();
       } else if (n==2) {  //Cozinheiro//
        Cozinheiro y=new Cozinheiro();
        y.prepara();
       }else if (n==3) {  //Gerente//
       Gerente z=new Gerente();
       z.administra();
       }else if (n>3 || n<1) { //Código Inválido// 
         Erro j =new Erro();
         j.ajuste(); 
       }
        }
}
    

