/*----------------------------------------------------------------------------------------------
 *Copyright(C) GDSE-56-GIT Exam. All rights reserved.
 *Licensed under the MIT License. See License, txt in the project root for license information.
 *---------------------------------------------------------------------------------------------*/

package lk.ijse.controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Paint;
import lk.ijse.db.DBConnection;

import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;

/**
 * @author Tharushi Welarathna <nirmanitharushi1@gmail.com>
 * @since 10/9/2021
 */
public class AddCustomerFormController  {
    public AnchorPane root;
    public JFXTextField txtCustomerID;
    public JFXTextField txtCustomerName;
    public JFXTextField txtAddress;
    public JFXTextField txtCity;
    public JFXTextField txtProvince;
    public JFXTextField txtContact;
    public JFXButton btnAddNewCustomer;
    public JFXButton btnSaveCustomer;
    private boolean addNew;

    public void btnAddNewCustomerOnAction(ActionEvent actionEvent) {
        txtCustomerID.requestFocus();
        addNew = true;
    }

    public void btnSaveCustomerOnAction(ActionEvent actionEvent) {
        if (addNew){

            try {

                Connection connection = DBConnection.getInstance().getConnection();

                PreparedStatement pstm = connection.prepareStatement("INSERT INTO Customer VALUES (?,?,?,?,?,?)");



                                        pstm.setObject(1, txtCustomerID.getText());
                                        pstm.setObject(2, txtCustomerName.getText());
                                        pstm.setObject(3, txtAddress.getText());
                                        pstm.setObject(4, txtCity.getText());
                                        pstm.setObject(5, txtProvince.getText());
                                        pstm.setObject(6, Integer.parseInt(txtContact.getText()));

                                        int affectedRows = pstm.executeUpdate();

                                        if (affectedRows > 0){

                                        }else{
                                            new Alert(Alert.AlertType.ERROR, "Failed to add the customer", ButtonType.OK).show();
                                        }





            } catch (Exception ex) {
                Logger.getLogger(AddCustomerFormController.class.getName()).log(Level.SEVERE, null, ex);
            }


        }else{



        }
    }


}
