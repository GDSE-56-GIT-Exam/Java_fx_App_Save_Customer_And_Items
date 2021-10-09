/*----------------------------------------------------------------------------------------------
 *Copyright(C) GDSE-56-GIT Exam. All rights reserved.
 *Licensed under the MIT License. See License, txt in the project root for license information.
 *---------------------------------------------------------------------------------------------*/

package lk.ijse;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Tharushi Welarathna <nirmanitharushi1@gmail.com>
 * @since 10/9/2021
 */
public class AppInitializer extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {

        try {

        Parent root = FXMLLoader.load(this.getClass().getResource("/lk/ijse/view/AddCustomerForm.fxml"));

        Scene mainScene = new Scene(root);

        primaryStage.setTitle("Super Market System");
        primaryStage.setScene(mainScene);
        primaryStage.setResizable(false);

        primaryStage.show();


    } catch (
    IOException ex) {
        Logger.getLogger(AppInitializer.class.getName()).log(Level.SEVERE, null, ex);
    } catch (Throwable ex) {
        Logger.getLogger(AppInitializer.class.getName()).log(Level.SEVERE, null, ex);
    }
    }
    public static void main(String[] args) {
        launch(args);
    }

}
