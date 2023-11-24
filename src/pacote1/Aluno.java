package pacote1;

public class Aluno {
    private String nome;
    private int idade;

    public Aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void matricular() {
        System.out.println(nome + "Matriculado com sucesso");
    }

    public void consultarNotas(){
        System.out.println(nome + "suas notas não foram lançadas até o momento!" );
    }


}
