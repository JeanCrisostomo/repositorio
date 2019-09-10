/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecoes;

import java.util.LinkedList;
import java.util.NoSuchElementException;

public class Fila<E> implements OperacoesFila<E>{
    private LinkedList<E> fila = new LinkedList();

    @Override
    //throws = propagar
    public boolean adicionar(E obj) throws IndexOutOfBoundsException{
        return fila.add(obj);
    }

    @Override
    public E remover(int indice) {
        //causar a exceção
        throw new NoSuchElementException(); 
    }

    @Override
    public boolean contem(E obj) {
        try{
            //tenta fazer a linha 30 se deu certo sai do código se não deu vai para o catch
           return fila.contains(obj);
        }catch(Exception e){
            //se não conseguiu executar a linha 30 vem pro catch e retorna false
            System.out.println("Deu exceção no contem!");
        }
        return false;
    }
    public String toString(){
        String aux = "Elementos da fila:";
        if(fila!= null){
            for (E e : fila) {
                aux += e.toString();
            }
        }
        return aux;
    }
    
}
