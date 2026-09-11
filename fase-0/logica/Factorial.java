import java.io.*;

public class Factorial {
    private int num;
    private double factorial;

    public Factorial() {
        num = introduzirNumero();
        factorial = calcularFactorial();
        visualizarFactorial();
    }

    public int introduzirNumero() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = 0;
        do {
            try {
                System.out.print("Introduza um numero");
                n = Integer.parseInt(br.readLine());
                if (n < 0)
                    System.out.println("Erro!");
            } catch (NumberFormatException ne) {
                System.out.println("Erro! Introduza um número válido.");
            } catch (IOException io) {
                System.out.println(io.getMessage());
            }

        } while (n < 0);
        return n;
    }

    public double calcularFactorial() {
        double resultado = 1;
        if (num == 0 || num == 1)
            return resultado;
        for (int i = 2; i <= num; i++)
            resultado *= i;
        return resultado;
    }

    public void visualizarFactorial() {
        System.out.println("O factorial de " + num + " é: " + factorial);
    }

    public static void main(String args[]) {
        Factorial f = new Factorial();

    }
}