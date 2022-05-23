/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Database;

import Models.Pesan;
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
public class PesanSource {
    public PreparedStatement st;
    public ResultSet rs;
    
    public ResultSet find(Pesan user, String where) throws SQLException {
        String sql = "SELECT * FROM pesan WHERE " + where;
        Connection cn = Database.Koneksi.Koneksi();
        
        st = cn.prepareStatement(sql);
        rs = st.executeQuery();
        return rs; 
    }
    
    public void save(Pesan pesan) throws SQLException {
        String sql = "INSERT INTO pesan (id, fromUser, toUser, subject, message, timesent, timeread) VALUES (NULL, ?, ?, ?, ?, ?, NULL)";
        Connection cn = Database.Koneksi.Koneksi();
        
        st = cn.prepareStatement(sql);
        st.setString(1, pesan.getPesanFrom());
        st.setString(2, pesan.getPesanTo());
        st.setString(3, pesan.getPesanSubject());
        st.setString(4, pesan.getPesanMessage());
        st.setTimestamp(5, pesan.getPesanTimeSent());

        st.executeUpdate();
    }
     
    public void update(Pesan pesan) throws SQLException {
        String sql = "UPDATE pesan SET fromUser=?, toUser=?, subject=?, message=?, timesent=?, timeread=? WHERE id=?";
        Connection cn = Database.Koneksi.Koneksi();

        st = cn.prepareStatement(sql);
        st.setString(1, pesan.getPesanFrom());
        st.setString(2, pesan.getPesanTo());
        st.setString(3, pesan.getPesanSubject());
        st.setString(4, pesan.getPesanMessage());
        st.setTimestamp(5, pesan.getPesanTimeSent());
        st.setTimestamp(6, pesan.getPesanTimeRead());

        st.executeUpdate();
    }
    
    public List<Pesan> findMyInbox(String username) throws SQLException {
        String sql = "SELECT * FROM pesan WHERE toUser=?";
        Connection cn = Database.Koneksi.Koneksi();
        
        st = cn.prepareStatement(sql);
        st.setString(1, username);
        
        rs = st.executeQuery();

        List<Pesan> pesanList = new ArrayList<>();
        while (rs.next()) {            
            Pesan pesan = new Pesan(
                rs.getString("fromUser"),
                rs.getString("toUser"),
                rs.getString("subject"),
                rs.getString("message"),
                rs.getTimestamp("timesent")
            );
            
            pesan.setPesanId(rs.getInt("id"));
            pesan.setPesanTimeSent(rs.getTimestamp("timeread"));
                     
            pesanList.add(pesan);
        }
        
        System.out.println(pesanList);
        return pesanList;
    }
}
