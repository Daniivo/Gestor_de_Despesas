/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestor.de.despesas;

import java.util.ArrayList;

/**
 *
 * @author danrodrigues
 */
public class Despesas{
    private String despesa;
    private Float  preco;
    private String data;
    private String doc;
    private String nota;

    public Despesas(String despesa, Float preco, String data, String doc, String nota) {
        this.despesa = despesa;
        this.preco = preco;
        this.data = data;
        this.doc = doc;
        this.nota = nota;
    }

    public String getDespesa() {
        return despesa;
    }

    public Float getPreco() {
        return preco;
    }

    public String getData() {
        return data;
    }

    public String getDoc() {
        return doc;
    }

    public String getNota() {
        return nota;
    }

    public void setDespesa(String despesa) {
        this.despesa = despesa;
    }

    public void setPreco(Float preco) {
        this.preco = preco;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setDoc(String doc) {
        this.doc = doc;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
      
        return "Despesas{" + "despesa=" + despesa + ", preco=" + preco + ", data=" + data + ", doc=" + doc + ", nota=" + nota + '}';
        
    }
    
    
    
    
    
    
}
