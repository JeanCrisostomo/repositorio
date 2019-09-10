package publicacoes;

import empresas.Editora;

public abstract class Publicacao implements Comparable{
    protected int ano;
    protected String pais;
    private Editora editora;//1.6
    private static int contador;

    public Publicacao(){contador++;}
    public Publicacao(int ano, String pais, Editora editora) {
        this.ano = ano;
        this.pais = pais;
        this.editora = editora;
        contador++;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public Editora getEditora() {
        return editora;
    }

    public void setEditora(Editora editora) {
        this.editora = editora;
    }

    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        Publicacao.contador = contador;
    }

    @Override
    //1.8
    public String toString() {
        String aux = "Editora não cadastrada!";
        if(this.editora!=null) aux = this.editora.toString();
        return "Publicacao{" + "ano=" + ano + 
                ", pais=" + pais + aux + '}';
    }

    @Override
    public int compareTo(Object o) {
       Publicacao publicacao = (Publicacao) o; //converte o objeto o para a classe Publicacao
       if(this.ano == publicacao.getAno()) return 0;
       if(this.ano < publicacao.getAno()) return -1;
       return 1;
    }
    
    
    
}
