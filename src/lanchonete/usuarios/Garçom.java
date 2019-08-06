package lanchonete.usuarios;




import lanchonete.Escolher;
import java.io.BufferedReader;
import java.util.Scanner;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import lanchonete.Escolher;
import lanchonete.Inicio;
import lanchonete.Pedido;
import lanchonete.Produto;

public class Garçom {

    public static final String TIPO = "GARÇOM";
    Escolher escolher;
    Scanner ler;
    
    float total = 0f;
    private ArrayList<Pedido> fila;
    private ArrayList<Produto> carrinho = new ArrayList<>();

    public Garçom(ArrayList<Pedido> fila){
        this.fila = fila;
        ler = new Scanner(System.in);
        garçomOperações();
        int entrada = ler.nextInt();
        escolher = new Escolher(TIPO, entrada, this.fila);
    }
    
    public Garçom(boolean empty, ArrayList<Pedido> fila){
        this.fila = fila;
        ler = new Scanner(System.in);
    }
    
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
    
    public void fazerPedido() {
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("Adicione o ID do Produto");
        System.out.println("-------------------------------------------------------------------------");
        int id = ler.nextInt();
        int quantidade;

        switch (id) {
            case 1:
                System.out.println("X-BURGUER \nPREÇO: R$6,00");
                System.out.print("Quantidade: ");
                quantidade = ler.nextInt();
                carrinho.add(new Produto("X-BURGUER", 6.0f, quantidade));
                break;
            case 2:
                System.out.println("X-SALADA \nPREÇO: R$7,00");
                System.out.print("Quantidade: ");
                quantidade = ler.nextInt();
                carrinho.add(new Produto("X-SALADA", 7.0f, quantidade));
                break;
            case 3:
                System.out.println("X-EGG \nPREÇO: R$9,00");
                System.out.print("Quantidade: ");
                quantidade = ler.nextInt();
                carrinho.add(new Produto("X-EGG", 9.0f, quantidade));
                break;
            case 4:
                System.out.println("X-BACON \nPREÇO: R$10,00");
                System.out.print("Quantidade: ");
                quantidade = ler.nextInt();
                carrinho.add(new Produto("X-BACON", 10.0f, quantidade));
                break;
            case 5:
                System.out.println("X-CALABRESA \nPREÇO: R$7,00");
                System.out.print("Quantidade: ");
                quantidade = ler.nextInt();
                carrinho.add(new Produto("X-CALABRESA", 7.0f, quantidade));
                break;
            case 6:
                System.out.println("X-TUDO \nPREÇO: R$12,00");
                System.out.print("Quantidade: ");
                quantidade = ler.nextInt();
                carrinho.add(new Produto("X-TUDO", 12.0f, quantidade));
                break;
            case 7:
                System.out.println("BATATA FRITA \nPREÇO: R$5,00");
                System.out.print("Quantidade: ");
                quantidade = ler.nextInt();
                carrinho.add(new Produto("BATATA FRITA", 5.0f, quantidade));
                break;
            case 8:
                System.out.println("REFRIGERANTE LATA 350ML \nPREÇO: R$3,00");
                System.out.print("Quantidade: ");
                quantidade = ler.nextInt();
                carrinho.add(new Produto("REFRIGERANTE LATA 350ML", 3f, quantidade));
                break;
            case 9:
                System.out.println("REFRIGERANTE 2 LITROS \nPREÇO: R$7,00");
                System.out.print("Quantidade: ");
                quantidade = ler.nextInt();
                carrinho.add(new Produto("REFRIGERANTE 2 LITROS", 7f, quantidade));
                break;
        }
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("Continuar (0)");
        System.out.println("Concluir Venda(1)");
        System.out.println("Cancelar Venda(2)");
        int entrada = ler.nextInt();
        switch(entrada){
            case 0:
                fazerPedido();
                break;
            case 1:
                finalizar();
                break;
            case 2:
                new Inicio();
                break;
        }

    }
    
    private void finalizar(){
        
        for(int indice = 0; indice < carrinho.size(); indice++){
            float preçoNoIndice = carrinho.get(indice).getPreço();
            int quantidadeNoIndice = carrinho.get(indice).getQuantidade();
            total+= preçoNoIndice*quantidadeNoIndice;
        }
        System.out.println("O Total Final é: R$"+ total);
        Pedido novoPedido = new Pedido(fila.size(), carrinho);
        fila.add(novoPedido);
        new Inicio(fila);
    }
    
}
