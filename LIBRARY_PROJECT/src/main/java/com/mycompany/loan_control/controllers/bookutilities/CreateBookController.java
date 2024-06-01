package com.mycompany.loan_control.controllers.bookutilities;

import java.net.URL;
import java.util.ResourceBundle;

import com.mycompany.loan_control.App;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;

public class CreateBookController implements Initializable {

 @Override
  public void initialize(URL location, ResourceBundle resources) {
   
  }

 @FXML
  public void goToIndexAdmin() {    
    App.setRoot( "menuadmin", "indexadmin");
  }

  @FXML
  public void goToBookUtilities() {    
    App.view("bookutilities");
  }
  
  @FXML
  public void goToUpdateBook() {    
    App.view("updatebook");
  }
}
