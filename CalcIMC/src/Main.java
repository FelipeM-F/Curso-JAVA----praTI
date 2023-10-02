/*DESAFIO FINAL DO MÓDULO
Crie um programa em Java que solicite ao usuário que informe o peso em quilogramas e a altura em metros.
Em seguida,utilize o cálculo do IMC para determinar o valor do IMC e exibir a classificação correspondente.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Vamos calcular o seu IMC");
        System.out.println("Informe seu peso em Kg: ");
        float peso = teclado.nextFloat();
        System.out.println("Informe sua altura em metros: ");
        float altura = teclado.nextFloat();
        float imc = peso/(altura*altura);
        System.out.println("IMC calculado: " + imc);
        if (imc < 18.5) {
            System.out.println("Abaixo do peso ideal");
        } else if (imc <= 24.9) {
            System.out.println("Peso normal");
        } else if (imc <= 29.9) {
            System.out.println("Sobrepeso");
        } else if (imc <= 34.9) {
            System.out.println("Obesidade grau 1");
        } else if (imc <= 39.9) {
            System.out.println("Obesidade grau 2");
        } else {
            System.out.println("Obesidade grau 3 (obesidade mórbida)");
        }
    }
}