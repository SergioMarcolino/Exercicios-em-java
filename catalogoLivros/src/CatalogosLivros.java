import java.util.ArrayList;
import java.util.List;
public class CatalogosLivros {
  List <livro> listaDeLivros = new ArrayList<>();

    public CatalogosLivros() {
        this.listaDeLivros = new ArrayList<>();
    }
    //methods
    public void adicionaLivro(String titulo,String autor, int anoDeLancamento) {
        this.listaDeLivros.add(new livro(titulo,autor,anoDeLancamento));
    }
    public void pesquisaPorAuthor(String autor) {
        for  (livro livro: listaDeLivros) {
            if (livro.getAutor().equals(autor)) {
                System.out.println(livro.getTitulo());
            }
        }

    }
    public void PesquisaPorIntervaloAno(int anoDeLancamento, int anoDeTermino) {
        int primeiroAno = anoDeLancamento; int ultimoAno = anoDeTermino;
        List <livro> listaDeLivrosPorAno = new ArrayList();
        for (livro livro: listaDeLivros) {
            if (livro.getAnoDePublicaçacao() >= primeiroAno && livro.getAnoDePublicaçacao() <= ultimoAno) {
                listaDeLivrosPorAno.add(livro);
            }
        }
        System.out.println(listaDeLivrosPorAno);
    }

}
