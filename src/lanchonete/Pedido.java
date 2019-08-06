/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lanchonete;

import java.util.ArrayList;

/**
 *
 * @author arthurgonzaga
 */
public class Pedido {
    private int id;
    private ArrayList<Produto> produtos = new ArrayList<>();
    
    public Pedido(int id){
        this.id = id;
    }
    public Pedido(int id, ArrayList<Produto> produtos){
        this.id = id;
        this.produtos = produtos;
    }
    
    public ArrayList<Produto> getProdutos(){
        return produtos;
    }
    
    public void setProdutos(ArrayList<Produto> produtos){
        this.produtos = produtos;
    }
    
    public int getId(){
        return id;
    }
    
    public void setProdutos(int id){
        this.id = id;
    }
}
