package colecoes;

public interface OperacoesFila<E> {
    public boolean adicionar(E obj);
    public E remover(int indice);
    public String toString();
    public boolean contem(E obj);
}
