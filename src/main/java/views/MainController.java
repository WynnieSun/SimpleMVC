package views;


import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import models.MainModel;

public class MainController 
{

    MainModel model;
    
    @FXML
    private TextField Name;

    @FXML
    private TextField Code;

    @FXML
    private TextField Section;

    @FXML
    private Button add;

    @FXML
    private ListView<String> listView;
       
    

    public void setModel(MainModel newModel) 
    { 
    	model = newModel;
    	listView.setItems(model.getRegistration());

    }


    @FXML
    void OnClickAdd(ActionEvent event) 
    {
    	
    	String newAdd = "Name: "+Name.textProperty().get()+"    Course: "+Code.textProperty().get()+"-"+Section.textProperty().get();
    	model.getRegistration().add(newAdd);
    	System.out.println(model.getRegistration());
    	
    	
    }
	 

}
