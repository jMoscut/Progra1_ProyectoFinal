package com.mycompany.loan_control.controllers.borrowingdetail;

import java.net.URL;
import java.util.ResourceBundle;

import com.mycompany.loan_control.App;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;

public class BorrowingListController implements Initializable {
  @Override
  public void initialize(URL location, ResourceBundle resources) {
   
  }


  @FXML
  public void goToIndexAdmin() {    
    App.setRoot("menuadmin" , "indexadmin");
  }
  
}
