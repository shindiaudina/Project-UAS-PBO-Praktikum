/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author shindi_ap & ririn_yed
 */
public class User {
    private long id;
    private String name;
    private String username;
    private String password;
    private String role;
    
    public User(String name, String username, String password, String role) {
        this.name = name;
        this.username = username;
        this.password = password;
        this.role = role;
    }
    
    public long getUserId() {
        return id;
    }
    
    public String getUserName() {
        return name;
    }
    
    public String getUserUsername() {
        return username;
    }
    
    public String getUserPassword() {
        return username;
    }
    
    public String getUserRole() {
        return role;
    }
    
    public void setUserId(long id) {
        this.id = id;
    }
    
    public void setUserName(String name) {
        this.name = name;
    }
    
    public void setUserUsername(String username) {
        this.username = username;
    }
    
    public void setUserPassword(String password) {
        this.password = password;
    }
    
    public void setUserRole(String role) {
        this.role = role;
    }
}
