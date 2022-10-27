package lista3;

import java.util.Scanner;

/* Implemente uma pequena aplicação para testar o TAD Deque implementado.
A aplicação deve criar um Deque de números inteiros. A aplicação ter um 
menu e um loop para permitir ao usuário operar com o Deque. */
public class Questao4 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int op, numero;
        int capacidade;

        System.out.println("Informe a capacidade do deque: ");
        capacidade = Integer.parseInt(in.nextLine());
        Deque<Integer> deque = new Deque(capacidade);

        do {
            exibir();
            op = Integer.parseInt(in.nextLine());
            switch (op) {
                case 1:
                    if (deque.isFull()) {
                        System.out.println("Deque está cheio!");
                    } else {
                        System.out.print("Informe o número a ser inserido: ");
                        numero = Integer.parseInt(in.nextLine());
                        deque.push(numero);
                    }
                    break;
                case 2:
                    System.out.print("Número removido: " + deque.pop());
                    break;
                case 3:
                    if (deque.isFull()) {
                        System.out.println("Deque está cheio!");
                    } else {
                        System.out.print("Informe o número a ser inserido: ");
                        numero = Integer.parseInt(in.nextLine());
                        deque.inject(numero);
                    }
                    break;
                case 4:
                    System.out.println("Número removido: " + deque.eject());
                    break;
                case 0:
                    System.out.println("Programa Encerrado!");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (op != 0);
    }

    public static void exibir() {
        System.out.println("1 - Inserir número inteiro no início do deque");
        System.out.println("2 - Remover número inteiro no início do deque");
        System.out.println("3 - Inserir número inteiro no final do deque");
        System.out.println("4 - Remover número inteiro no final do deque");
        System.out.println("0 - Encerrar programa");
        System.out.print("Informe a opção desejada: ");
    }
}