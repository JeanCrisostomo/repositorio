/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecoes;

import java.util.NoSuchElementException;

public class Teste {

    public static void main(String[] args) {
        Fila<Number> numeros = new Fila();
        try {
            numeros.adicionar(5); //int
            numeros.adicionar(5.5); //double
            numeros.adicionar(5.8F); //float
            numeros.remover(0);
            if (numeros.contem(5.5)) {
                System.out.println("Dentro da fila tem o número 5.5");
            } else {
                System.out.println("Dentro da fila não tem o número 5.5");
            }
            System.out.println(numeros.toString());
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Ind. inválido");
        } catch (NoSuchElementException e) {
            System.out.println("Elem. não encontrado");
        } catch (Exception e) {
            System.out.println("Deu uma exceção");
        } finally {
            System.out.println("concluindo");
        }
    }

}
