/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestor.de.despesas;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;


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
    private TableView<Despesas> despesasTable;
    @FXML
    private TableColumn<Despesas, String> despesasColumn;
    @FXML
    private TableColumn<Despesas, Float> precoColumn;
    @FXML
    private TableColumn<Despesas, String> dataColumn;
    @FXML
    private TableColumn<Despesas, String> docColumn;
    @FXML
    private TableColumn<Despesas, String> notaColumn;
    
    /*
    @FXML
    private Label despesaLabel;
    @FXML
    private Label precoLabel;
    @FXML
    private Label dataLabel;
    @FXML
    private Label docLabel;
    @FXML
    private Label notaLabel;
*/
    //private Despesas despesas;
    
    //private List<Despesas> desp = new ArrayList<Despesas>();

    
    
    private final ObservableList<Despesas> despesas = FXCollections.observableArrayList(
    new Despesas("Jacob", 2.3f, "jacob", "sdsd", "wddwd")
            
    );
    
   
    @FXML
    public void addDespesa(ActionEvent e){
        
        
      //List<Despesas> despesas = new ArrayList<Despesas>();
      
        despesas.add(new Despesas(textFieldDespesa.getText(),Float.parseFloat(textFieldPreco.getText()),textFieldData.getText(), textFieldDoc.getText(), textAreaNota.getText()));
        //despesas = ArrayList (textFieldDespesa.getText(),Float.parseFloat(textFieldPreco.getText()),textFieldData.getText(), textFieldDoc.getText(), textAreaNota.getText());
        String text = textFieldDespesa.getText();
        //float preco =Float.parseFloat(textFieldPreco.getText());
        String data = textFieldData.getText();
        System.out.println(data);
        //desp.add(despesas);
        System.out.println(despesas);
        
        System.out.println("xxxxxxxx"+despesas.get(1));
    }
    
   @FXML
    private void showDespesa(ActionEvent event) throws IOException
    {
         
       //ObservableList data = FXCollections.observableList(despesas);
     // ListView<Double> listView = new ListView<Double>(names);
        
        
        System.out.println("Password is incorrect. Please Try Again");  
        
        Parent listdespesas = FXMLLoader.load(getClass().getResource("/FXML/listaDespesas.fxml"));
        Scene despesas_scene = new Scene(listdespesas);
        Stage appStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        appStage.setScene(despesas_scene);
        appStage.show();
        
        
        /*
        //final ListView<Despesas> listDespesa = new ListView<Despesas>(despesas);
        listDespesa.setItems(despesas);
        listDespesa.setPrefWidth(150);
        listDespesa.setPrefHeight(150);
        */
        
      

              
    }
   

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
    
}

