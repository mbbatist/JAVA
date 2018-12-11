/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listarevisao3;

/**
 *
 * @author Mariana Brito
 */
public class Conta {
    int num;
    String nome; 
    double saldo;

    public Conta() {
        this.saldo = saldo=0;
    }

    public Conta(int num, String nome, double saldo) {
        this.num = num;
        this.nome = nome;
        this.saldo = saldo =0;
    }
    
    public void Depositar(double valorDepositado){
        saldo= saldo+ valorDepositado;
        System.out.println("Seu saldo atual é de : "+saldo);
    }
    
    public void Sacar(double valorSacado){
        saldo = saldo - valorSacado;
        System.out.println("Seu saldo atual é de : "+saldo);
    }
    
    
}
