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
public class No {
    
    private int dado;
    private No proximo;
    
    public No(int dado)
    {
        this.dado = dado;
        this.proximo = null;
    }

    public int getDado()
    {
        return dado;
    }

    public No getProximo()
    {
        return proximo;
    }
    
    public void setDado(int dado) 
    {
        this.dado = dado;
    }

    public void setProximo(No proximo) 
    {
        this.proximo = proximo;
    }

}
