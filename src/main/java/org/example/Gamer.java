package org.example;

public class Gamer {
    private String nickname;
    private Boolean isActive;

    public Gamer(String nickname, Boolean isActive) {
        this.nickname = nickname;
        this.isActive = isActive;
    }

    public String getNickname() {
        return nickname;
    }

    public Boolean getActive() {
        return isActive;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }

    @Override
    public String toString() {
        return "Gamer{" +
                "nickname='" + nickname + '\'' +
                ", isActive=" + isActive +
                '}';
    }
}
