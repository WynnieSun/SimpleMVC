package models;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class MainModel 
{
	ObservableList<String> registration = FXCollections.observableArrayList();
	
	
	
	public MainModel()
	{

	}

	public void setRegistration(ObservableList<String> registration) {
		this.registration = registration;
	}

	public ObservableList<String> getRegistration() 
	{
		return registration;
	}
	
}
