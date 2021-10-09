/*----------------------------------------------------------------------------------------------
 *Copyright(C) GDSE-56-GIT Exam. All rights reserved.
 *Licensed under the MIT License. See License, txt in the project root for license information.
 *---------------------------------------------------------------------------------------------*/

package lk.ijse.controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Paint;
import lk.ijse.db.DBConnection;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;

/**
 * @author Tharushi Welarathna <nirmanitharushi1@gmail.com>
 * @since 10/9/2021
 */
public class AddItemFormController {
    public AnchorPane root;
    public JFXButton btnAddNewItem;
    public JFXButton btnSaveItem;
    public JFXTextField txtItemCode;
    public JFXTextField txtDescription;
    public JFXTextField txtQtyOnHand;
    public JFXTextField txtPrice;
    private boolean addNew;

    public void btnAddNewItemOnAction(ActionEvent actionEvent) {
        txtItemCode.requestFocus();
        addNew = true;
    }

    public void btnSaveItemOnAction(ActionEvent actionEvent) {
        if (addNew){

            try {

                Connection connection = DBConnection.getInstance().getConnection();

                PreparedStatement pstm = connection.prepareStatement("INSERT INTO Product VALUES (?,?,?,?)");


                                        pstm.setObject(1, txtItemCode.getText());
                                        pstm.setObject(2, txtDescription.getText());
                                        pstm.setObject(3, Integer.parseInt(txtQtyOnHand.getText()));
                                        pstm.setObject(4, BigDecimal.valueOf(Long.parseLong(txtPrice.getText())));



                                        int affectedRows = pstm.executeUpdate();

                                        if (affectedRows > 0){

                                        }else{
                                            new Alert(Alert.AlertType.ERROR, "Failed to add the item", ButtonType.OK).show();
                                        }

            } catch (Exception ex) {
                Logger.getLogger(AddItemFormController.class.getName()).log(Level.SEVERE, null, ex);
            }



        }else{



        }
    }
}
