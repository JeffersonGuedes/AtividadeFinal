package escola;

import java.util.List;

public class Turma {
    private List<Aluno> alunos;
    private Disciplina disciplina;
    private int quantidadeMaximaAlunos;

    public Turma criarTurma(Disciplina disciplina, int quantidadeMaximaAlunos) {
        Turma turma = new Turma();
        turma.setDisciplina(disciplina);
        turma.setQuantidadeMaximaAlunos(quantidadeMaximaAlunos);
        return turma;
    }

    public Turma matricularAluno(Aluno aluno) {
        if (this.alunos.size() >= quantidadeMaximaAlunos) {
            throw new RuntimeException("Turma lotada");
        }
        this.alunos.add(aluno);
        return this;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public int getQuantidadeMaximaAlunos() {
        return quantidadeMaximaAlunos;
    }

    public void setQuantidadeMaximaAlunos(int quantidadeMaximaAlunos) {
        this.quantidadeMaximaAlunos = quantidadeMaximaAlunos;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }

}
