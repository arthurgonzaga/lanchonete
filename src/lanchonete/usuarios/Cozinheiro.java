package lanchonete.usuarios;



import java.util.ArrayList;
import lanchonete.Escolher;
import java.util.Scanner;
import lanchonete.Escolher;
import lanchonete.Pedido;
import lanchonete.Inicio;
import lanchonete.Produto;

public class Cozinheiro{
    public static final String TIPO = "COZINHEIRO";
    
    private Scanner ler;

    private static ArrayList<Pedido> fila = new ArrayList<>();
    
    public Cozinheiro(ArrayList<Pedido> fila){
        this.fila = fila;
        ler = new Scanner(System.in);
        cozinheiroOperações();
        int entrada = ler.nextInt();
        new Escolher(TIPO, entrada, this.fila);
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
    
    public static void verificarProximoDaFila(){
        float total = 0f;
        ArrayList<Produto> produtos = fila.get(0).getProdutos();
        for(int indice = 0; indice < produtos.size(); indice++){
            float preçoNoIndice = produtos.get(indice).getPreço();
            int quantidadeNoIndice = produtos.get(indice).getQuantidade();
            total+= preçoNoIndice*quantidadeNoIndice;
            System.out.println("\n"+produtos.get(indice).getNome() + " R$" 
                    + produtos.get(indice).getPreço() 
                    + " | " + produtos.get(indice).getQuantidade()
                    + " unidades");
        }
        System.out.println("---------------------------------\n"
                + "Total: R$"+total);
        new Inicio(fila);
    }
    
    public static void atendido(int id){
        fila.remove(id);
        new Inicio(fila);
    }
}
