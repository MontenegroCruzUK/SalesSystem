/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import javafx.beans.property.SimpleStringProperty;

/**
 *
 * @author MontenegroCruz
 */
public class AppModel {

    private SimpleStringProperty appName;
    private SimpleStringProperty appEmail;
    private SimpleStringProperty appIcon;

    public AppModel() {
    }

    public AppModel(String appName, String appEmail, String appIcon) {
        this.appName = new SimpleStringProperty(appName);
        this.appName = new SimpleStringProperty(appEmail);
        this.appName = new SimpleStringProperty(appIcon);

    }

    public String getAppName() {
        return appName.get();
    }

    public String getAppEmail() {
        return appEmail.get();
    }

    public String getAppIcon() {
        return appIcon.get();
    }

}
