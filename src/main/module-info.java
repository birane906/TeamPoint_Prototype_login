module TeamPoint.Prototype.login {
    requires javafx.graphics;
    requires javafx.fxml;
    requires javafx.controls;
    requires java.sql;
    requires mysql.connector.java;
    opens gui.view;
    opens gui.controller;
}