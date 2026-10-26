import java.util.Scanner; // Permite pedir datos
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Lee las respuestas
        System.out.print("Ingrese la raiz del arbol: ");
        String raiz = sc.nextLine(); // Guarda la raiz
        System.out.print("Ingrese el hijo izquierdo: ");
        String izquierdo = sc.nextLine(); // Guarda el hijo izquierdo
        System.out.print("Ingrese el hijo derecho: ");
        String derecho = sc.nextLine(); // Guarda el hijo derecho
        System.out.println("\nArbol creado:"); // Muestra el titulo
        System.out.println("       " + raiz); // Imprime la raiz
        System.out.println("      /   \\"); // Dibuja las ramas
        System.out.println("   " + izquierdo + "   " + derecho); // Imprime los hijos
        sc.close(); // Cierra el lector
    }
}