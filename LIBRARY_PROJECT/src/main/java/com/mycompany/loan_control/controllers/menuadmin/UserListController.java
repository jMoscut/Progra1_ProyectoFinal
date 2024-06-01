package com.mycompany.loan_control.controllers.menuadmin;

import java.net.URL;
import java.util.ResourceBundle;

import com.mycompany.loan_control.App;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;

public class UserListController implements Initializable{


     @Override
  public void initialize(URL location, ResourceBundle resources) {
   
  }


  @FXML
  public void goToIndexAdmin() {    
    App.view("indexadmin");
  }

  @FXML
  public void goToUpdateUser() {    
    App.view("updateuser");
  }
  
  @FXML
  public void goToCreateUser() {    
    App.view("createuser");
  }
}
