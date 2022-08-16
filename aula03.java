public class modularização {
  public static int maior (int a, int b) {
    int max = a;
    if (b > max) {
      max = b;
    }
    return max;
  }
  // As variáveis a, b, max são locais ao método maior.
  
  public static void main (String{} args) {
    int n1 = 20;
    int n2 = 5;
    int n3 = 15;
    int n4 = 8;
    int i = maior(n1, n2);
    int j = maior(n3, n4);
    int k = maior(i, j);
    System.out.println("Maior: " + k);
  }
}
// As variáveis n1, n2, n3, n4, i, j, k são locais ao método main.
