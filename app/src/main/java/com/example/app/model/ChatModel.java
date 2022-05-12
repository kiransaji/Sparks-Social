package com.example.app.model;

public class ChatModel {

    int prof;
    String lastMessage, userName;

    public ChatModel(int profile, String lastMessage, String userName) {
        this.prof = profile;
        this.lastMessage = lastMessage;
        this.userName = userName;
    }

    public int getProf() {
        return prof;
    }

    public void setProf(int prof) {
        this.prof = prof;
    }

    public String getLastMessage() {
        return lastMessage;
    }

    public void setLastMessage(String lastMessage) {
        this.lastMessage = lastMessage;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
