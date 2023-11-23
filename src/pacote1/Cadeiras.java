class Cadeiras {
    private String nome;
    private Professor professorResponsavel;

    public Cadeiras(String nome, Professor professor) {
    this.nome = nome;
    this.professorResponsavel = professor;
    }

    public void adicionarAluno(Aluno aluno) {
    System.out.println(aluno + " adicionado na disciplina " + nome);
    }

    public void listarAlunos() {
     System.out.println("Lista de alunos matriculados na disciplina " + nome + ":");
       
    }
}