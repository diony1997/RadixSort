/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package radix;

/**
 *
 * @author user58
 */
public class Fila {

    private No comeco, fim;
    
    public Fila()
    {
        comeco = fim = null;
    }
    
    public boolean isEmpty()
    {
        return (comeco == null);
    }
    
    public void enqueue(int valor)
    {
        No novo = new No(valor);    
        if(isEmpty()) 
        {
            comeco = fim = novo;
            
        } else {
        fim.setProximo(novo);
        fim = novo;
        }
    }
    
    public int dequeue()
    {
        if(isEmpty()){
            return -1; 
        }
        
        if(comeco == fim)
        {
            int aux = comeco.getDado();
            comeco = fim = null;
            return aux;
        }     
        
        No aux = comeco;
        comeco = comeco.getProximo();
        return aux.getDado();
    }
    
    public String imprimir()
    {
        No aux = comeco; 
        String saida = " ";
        while(aux != null)
        {
            saida += aux.getDado() + " - ";
            aux = aux.getProximo();
        }
        return saida;
    }
    
    //Getters
    public No peek()
    {
        return comeco;
    }
    
   
}

