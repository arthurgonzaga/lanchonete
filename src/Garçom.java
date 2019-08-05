
import java.io.BufferedReader;
import java.util.Scanner;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
public class Garçom {
    public void servico(){
        Scanner ler = new Scanner(System.in);
        int P;
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("                                GARÇOM                                   ");
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("Por Favor Informe Qual e Operação Que Deseja Realizar");
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("|1|  Visualizar o cardápio");
        System.out.println("|2|  Realizar um novo pedido");
        System.out.println("|3|  Sair");
        System.out.println("-------------------------------------------------------------------------");
        P = ler.nextInt();
        if (P==1){ //Cardápio//
        File arquivo=new File("Cardapio.txt");
        try{
        FileReader o = new FileReader(arquivo); 
         BufferedReader ob =new BufferedReader(o);
         String linha = ob.readLine(); 
            while(linha !=null){
           System.out.println(linha);
           linha = ob.readLine(); 
        }
        }catch (IOException ex) {
        }
       } else if (P==2) {  //Pedido//
     
       }
        else if (P==3) {  //Sair//
     Interface o =new Interface();
         o.visão();
       }
    }
}
