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
public class ContaCorrente extends Conta{
    double limite, valorlimite;

    public ContaCorrente(int num, String nome, double saldo) {
        super(num, nome, saldo);
       
    }
    public void setValorLimite( double valorlimite)
    {
        if(valorlimite<0){
        IllegalArgumentException erro = new IllegalArgumentException();
            throw erro;}
        this.limite = limite = valorlimite;
        this.valorlimite = valorlimite;
      
    }
    
    @Override
    public void Depositar(double valorDepositado){
        if(valorDepositado<0){
        IllegalArgumentException erro = new IllegalArgumentException();
            throw erro;}
            if(limite<valorlimite)
            {
                if(valorDepositado<valorlimite)
                {
                    limite=limite+valorDepositado;
                }
                else
                {
                    if(limite==0)
                    {
                        limite=valorlimite;
                        saldo=valorDepositado-valorlimite;
                    }
                    else
                    {
                        valorDepositado=valorDepositado-limite;
                        limite=valorlimite;
                        saldo=valorDepositado;
                    }
                }
            }
            else
            {
                saldo=saldo+valorDepositado;
            }
            System.out.println("Seu saldo atual é de : "+saldo);
            System.out.println("Seu limite é de : "+limite+" reais");
    }
          
    
    public void Sacar(double valorSacado){
        if(valorSacado<0 || valorSacado>saldo && valorSacado>saldo+limite){
        IllegalArgumentException erro1 = new IllegalArgumentException();
            throw erro1;}
        if(valorSacado<saldo)
        {
            saldo = saldo - valorSacado;
            System.out.println("Seu saldo atual é de : "+saldo);
            System.out.println("Seu limite é de : "+limite+" reais");
        }
        else
        {
            System.out.println("Você nao possui saldo disponível!");
            valorSacado=valorSacado-saldo;
            saldo=0;
            limite= limite-valorSacado;
            System.out.println("Valor retirado do limite");
            System.out.println("Seu saldo atual é de : "+saldo);
            System.out.println("Seu limite é de : "+limite+" reais");
            }
        }
}

