// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void main(String[] args) {
        Turma turma1 = new Turma(1);
        Turma turma2 = new Turma(2);
        Aluno aluno1 = new Aluno("João", 15, "2512",7.6);
        Aluno aluno2 = new Aluno("Maria", 16, "4323",8.6);
        Aluno aluno3 = new Aluno("Paula", 15, "4123",8.1);
        Aluno aluno4 = new Aluno("Pedro", 15, "4323",6.5);
        Aluno aluno5 = new Aluno("Laura", 16, "4323",5.3);
        Aluno aluno6 = new Aluno("Roberto", 15, "4323",7.4);
        Aluno aluno7 = new Aluno("José", 15, "4323",9.0);
        Aluno aluno8 = new Aluno("Carla", 16, "4323",6.6);

       turma1.novoAluno(aluno1);
       turma1.novoAluno(aluno2);
       turma1.novoAluno(aluno3);
       turma1.novoAluno(aluno4);
       turma1.novoAluno(aluno5);
       turma2.novoAluno(aluno6);
       turma2.novoAluno(aluno7);
       turma2.novoAluno(aluno8);

        System.out.println(turma1);
        System.out.println(turma2);

    }
}