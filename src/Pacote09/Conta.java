package Pacote09;

/*
 *  Getters e Setters;
 * 
 * Getter - é um metodo publico, que serve para consultar dados;
 * A nomenclatura desses metodos e get_nome_do_atributo();
 */
public class Conta {
    private int numero;
    private float saldo;
    private float limite;
    private Cliente cliente;

    public Conta(int numero, float saldo, float limite, Cliente cliente) {
        this.numero = numero;
        this.saldo = saldo;
        this.limite = limite;
        this.cliente = cliente;
    }

    //100;
    //50;
    //this.saldo = this.saldo - valor;
    //50;

    public void sacar(float valor) {
        if(valor <= this.saldo) {
           this.saldo = this.saldo - valor;
           System.out.println("Saque realizado com sucesso!");
        }else if(valor <= (this.saldo + this.limite)){
            //Calculando o valor excedente do saque
            //100 - 200 -> -100;
            float val_ret = this.saldo - valor;
            if(val_ret < 0) {
                this.saldo = 0;
            }
            //val_ret = this.limite - val_ret;
            val_ret = this.limite + val_ret;
            this.limite = val_ret;
            System.out.println("Saque realizado com sucesso!");
        }else {
            System.out.println("Saldo insuficiente!");
        }
        
    }

    /**
     * Metodo para realizar deposito
     * @param valor a ser depositado;
     */
    
    //100;
    //30;
    //this.saldo = this.saldo + valor;
    // 130;
    public void depoistar(float valor) {
        this.saldo = this.saldo + valor;
    }

    /**
     * Metodo getter do atributo saldo
     * @return a soma do saldo + limite;
     */
    //Metodo Getter do atributo saldo;
    public float getSaldo() {
        return this.saldo + this.limite;
    }



}
