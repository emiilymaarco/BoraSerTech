package br.com.desenhador;

public class Cachorro extends Animal {

    private String nome;
    private int idade;

    public void desenha(String nome, int idade){
        System.out.println("DESENHO DE UM CACHORRO");
        System.out.println("Idade do cachorro: "+nome + " : "+idade*7);



    }

    public Cachorro(){

    }

    public Cachorro(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
