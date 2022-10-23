/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Date;

/**
 *
 * @author ADMIN
 */
public class Session {
    private int id;
    private int groupId;
    private int roomId;
    private Date date;
    private int timeSlotId;
    private int userId;
    private boolean attanded;

    public Session(int groupId, int roomId, Date date, int timeSlotId, int userId, boolean attanded) {
        this.groupId = groupId;
        this.roomId = roomId;
        this.date = date;
        this.timeSlotId = timeSlotId;
        this.userId = userId;
        this.attanded = attanded;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getTimeSlotId() {
        return timeSlotId;
    }

    public void setTimeSlotId(int timeSlotId) {
        this.timeSlotId = timeSlotId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public boolean isAttanded() {
        return attanded;
    }

    public void setAttanded(boolean attanded) {
        this.attanded = attanded;
    }
    
    
}
