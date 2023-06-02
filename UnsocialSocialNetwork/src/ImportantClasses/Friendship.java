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
    private int user1ID;
    private int user2ID;
    private int time;

    public Friendship(int user1ID, int user2ID, int time) {
        this.user1ID = user1ID;
        this.user2ID = user2ID;
        this.time = time;
    }

    @Override
    public String toString() {
        return getUser1ID() + "," + getUser2ID()+ "," + getTime() + "\n";
    }

    /**
     * @return the user1ID
     */
    public int getUser1ID() {
        return user1ID;
    }

    /**
     * @param user1ID the user1ID to set
     */
    public void setUser1ID(int user1ID) {
        this.user1ID = user1ID;
    }

    /**
     * @return the user2ID
     */
    public int getUser2ID() {
        return user2ID;
    }

    /**
     * @param user2ID the user2ID to set
     */
    public void setUser2ID(int user2ID) {
        this.user2ID = user2ID;
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
