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

  public void imprimirInformacoes() {
    if (disciplina != null) {
      System.out.println("Informações da Prova:");
      System.out.println("Disciplina: " + disciplina.getNome());
    } else {
      System.out.println("Nenhuma disciplina associada a esta prova.");
    }
  }
}