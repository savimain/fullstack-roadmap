import java.io.*;

public class NumeroPrimo {
	private int numero;

	public NumeroPrimo() {
		numero = introduzirNumero();
		verificarPrimo();

	}

	public int introduzirNumero() {
		int n = 0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		do {
			System.out.println("Introduza um numero!");
			try {
				n = Integer.parseInt(br.readLine());
			} catch (NumberFormatException ne) {
				System.out.println(ne.getMessage());
			} catch (IOException io) {
				System.out.println(io.getMessage());
			}
			if (n < 0)
				System.out.println("Erro! Numero Invalido!");
		} while (n < 0);
		return n;
	}

	public void verificarPrimo() {
		if (numero < 2) {
			System.out.println("O numero nao e primo!");
			return;
		}
		boolean primo = true;
		for (int x = 2; x < numero; x++) {
			if (numero % x == 0) {
				primo = false;
				break;
			}

		}
		if (primo)
			System.out.println("O numero e primo");
		else
			System.out.println("O numero nao e primo");

	}

	public static void main(String args[]) {
		new NumeroPrimo();
	}

}
