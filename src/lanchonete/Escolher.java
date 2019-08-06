package lanchonete;


import lanchonete.usuarios.Garçom;
import lanchonete.usuarios.Gerente;
import lanchonete.usuarios.Cozinheiro;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author arthurgonzaga
 */
public class Escolher {

    private Scanner ler;
    public static ArrayList<Pedido> fila = new ArrayList<>();
    
    /**
    *
    * Constructors
    * 
    */
    
    public Escolher() {
        ler = new Scanner(System.in);
    }
    
    public Escolher(ArrayList<Pedido> fila) {
        ler = new Scanner(System.in);
        this.fila = fila;
        Garçom garçom = new Garçom(true, fila);
    }
    
    public Escolher(String tipo, int entrada) {
        ler = new Scanner(System.in);
        switch (tipo) {
            case Garçom.TIPO:
                escolherGarçom(entrada);
                break;

            case Cozinheiro.TIPO:
                escolherCozinheiro(entrada);
                break;

            case Gerente.TIPO:
                escolherGerente(entrada);
                break;
            default:
                new Inicio(fila);
        }
    }

    public Escolher(String tipo, int entrada, ArrayList<Pedido> fila) {
        ler = new Scanner(System.in);
        this.fila = fila;
        switch (tipo) {
            case Garçom.TIPO:
                escolherGarçom(entrada);
                break;

            case Cozinheiro.TIPO:
                escolherCozinheiro(entrada);
                break;

            case Gerente.TIPO:
                escolherGerente(entrada);
                break;
            default:
                new Inicio(fila);
        }
    }
    
    
    /**
    *
    * Methods
    * 
    */
    private void escolherGarçom(int entrada) {
        Garçom garçom = new Garçom(true, fila);
        switch (entrada) {
            case 1:
                Garçom.lerCardapio();
                Garçom.perguntarPedido();
                int entrada2 = ler.nextInt();
                if (entrada2 == 1) {
                    garçom.fazerPedido();
                } else {
                    new Inicio();
                }
                break;

            case 2:
                garçom.fazerPedido();
                break;

            case 3:
                new Inicio();
                break;

            default:
                escolherGarçom(entrada);
        }
    }

    private void escolherCozinheiro(int entrada) {
        switch (entrada) {
            case 1:
                Cozinheiro.verificarProximoDaFila();
                break;
            case 2:
                System.out.print("id: ");
                int id = ler.nextInt();
                Cozinheiro.atendido(id);
                break;
            case 3:
                new Inicio(fila);
                break;
            default:
                escolherCozinheiro(entrada);
        }
    }

    private void escolherGerente(int entrada) {
        switch (entrada) {
            case 1:

                break;
            case 2:

                break;
            case 3:
                new Inicio(fila);
                break;
            default:
                escolherGerente(entrada);
        }
    }

    public static void escolherInicio(int entrada, ArrayList<Pedido> fila) {
        switch (entrada) {
            case 1:
                new Garçom();
                break;
            case 2:
                new Cozinheiro(fila);
                break;
            case 3:
                new Gerente();
                break;
            default:
                new Inicio(fila);

        }
    }
}
