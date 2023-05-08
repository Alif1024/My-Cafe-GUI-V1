/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import javax.swing.JOptionPane;
import mycafegui.home;

/**
 *
 * @author nural
 */
public class login {
    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public boolean loginMethod() {
        if(username.equals("alif") && password.equals("alif")) {
            home newHome = new home();
            newHome.setVisible(true);
            return true;
        } else {
            JOptionPane.showMessageDialog(null,"Incorrect Username or Password","Warning",JOptionPane.WARNING_MESSAGE);    
            
        }        
        return false;
    }
}
