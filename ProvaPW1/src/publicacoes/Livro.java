package publicacoes;

import empresas.Editora;
import java.util.List;
import pessoas.Autor;

public class Livro extends Publicacao{ //1.5
    private String isbn;
    private List<Autor> autores; //1.7
    private static final int NUM_MAX_OBJ = 10;

    public Livro() {}
    public Livro(int ano, String pais, Editora editora,
            String isbn, List<Autor> autores) {
        super(ano, pais, editora);
        this.isbn = isbn;
        this.autores = autores;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public List<Autor> getAutores() {
        return autores;
    }

    public void setAutores(List<Autor> autores) {
        this.autores = autores;
    }

    @Override
    //1.9
    public String toString() {
        String aux = "Autores não cadastrados!";
        if(autores != null){
            aux = "";
            for (Autor autor : autores) {
                aux += autor.toString();
            }
        }
        return super.toString() + " isbn=" + isbn + " autores=" + aux + '}';
    }
    
    
     
    
}
