package Hotel.entity;

public class Room {
    private int human;
    private int roomCash;
    private boolean available;

    public Room(int human, int roomCash, boolean available) {
        this.human = human;
        this.roomCash = roomCash;
        this.available = available;
    }

    public int getHuman() {
        return human;
    }

    public void setHuman(int human) {
        this.human = human;
    }

    public int getRoomCash() {
        return roomCash;
    }

    public void setRoomCash(int roomCash) {
        this.roomCash = roomCash;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}
