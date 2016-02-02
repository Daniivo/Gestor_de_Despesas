/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestor.de.despesas;

import javafx.beans.property.FloatProperty;
import javafx.beans.property.SimpleFloatProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 *
 * @author danrodrigues
 */
public class Despesas{
    private final StringProperty despesa;
    private final FloatProperty  preco;
    private final StringProperty data;
    private final StringProperty doc;
    private final StringProperty nota;
   
    public Despesas(String despesa, Float preco, String data, String doc, String nota){
        this.despesa = new SimpleStringProperty(despesa);
        this.preco   = new SimpleFloatProperty (preco);
        this.data    = new SimpleStringProperty(data);
        this.doc     = new SimpleStringProperty(doc);
        this.nota    = new SimpleStringProperty(nota);
    }

    public String getDespesa(){
        return despesa.get();
    }
    public void setDespesa(String despesa){
        this.despesa.set(despesa);
    }
    public StringProperty despesaProperty(){
       return despesa;
    }
    public Float getPreco(){
        return preco.get();
    }
    public void setPreco(Float preco){
        this.preco.set(preco);
    }
    public FloatProperty precoProperty(){
       return preco;
    }
    public String getData(){
        return data.get();
    }
    public void setData(String data){
        this.data.set(data);
    }
    public StringProperty dataProperty(){
       return data;
    }
    public String getDoc(){
        return doc.get();
    }
    public void setDoc(String doc){
        this.doc.set(doc);
    }
    public StringProperty docProperty(){
       return doc;
    }
    public String getNota(){
        return nota.get();
    }
    public void setNota(String nota){
        this.nota.set(nota);
    }
    public StringProperty notaProperty(){
       return nota;
    }

    @Override
    public String toString() {
        return "Despesas{" + "despesa=" + despesa + ", preco=" + preco + ", data=" + data + ", doc=" + doc + ", nota=" + nota + '}';
    }
}
