package escola;

import java.util.List;

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

  public void calcularMediaTurma(List<Nota> notas) {
  if (notas.isEmpty()) {
    System.out.println("Não há notas disponíveis para calcular a média da turma.");
    return;
  }

  double soma = 0;
  for (Nota nota : notas) {
    soma += nota.getValor();
  }

  double media = soma / notas.size();
  System.out.println("Média da turma na disciplina " + disciplina.getNome() + ": " + media);
}

}