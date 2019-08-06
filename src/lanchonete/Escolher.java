package lanchonete;


import lanchonete.usuarios.Garçom;
import lanchonete.usuarios.Gerente;
import lanchonete.usuarios.Cozinheiro;
import Controle.Venda;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
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
    private Venda venda;

    public Escolher() {
        ler = new Scanner(System.in);
        venda = new Venda();
    }

    public Escolher(String tipo, int entrada) {
        ler = new Scanner(System.in);
        venda = new Venda();
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
                new Erro();
        }
    }

    private void escolherGarçom(int entrada) {
        switch (entrada) {
            case 1:
                Garçom.lerCardapio();
                Garçom.perguntarPedido();
                int entrada2 = ler.nextInt();
                if (entrada2 == 1) {
                    venda.Pedido();
                } else {
                    new Inicio();
                }
                break;

            case 2:
                venda.Pedido();
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

                break;
            case 2:

                break;
            case 3:
                new Inicio();
                break;
            default:
                escolherGerente(entrada);
        }
    }

    private void escolherGerente(int entrada) {
        switch (entrada) {
            case 1:

                break;
            case 2:

                break;
            case 3:
                new Inicio();
                break;
            default:
                escolherGerente(entrada);
        }
    }

    public static void escolherInicio(int entrada) {
        switch (entrada) {
            case 1:
                new Garçom();
                break;
            case 2:
                new Cozinheiro();
                break;
            case 3:
                new Gerente();
                break;
            default:
                new Erro();

        }
    }

}
