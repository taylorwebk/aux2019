import java.util.Stack;
import java.util.Scanner;

class P1E1 {
  private static void leer(Stack<Integer> p) {
    Scanner lee = new Scanner(System.in);
    System.out.println("Ingrese los datos de la Pila:");
    System.out.println("\"fin\" para terminar.");
    String a = lee.nextLine();
    while(!a.equals("fin")) {
      Integer dato = Integer.valueOf(a);
      p.push(dato);
      a = lee.nextLine();
    }
    mostrar(p);
  }
  private static void mostrar(Stack<Integer> p) {
    if (p.isEmpty()) {
      System.out.println("Pila Vacia.");
      return;
    }
    Integer el;
    System.out.println("Elementos: ");
    while (!p.isEmpty()) {
      el = p.pop();
      System.out.print(el + ",");
    }
    System.out.println("");
  }
  public static void main(String[] args) {
    Stack<Integer> p1 = new Stack<>();
    Stack<Integer> p2 = new Stack<>();
    leer(p1);
    leer(p2);
    System.out.println("INICIO DEL PROGRAMA:");
    
  }
}