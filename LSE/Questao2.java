package lista3;

import java.util.Scanner;

/* O banco SóDinheiro está querendo implantar um sistema de controle de senhas
automático. A idéia é a seguinte: quando o cliente chegar ao banco, ele se dirige 
a um terminal de computador e solicita uma senha de atendimento. De posse de sua 
senha, que é um número quecorresponde a sua ordem de chegada, o cliente pode se 
sentar e esperar por sua vez de ser atendido. Os funcionários do banco atendem 
os clientes de acordo com a ordem das senhas emitidas. Toda vez que um 
funcionário chama uma senha para atendimento, a senha é retirada da fila dos 
clientes esperando atendimento. Implemente um programa para fazer o controle 
das senhas. O programa (aplicação) deverá ter as seguintes funcionalidades:
(a) Um procedimento para fornecer uma senha de atendimento a um cliente.
(b) Um procedimento para chamar uma senha para atendimento. 

A aplicação deverá utilizar uma Queue (Fila) com tamanho limitado para 
armazenar as senhas dos clientes a espera de atendimento.
OBS: Por lei, os clientes devem esperar por atendimento sentados. Como, na área 
dos caixas, só existe espaço para 20 cadeiras, foi estabelecido que pode haver, 
no máximo, 20 (vinte) clientes dentro do banco esperando por atendimento. Caso 
o cliente solicite uma senha de atendimento e já tenha 20 (vinte) clientes na 
fila de espera, o programa deverá emitir uma mensagem informando que ele 
deverá retornar em um outro momento. Pode acontecer também que, em um 
determinado momento, não haja clientes esperando atendimento. 
Caso isso ocorra, o programa deve emitir uma mensagem informando 
que não há clientes na fila de espera. */

public class Questao2 {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int op, valor;
        int capacidade = 20;
        int senha = 0;
        Queue<Integer> fila = new Queue(capacidade);

        do {
            exibir();
            op = Integer.parseInt(in.nextLine());
            switch (op) {
                case 1:
                    senha = senha + 1;
                    if (fila.isFull()) {
                        System.out.println("Fila de espera está cheia! Volte mais tarde!");
                    } else if (fila.isEmpty()){
                        System.out.println("Fila de espera está vazia!");
                        System.out.print("Sua senha de espera é: "+ senha);
                        fila.enQueue(senha);
                    } else {
                        System.out.println("Sua senha de espera é: "+ senha);
                        fila.enQueue(senha);
                    }
                    break;
                case 2:
                    System.out.print("Senha chamada para atendimento: " + fila.deQueue());
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
        System.out.println("1 - Retirar uma senha de espera");
        System.out.println("2 - Chamar a próxima senha");
        System.out.println("0 - Encerrar programa");
        System.out.print("Informe a opção desejada: ");
    }
}