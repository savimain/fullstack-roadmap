import java.io.*;

/*
 * Problema: Recebe um número N (quantos elementos a lista vai ter), 
 * depois recebe N números. No fim, mostra quantos desses números são pares.
 */

public class NumeroPar {
    private int[] lista;
    private int tamanho;

    public NumeroPar() {
        tamanho = tamanhoDaLista();
        lista = new int[tamanho];
        lista = introduzirNumeros();
    }

    public int tamanhoDaLista() {
        int x = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Introduza o tamanho da lista");
            x = Integer.parseInt(br.readLine());
        } catch (NumberFormatException ne) {
            System.out.println(ne.getMessage());
        } catch (IOException io) {
            System.out.println(io.getMessage());
        }
        return x;
    }

    public int[] introduzirNumeros() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            for (int i = 0; i < tamanho; i++) {
                System.out.println("Introduza 0 " + (i + 1) + " numero");
                lista[i] = Integer.parseInt(br.readLine());
            }
        } catch (NumberFormatException ne) {
            System.out.println(ne.getMessage());
        } catch (IOException io) {
            System.out.println(io.getMessage());
        }
        return lista;
    }

    public void parOuImpar() {
        int cont = 0;
        for (int i = 0; i < tamanho; i++) {
            if (lista[i] % 2 == 0)
                cont++;
        }
        System.out.println("Temos " + cont + " Numeros pares");
    }

    public static void main(String[] args) {
        NumeroPar m = new NumeroPar();
        m.parOuImpar();
    }
}