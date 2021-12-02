package model;

public class Conta {

    private double saldo;

    public Conta(double saldo) {
        this.saldo = saldo;
    }

    public Conta() {
    }

    public double getSaldo(){
        return this.saldo;
    }

    public boolean sacar(double valor){
        if(this.saldo > 0){
            if(valor > this.saldo){
                System.out.println("você não tem saldo suficiente para realizar esta operação");
                return false;
            }
            else{
                this.saldo = this.saldo - valor;
                System.out.println("Seu saldo atual é: " + this.saldo);
                return true;
            }
        }
        else{
            System.out.println("você não tem saldo");
            return false;
        }
    }
}
