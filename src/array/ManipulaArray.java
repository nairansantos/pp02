package array;

import java.util.Scanner;

public class ManipulaArray {
	public static int[] lerArrayUsuario() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite os elementos do array separados por espaços: ");
        String[] elementosString = scanner.nextLine().split(" ");
        int[] array = new int[elementosString.length];
	
        for (int i = 0; i < elementosString.length; i++) {
            try {
                array[i] = Integer.parseInt(elementosString[i]);
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Certifique-se de digitar apenas números válidos.");
                return lerArrayUsuario(); // Chama recursivamente para tentar novamente
            }
        }
        
        return array;
    }
}
