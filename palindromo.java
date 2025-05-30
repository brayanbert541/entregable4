import java.util.Scanner;
import java.util.Stack;

public class palindromo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa una palabra: ");
        String palabra = scanner.nextLine();

        Stack<Character> pila = new Stack<>();

        
        for (int i = 0; i < palabra.length(); i++) {
            pila.push(palabra.charAt(i));
        }

       
        String invertida = "";
        while (!pila.isEmpty()) {
            invertida += pila.pop();
        }

        
        if (palabra.equals(invertida)) {
            System.out.println("Es un palíndromo.");
        } else {
            System.out.println("No es un palíndromo.");
        }

        scanner.close();
    }
}





