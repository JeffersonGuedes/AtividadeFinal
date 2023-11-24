class Professor {
    private String nome;
    private String disciplina;

    public Professor(String nome, String disciplina) {
        this.nome = nome;
        this.disciplina = disciplina;
    }

    public void atribuirNota(Aluno aluno, double nota) {
        System.out.println("Nota atribuída para o aluno " + aluno + " na disciplina " + disciplina + ": " + nota);
    }

    public void listarAlunosMatriculados() {
        System.out.println("Lista de alunos matriculados na disciplina " + disciplina + ":");
        // Lógica para listar alunos matriculados
    }
}