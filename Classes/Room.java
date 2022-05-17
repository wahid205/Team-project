/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author wahid
 */
public class Room {
    private int room_id;
    private int bed_number;
    private boolean hasWIFI;
    private boolean hasresidence;

    public Room(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getRoom_id() {
        return room_id;
    }

    public void setRoom_id(int room_id) {
        this.room_id = room_id;
    }
    public int getBed_number() {
        return bed_number;
    }

    public void setBed_number(int bed_number) {
        this.bed_number = bed_number;
    }

    public boolean isHasWIFI() {
        return hasWIFI;
    }

    public void setHasWIFI(boolean hasWIFI) {
        this.hasWIFI = hasWIFI;
    }
    public boolean getresidence() {
        return hasresidence;
    }

    public void setresidence(boolean hasresidence) {
        this.hasresidence = hasresidence;
    }

}