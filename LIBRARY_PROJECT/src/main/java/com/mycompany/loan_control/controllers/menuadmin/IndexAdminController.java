package com.mycompany.loan_control.controllers.menuadmin;

import java.net.URL;
import java.util.ResourceBundle;

import com.mycompany.loan_control.App;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;

public class IndexAdminController implements Initializable{

     @Override
  public void initialize(URL location, ResourceBundle resources) {
   
  }


  @FXML
  public void goToCreateUser() {    
    App.view("createuser");
  }

  @FXML
  public void goToBorrowingList() {    
    App.setRoot("borrowingdetail" , "borrowinglist");
  }
  
  @FXML
  public void goToCreateBook() {    
    App.setRoot("bookutilities", "createbook");
  }
  

}
