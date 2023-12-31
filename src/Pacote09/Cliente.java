package Pacote09;

//Protected

/*
 * O modificador de acesso Protected faz com que o elemento seja 
 * visivel somente dentro do mesmo pacote onde o elemento foi declarado;
 */
public class Cliente {
    private String nome;
    private String endereco;

    public Cliente(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    protected void dizer_oi(){
        System.out.println(this.nome + " Está dizendo oi...");
    }

    public String getNome() {
        return this.nome;
    }

    public String getEndereco() {
        return this.endereco;
    }
}
