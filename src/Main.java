import models.*;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        Escola escola = new Escola("Escola Senai");

        Aluno aluno01 = new Aluno("Alex Valentim", "123", 25);
        Aluno aluno02 = new Aluno("Adanilson Valentim", "321", 35);
        Aluno aluno04 = new Aluno("Allany Valentim", "213", 45);
        Aluno aluno05 = new Aluno("Naede Valentim", "312", 55);

        Professor professor01 = new Professor("João", "Java", 55);
        Professor professor02 = new Professor("Francisco", "JavaPro", 45);
        Professor professor03 = new Professor("Marcos", "Python", 35);
        Professor professor04 = new Professor("Felipe", "PythonPro", 25);

        Turma turma01 = new Turma("Java01",2025,professor01);
        Turma turma02 = new Turma("Java02",2024,professor02);
        Turma turma03 = new Turma("Python01",2025,professor03);
        Turma turma04 = new Turma("Python02",2024,professor04);

        escola.adicionarAluno(aluno01);
        escola.adicionarAluno(aluno02);
        System.out.println();
        escola.adicionarProfessor(professor01);
        escola.adicionarProfessor(professor02);

        escola.listarAlunos();
        System.out.println("---------------------------------------------------------------");
        escola.listarProfessores();

        System.out.println("---------------------------------------------------------------------------------------");
        Turma turma = new Turma("Java",2025,professor01);
        Disciplina disciplina = new Disciplina("Ti",80,professor01);

    }
}
