package LSE;

import java.util.Scanner;

/*Implemente o tipo abstrato de dados Queue genérica com tamanho limitado. 
Utilize na implementação deste TAD Queue uma lista simplesmente 
encadeada com descritor. As operações que definem o tipo abstrato de 
dados Queue a serem implementadas são as operações padrão descritas nos 
slides de tipos abstratos de dados postados no classroom. 
OBS: O tamanho MÁXIMO da Queue deve ser informado pelo usuário 
e passado para o construtor, como parâmetro, no instante da criação da Queue. */

public class Lista3Questao1 {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int op, valor;
        int capacidade;

        System.out.println("Informe a capacidade da fila: ");
        capacidade = Integer.parseInt(in.nextLine());
        Queue<Integer> fila = new Queue(capacidade);

        do {
            exibir();
            op = Integer.parseInt(in.nextLine());
            switch (op) {
                case 1:
                    if (fila.isFull()) {
                        System.out.println("Deque está cheio!");
                    } else {
                        System.out.print("Informe o número a ser inserido: ");
                        valor = Integer.parseInt(in.nextLine());
                        fila.enQueue(valor);
                    }
                    break;
                case 2:
                    System.out.print("Valor removido: " + fila.deQueue());
                    break;
                case 3:
                    fila.head();
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
        System.out.println("1 - Inserir valor no final da fila");
        System.out.println("2 - Remover valor do início da fila");
        System.out.println("3 - Exibir valor do início da fila");
        System.out.println("0 - Encerrar programa");
        System.out.print("Informe a opção desejada: ");
    }
}