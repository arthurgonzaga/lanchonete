/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lanchonete;

/**
 *
 * @author arthurgonzaga
 */
public class Produto {
    private String nome;
    private int quantidade;
    private float preço;
    
    public Produto(){}
    
    public Produto(String nome, float preço, int quantidade){
        this.nome = nome;
        this.preço = preço;
        this.quantidade = quantidade;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }
    
    public int getQuantidade(){
        return quantidade;
    }
    
    public void setPreço(float preço){
        this.preço = preço;
    }
    
    public float getPreço(){
        return preço;
    }
}
