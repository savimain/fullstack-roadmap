import java.io.*;

public class Fibonacci {
    private int numero;

    public Fibonacci() {
        numero = introduzirNumero();
        sequenciaFib();
    }

    public int introduzirNumero() {
        int n = 0;
        boolean valido = false;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        do {
            System.out.println("Introduza um valor");
            try {
                n = Integer.parseInt(br.readLine());
                if (n < 0)
                    System.out.println("Erro!");
                else
                    valido = true;
            } catch (NumberFormatException ne) {
                System.out.println("Erro! Introduza um numero valido.");
            } catch (IOException io) {
                System.out.println(io.getMessage());
            }
        } while (!valido);
        return n;
    }

    public void sequenciaFib() {
        int[] fib = new int[numero];
        for (int i = 0; i < numero; i++) {
            if (i == 0)
                fib[i] = 0;
            else if (i == 1)
                fib[i] = 1;
            else
                fib[i] = fib[i - 1] + fib[i - 2];
            System.out.print(fib[i] + " ");
        }
    }

    public static void main(String args[]) {
        new Fibonacci();
    }
}