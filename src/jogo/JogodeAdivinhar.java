package jogo;
import java.util.Scanner;
import java.util.Random;

public class JogodeAdivinhar {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		int numeroSecreto = random.nextInt(100) + 1;
		int tentativas = 0;
		int palpite;
		
		while (true) {
			System.out.println("Digite seu palpite: ");
			palpite = scanner.nextInt();
			tentativas++;
			
			if (palpite == numeroSecreto) {
				System.out.println("Parabéns! Você acertou em " + tentativas + "tentativas." );
				break;
				
			}else if (palpite > numeroSecreto) {
				System.out.println("Palpite muito alto. Tente novamente.");
				
			}else {
				System.out.println("Palpite muito baixo. Tente novamente");
				
			}
		}
	}

}
