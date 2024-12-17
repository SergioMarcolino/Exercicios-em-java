import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        CatalogosLivros lista = new CatalogosLivros();
        lista.adicionaLivro("feat","João",2000);

        lista.adicionaLivro("feat2","Pedro",2001);
        lista.adicionaLivro("feat3","Pedro",2002);

        lista.PesquisaPorIntervaloAno(2000,2003);


    }
}