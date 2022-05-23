/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import java.sql.Timestamp;

/**
 *
 * @author shindi_ap & ririn_yed
 */
public class Pesan {
    private long id;
    private String from;
    private String to;
    private String subject;
    private String message;
    private Timestamp timesent;
    private Timestamp timeread;
    
    public Pesan(String from, String to, String subject, String message, Timestamp timesent) {
        this.from = from;
        this.to = to;
        this.subject = subject;
        this.message = message;
        this.timesent = timesent;
    }
    
    public long getPesanId() {
        return id;
    }
    
    public String getPesanFrom() {
        return from;
    }
    
    public String getPesanTo() {
        return to;
    }
    
    public String getPesanSubject() {
        return subject;
    }
    
    public String getPesanMessage() {
        return message;
    }
    
    public Timestamp getPesanTimeSent() {
        return timesent;
    }
    
    public Timestamp getPesanTimeRead() {
        return timeread;
    }
    
    public void setPesanId(long id) {
        this.id = id;
    }
    
    public void setPesanFrom(String from) {
        this.from = from;
    }
    
    public void setPesanTo(String to) {
        this.to = to;
    }
    
    public void setPesanSubject(String subject) {
        this.subject = subject;
    }
    
    public void setPesanMessage(String message) {
        this.message = message;
    }
    
    public void setPesanTimeSent(Timestamp timesent) {
        this.timesent = timesent;
    }
    
    public void setPesanTimeRead(Timestamp timeread) {
        this.timeread = timeread;
    }
}
