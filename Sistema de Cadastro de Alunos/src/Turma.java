import java.text.DecimalFormat;

public class Turma
{
    private int identTurma;
    private Aluno aluno01;
    private Aluno aluno02;
    private Aluno aluno03;
    private Aluno aluno04;
    private Aluno aluno05;

    public Turma(int identTurma) {
        this.identTurma = identTurma;
    }

    public void novoAluno(Aluno aluno) {
        if (this.aluno01 == null)
        {
            this.aluno01 = aluno;
        } else if (this.aluno02 == null)
        {
            this.aluno02 = aluno;
        } else if (this.aluno03 == null)
        {
            this.aluno03 = aluno;
        } else if (this.aluno04 == null)
        {
            this.aluno04 = aluno;
        } else if (this.aluno05 == null)
        {
            this.aluno05 = aluno;
        } else System.out.println("Classe cheia");
    }

    public int getIdentTurma() {
        return identTurma;
    }

    public void setIdentTurma(int identTurma) {
        this.identTurma = identTurma;
    }

    public Aluno getAluno01() {
        return aluno01;
    }

    public void setAluno01(Aluno aluno01) {
        this.aluno01 = aluno01;
    }

    public Aluno getAluno02() {
        return aluno02;
    }

    public void setAluno02(Aluno aluno02) {
        this.aluno02 = aluno02;
    }

    public Aluno getAluno03() {
        return aluno03;
    }

    public void setAluno03(Aluno aluno03) {
        this.aluno03 = aluno03;
    }

    public Aluno getAluno04() {
        return aluno04;
    }

    public void setAluno04(Aluno aluno04) {
        this.aluno04 = aluno04;
    }

    public Aluno getAluno05() {
        return aluno05;
    }

    public void setAluno05(Aluno aluno05) {
        this.aluno05 = aluno05;
    }

    public int quantAluno()
    {
        int contAluno = 0;
        if (this.aluno01 != null)
            contAluno++;
        if (this.aluno02 != null)
            contAluno++;
        if (this.aluno03 != null)
            contAluno++;
        if (this.aluno04 != null)
            contAluno++;
        if (this.aluno05 != null)
            contAluno++;

        return contAluno;
    }

    public double medTurma()
    {
        double media = 0;
        if (this.aluno01 != null)
            media += this.aluno01.getNotaMedia();
        if (this.aluno02 != null)
            media += this.aluno02.getNotaMedia();
        if (this.aluno03 != null)
            media += this.aluno03.getNotaMedia();
        if (this.aluno04 != null)
            media += this.aluno04.getNotaMedia();
        if (this.aluno05 != null)
            media += this.aluno05.getNotaMedia();

        return media/quantAluno();
    }

    @Override
    public String toString() {
        String turma = "Turma = " + identTurma;
        if (this.aluno01 != null)
            turma += "\n" + aluno01;
        if (this.aluno02 != null)
            turma += "\n" + aluno02;
        if (this.aluno03 != null)
            turma += "\n" + aluno03;
        if (this.aluno04 != null)
            turma += "\n" + aluno04;
        if (this.aluno05 != null)
            turma += "\n" + aluno05;

        turma += "\nNúmero de Alunos da Turma "+ identTurma + ": " + quantAluno();

        int numeroDeCasasDecimais = 2;

        DecimalFormat df = new DecimalFormat("#.##");
        String resultadoFormatado = df.format(medTurma());
        resultadoFormatado = resultadoFormatado.replace(",", ".");
        double resultadoDouble = Double.parseDouble(resultadoFormatado);
        turma += "\nMédia da Turma "+ identTurma + " : " + resultadoDouble;
        return turma+"\n";
        /*return  " Turma=" + identTurma +
                "\n aluno01=" + aluno01 +
                "\n aluno02=" + aluno02 +
                "\n aluno03=" + aluno03 +
                "\n aluno04=" + aluno04 +
                "\n aluno05=" + aluno05;*/
    }
}
