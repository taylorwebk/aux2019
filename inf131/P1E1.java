import java.util.Stack;
import java.util.Scanner;

/**
 * Dadas dos pilas A y B que contienen números enteros se pide llevar aquellos números que
sean pares a la pila A y el resto de los números impares a la pila B, sin hacer uso de pilas
auxiliares ni ninguna otra estructura. Stack Methods: peek pop push search empty
 */

class P1E1 {
  private static Scanner lee = new Scanner(System.in);

  private static void leer(Stack<Integer> p) {
    System.out.println("Ingrese los datos de la Pila:");
    System.out.println("\"fin\" para terminar.");
    String a = lee.nextLine();
    while(!a.equals("fin")) {
      Integer dato = Integer.valueOf(a);
      p.push(dato);
      a = lee.nextLine();
    }
  }
  private static void mostrar(Stack<Integer> p) {
    System.out.println(p.toString());
    return;
    /* if (p.isEmpty()) {
      System.out.println("Pila Vacia.");
      return;
    }
    Stack<Integer> aux = p;
    Integer el;
    System.out.println("Elementos: ");
    while (!aux.isEmpty()) {
      el = aux.pop();
      System.out.print(el + ",");
    }
    System.out.println(""); */
  }
  public static void main(String[] args) {
    Stack<Integer> p1 = new Stack<>();
    Stack<Integer> p2 = new Stack<>();
    leer(p1);
    leer(p2);
    System.out.println("INICIO DEL PROGRAMA:");
    mostrar(p1);
    mostrar(p2);
    while(!p1.empty()) {
      p2.push(p1.pop());
    }
    mostrar(p1);
    mostrar(p2);
    boolean fin = false;
    while(!fin) {
      fin = false;
      int par;
      while(!p2.empty()) {
        par = p2.pop();
        if (par % 2 == 0) {
          if (!p1.empty()) {
            while (!p1.empty() && p1.peek() % 2 != 0) {
              p2.push(p1.pop());
            }
          }
          p1.push(par);
          break;
        } else {
          p1.push(par);
        }
        if (p2.empty()) {
          while(!p1.isEmpty() && p1.peek() % 2 != 0) {
            p2.push(p1.pop());
          }
          fin = true;
          break;
        }
      }
    }
    mostrar(p1);
    mostrar(p2);
    lee.close();
  }
}