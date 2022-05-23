/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

/**
 *
 * @author shindi_ap & ririn_yed
 */
public class Session {  
    private static long id;
    private static String name;
    private static String username;
    private static String role;
    
    public static long getUserLoginId() {
        return id;
    }
    
    public static String getUserLoginName() {
        return name;
    }
    
    public static String getUserLoginUsername() {
        return username;
    }
    
    public static String getUserLoginRole() {
        return role;
    }
    
    public static void setUserLoginId(long id) {
        Session.id = id;
    }
    
    public static void setUserLoginName(String name) {
        Session.name = name;
    }
    
    public static void setUserLoginUsername(String username) {
        Session.username = username;
    }
    
    public static void setUserLoginRole(String role) {
        Session.role = role;
    }
}
