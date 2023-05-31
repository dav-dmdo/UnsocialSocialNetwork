/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ImportantClasses;

/**
 *
 * @author david
 */
public class Friendship {
    private User user1;
    private User user2;
    private int time;

    public Friendship(User user1, User user2, int time) {
        this.user1 = user1;
        this.user2 = user2;
        this.time = time;
    }

    @Override
    public String toString() {
        return user1.getUserID() + "," + user2.getUserID() + "," + time + "\n";
    }
    
    

    /**
     * @return the user1
     */
    public User getUser1() {
        return user1;
    }

    /**
     * @param user1 the user1 to set
     */
    public void setUser1(User user1) {
        this.user1 = user1;
    }

    /**
     * @return the user2
     */
    public User getUser2() {
        return user2;
    }

    /**
     * @param user2 the user2 to set
     */
    public void setUser2(User user2) {
        this.user2 = user2;
    }

    /**
     * @return the time
     */
    public int getTime() {
        return time;
    }

    /**
     * @param time the time to set
     */
    public void setTime(int time) {
        this.time = time;
    }
    
    
}
