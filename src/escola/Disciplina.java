package escola;

public class Disciplina {
    private String nome;
    private Professor professor;

    public Disciplina criarDisciplina(String nome, Professor professor) {
        Disciplina disciplina = new Disciplina();
        disciplina.setNome(nome);
        disciplina.setProfessor(professor);
        return disciplina;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

}
