import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Scanner sc = new Scanner(System.in);


        String dataDe = "04/06/2016";
        String dataAte = "04/10/2023";
        /*
        System.out.println("Escreva uma data incial para buscar um artigo no formato (dd/MM/yyyy): ");
        String dataDe = sc.next();
        System.out.println("Escreva uma data final para buscar um artigo no formato (dd/MM/yyyy): ");
        String dataAte = sc.next();
        */

        System.out.println(Jornal.buscarPorData(LocalDate.parse(dataDe,formatador),LocalDate.parse(dataAte,formatador)));
    }
}