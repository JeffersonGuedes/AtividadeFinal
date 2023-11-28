package escola;

public class Professor {
    private String nome;

    public Professor criarProfessor(String nome) {
        return new Professor(nome);
    }

    private Professor(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}