/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestor.de.despesas;

import java.awt.MenuBar;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author danrodrigues
 */
public class FXMLController implements Initializable {
    
    @FXML
    private TextField textFieldDespesa;
    @FXML
    private TextField textFieldPreco;
    @FXML
    private TextField textFieldData;
    @FXML
    private TextField textFieldDoc;
    @FXML
    private TextArea  textAreaNota;
    @FXML
    private MenuItem btShowDespesa;
    
    private Despesas despesas;
    
    
    private List<Despesas> desp = new ArrayList<Despesas>();
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
       // label.setText("Hello World!");
       
        System.out.println(textFieldDespesa);
       
    }
    @FXML
    public void addDespesa(ActionEvent e){
         
        despesas = new Despesas(textFieldDespesa.getText(),Float.parseFloat(textFieldPreco.getText()),textFieldData.getText(), textFieldDoc.getText(), textAreaNota.getText());
        String text = textFieldDespesa.getText();
        //float preco =Float.parseFloat(textFieldPreco.getText());
        String data = textFieldData.getText();
        System.out.println(data);
        desp.add(despesas);
        System.out.println(despesas);
    }
    
    @FXML
    public void showDespesa(ActionEvent event) throws IOException{
       
        Stage stage; 
        Parent root;
                

        
       
     if(event.getSource()==btShowDespesa){
        //get reference to the button's stage         
      
        //load up OTHER FXML document
  root = FXMLLoader.load(getClass().getResource("/FXML/listaDespesas.fxml"));
      }
     else{
      
  root = FXMLLoader.load(getClass().getResource("/FXML/listaDespesas.fxml"));
      }
     //create a new scene with root and set the stage
     
        
    }
    /*
    List<Despesas> listaDespesas = new ArrayList<Despesas>();
        Despesas d1 = new Despesas("Alimentacao", "Gravatas", "Foi um Bom Jantar", 2.2f);
        
        listaDespesas.add(d1);
        
        System.out.println(d1);
    */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
