package escola;

public class Prova {
  private Disciplina disciplina;

  public Disciplina getDisciplina() {
    return disciplina;
  }

  public void setDisciplina(Disciplina disciplina) {
    this.disciplina = disciplina;
  }

  public Prova criarProva(Disciplina disciplina) {
    Prova prova = new Prova();
    prova.setDisciplina(disciplina);
    return prova;
  }

  public Nota atribuirNota(Prova prova, Aluno aluno, double valor) {
    this.prova = prova;
    this.aluno = aluno;
    this.valor = valor;
    System.out.println("Nota atribuída para o aluno " + aluno.getNome() + " na disciplina "
        + prova.getDisciplina().getNome() + ": " + valor);
    return this;
  }
}
