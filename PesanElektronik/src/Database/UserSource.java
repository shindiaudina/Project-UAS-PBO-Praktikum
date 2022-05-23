/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Database;

import Models.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List; 
/**
 *
 * @author shindi_ap & ririn_yed
 */
public class UserSource {
    public PreparedStatement st;
    public ResultSet rs;
    
    public ResultSet login(String username, String password) throws SQLException {
        String sql = "SELECT * FROM user WHERE username=? AND password=?";
        Connection cn = Database.Koneksi.Koneksi();
        
        st = cn.prepareStatement(sql);
        st.setString(1, username);
        st.setString(2, password);
        rs = st.executeQuery();
        
        return rs;
    }
    
    public ResultSet findId(long userId) throws SQLException {
        String sql = "SELECT * FROM user WHERE id=?";
        Connection cn = Database.Koneksi.Koneksi();
        
        st = cn.prepareStatement(sql);
        st.setLong(1, userId);
        rs = st.executeQuery();
        
        return rs;
    }
    
    public ResultSet findUsername(String username) throws SQLException {
        String sql = "SELECT * FROM user WHERE username=?";
        Connection cn = Database.Koneksi.Koneksi();
        
        st = cn.prepareStatement(sql);
        st.setString(1, username);
        rs = st.executeQuery();
        
        return rs;
    }
    
    public void save(User user) throws SQLException {
        String sql = "INSERT INTO user (id, name, username, password, role) VALUES (null, ?, ?, ?, ?)";
        Connection cn = Database.Koneksi.Koneksi();
        
        st = cn.prepareStatement(sql);
        st.setString(1, user.getUserName());
        st.setString(3, user.getUserUsername());
        st.setString(2, user.getUserPassword());
        st.setString(4, user.getUserRole());
        
        st.executeUpdate();
    }
     
    public void saveProfile(long userId, String name) throws SQLException {
        String sql = "UPDATE user SET name=? WHERE id=?";
        Connection cn = Database.Koneksi.Koneksi();

        st = cn.prepareStatement(sql);
        st.setString(1, name);
        st.setLong(2, userId);
        
        st.executeUpdate();
    }
     
    public void delete(User user) throws SQLException {
        String sql = "DELETE FROM user WHERE id=?";
        Connection cn = Database.Koneksi.Koneksi();

        st = cn.prepareStatement(sql);
        st.setLong(1, user.getUserId());

        st.executeUpdate();
    }
     
    public List<User> findAll() throws SQLException {
        String sql = "SELECT * FROM user";
        Connection cn = Database.Koneksi.Koneksi();
        
        rs = cn.createStatement().executeQuery(sql);
        
        List<User> userList = new ArrayList<>();
        while (rs.next()) {            
            User user = new User(
                rs.getString("name"),
                rs.getString("username"),
                rs.getString("password"),
                rs.getString("role")
            );
            
            user.setUserId(rs.getInt("id"));
            userList.add(user);
        }
        
        return userList;
    }
}
