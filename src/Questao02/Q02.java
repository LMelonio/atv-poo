package Questao02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Q02 {

    private static Scanner sc = new Scanner(System.in);
    private static int numPessoas;


    private static void recebeNPessoas() throws InputMismatchException, NullPointerException {

        for (int x = 0; x < 1; x++) {
            try {
                System.out.println("Insira A QUANTIDADE DE PESSOAS A SEREM REGISTRADAS: ");
                numPessoas = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Este valor só pode ser inteiro!");
                x -= 1;
            }
            sc.nextLine();
        }
    }

    private static void recebeNome(int i, Pessoa[] pessoas) throws InputMismatchException {
        System.out.println("INSIRA O NOME " + (i + 1));
        pessoas[i].setNome(sc.nextLine());
    }

    private static void recebeIdade(int i, Pessoa[] pessoas) throws InputMismatchException {
        System.out.println("INSIRA A IDADE " + (i + 1));
        pessoas[i].setIdade(sc.nextInt());
    }

    private static void recebeCpf(int i, Pessoa[] pessoas) throws InputMismatchException {
        System.out.println("INSIRA O CPF " + (i + 1));
        pessoas[i].setCpf(sc.nextInt());
    }

    private static void lerPessoas(int i, Pessoa[] pessoas) {
        recebeNome(i, pessoas);
        recebeIdade(i, pessoas);
        recebeCpf(i, pessoas);
    }

    private static void mostrarPessoas(int i, Pessoa[] pessoas) {
        System.out.println("NOME DA PESSOA " + (i + 1) + " : " + pessoas[i].getNome());
        System.out.println("IDADE DA PESSOA " + (i + 1) + " : " + pessoas[i].getIdade());
        System.out.println("CPF DA PESSOA " + (i + 1) + " : " + pessoas[i].getCpf());

    }

    public static void main(String args[]) {
        recebeNPessoas();
        Pessoa[] pessoas = new Pessoa[numPessoas];

        for (int i = 0; i < numPessoas; i++) {
            pessoas[i] = new Pessoa();
            try {
                lerPessoas(i, pessoas);

            } catch (InputMismatchException e) {
                System.out.println("Os campos em questão têm tipos específicos, preencha de acordo!");
                i -= 1;
            }
            sc.nextLine();
        }
        for (int i = 0; i < numPessoas; i++) {
            mostrarPessoas(i, pessoas);
        }
    }

}
