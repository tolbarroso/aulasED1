public class aula2{
    public static void main(String[] args) {

        char letra = 'a';
        Character.toUpperCase(letra);

        System.out.println("EXEMPLO:")
        System.out.println(letra);

        String nome1 = "Maria Clara";
        String nome2 = "Maria Clara";
        String nome3 = new String("Maria Clara");

        System.out.println("TESTE 1:");

        if(nome1 == nome3){
            System.out.println("Iguais");
        } else {
            System.out.println("Diferentes");
        }

        System.out.println("TESTE 2:");
        
        if(nome1.equals(nome3) == true){
            System.out.println("Iguais");
        } else {
            System.out.println("Diferentes");
        }
        
        nome2.toUpperCase();
        System.out.println(nome2);
        System.out.println("Nome 1: " + nome1);
        System.out.println("Nome 2: " + nome2);
    }
}