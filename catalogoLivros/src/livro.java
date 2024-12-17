public class livro {
    private String titulo;
    private String autor;
    private int anoDePublicaçacao;

    public livro (String titulo, String autor, int ano) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoDePublicaçacao = ano;

    }

    public int getAnoDePublicaçacao() {
        return anoDePublicaçacao;
    }

    public void setAnoDePublicaçacao(int anoDePublicaçacao) {
        this.anoDePublicaçacao = anoDePublicaçacao;
    }

    @Override
    public String toString() {
        return " titulo " + titulo + " autor " + autor + " anoDePublicaçacao " + anoDePublicaçacao ;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
