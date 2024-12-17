import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
   List<Integer> numeros = new ArrayList<>();

    public SomaNumeros() {
        this.numeros = new ArrayList<>();
    }
    public void adicionarNumeros (int numero1 ){
        int numero = numero1;
        numeros.add(numero);
    }
    public int CalcularSoma () {
        int soma = 0;
        for (int numero = 0; numero < numeros.size(); numero++) {
            soma += numeros.get(numero);
        }
        return soma;
    }
}
