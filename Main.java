import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc1 = new Scanner(System.in);
    System.out.println("Digite uma frase: ");
    String fraseUsuario = sc1.nextLine();
    String[] fraseInvertida = fraseUsuario.split(" ");
    for (int i = fraseInvertida.length-1; i >= 0; i--){
      System.out.print(fraseInvertida[i] + " ");
    }
  }
}