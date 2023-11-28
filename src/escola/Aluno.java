package escola;

import java.time.LocalDate;

public class Aluno {
    private String nome;
    private LocalDate nascimento;

    public int getIdade() {
        LocalDate hoje = LocalDate.now();
        return hoje.getYear() - nascimento.getYear();
    }

    public boolean alunoEstaApto(Turma turma) {
        int idade = this.getIdade();
        return idade <= 6 || idade >= 18;
    }

    public Aluno criarAluno(String nome, LocalDate nascimento) {
        Aluno aluno = new Aluno();
        aluno.setNome(nome);
        aluno.setNascimento(nascimento);
        int idade = getIdade();
        if (idade < 18) {
            throw new RuntimeException("Aluno menor de idade");
        }
        return aluno;
    }

    public boolean alunoEstaMatriculado(Turma turma) {
        return turma.getAlunos().contains(this);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getNascimento() {
        return nascimento;
    }

    public void setNascimento(LocalDate nascimento) {
        this.nascimento = nascimento;
    }
}
