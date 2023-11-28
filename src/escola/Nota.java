package escola;
import java.util.ArrayList;
import java.util.List;


public class Nota {
    private static List<Nota> notasArmazenadas = new ArrayList<>();


    private Prova prova;
    private Aluno aluno;
    private double valor;
    

    public Nota atribuirNota(Prova prova, Aluno aluno, double valor) {
        this.prova = prova;
        this.aluno = aluno;
        this.valor = valor;
        System.out.println("Nota atribuída para o aluno " + aluno.getNome() + " na disciplina "
                + prova.getDisciplina().getNome() + ": " + valor);
        return this;
    }

    public void salvarNoArmazenamento() {
        notasArmazenadas.add(this);
    }

    public static List<Nota> obterTodasNotasArmazenadas() {
        return notasArmazenadas;
    }

    public static List<Nota> obterNotasPorAluno(Aluno aluno) {
        List<Nota> notasAluno = new ArrayList<>();
        for (Nota nota : notasArmazenadas) {
            if (nota.getAluno().equals(aluno)) {
                notasAluno.add(nota);
            }
        }
        return notasAluno;
    }
    
    public double calcularMedia(double[] notas) {
        double total = 0;
        for (double nota : notas) {
            total += nota;
        }
        double media = total / notas.length; 

         if(media > 6 ){
            System.out.println("aprovado !!!");
           
         }
         else{
            System.out.println("reprovado");
         }
        return  media  ; 
    }

     
    

    public Prova getProva() {
        return prova;
    }

    public void setProva(Prova prova) {
        this.prova = prova;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
