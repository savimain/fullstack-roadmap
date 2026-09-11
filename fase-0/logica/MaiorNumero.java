import java.io.*;

public class MaiorNumero {
    private int[] lista;
    private int maior;

    public MaiorNumero() {
        lista = new int[5];
        maior = -1;
    }

    public int[] introduzirNumeros() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            for (int i = 0; i < lista.length; i++) {
                System.out.println("Introduza um numero");
                lista[i] = Integer.parseInt(br.readLine());
            }
        } catch (NumberFormatException ne) {
            System.out.println(ne.getMessage());
        } catch (IOException io) {
            System.out.println(io.getMessage());
        }
        return lista;
    }

    public void compararMaior() {
        maior = lista[0];
        for (int i = 1; i < lista.length; i++) {
            if (lista[i] > maior)
                maior = lista[i];

        }
        System.out.println("O maior numero e :" + maior);
    }

    public static void main(String[] args) {
        MaiorNumero m = new MaiorNumero();
        m.introduzirNumeros();
        m.compararMaior();
    }
}