package com.mycompany.loan_control.controllers.bookutilities;

import java.net.URL;
import java.util.ResourceBundle;

import com.mycompany.loan_control.App;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;

public class BookUtilitiesController implements Initializable  {
 

  @Override
  public void initialize(URL location, ResourceBundle resources) {
   
  }


  @FXML
  public void goToIndexAdmin() {    
    App.setRoot("menuadmin" , "indexadmin");
  }

  @FXML
  public void goToCreateBook() {    
    App.view("createbook");
  }
  
  @FXML
  public void goToUpdateBook() {    
    App.view("updatebook");
  }
}


