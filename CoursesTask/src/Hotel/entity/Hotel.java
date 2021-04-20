package Hotel.entity;

import java.util.List;

public class Hotel {
    private String nameHotel;
    private List<Room> listOfNumbersRoom;

    public String getNameHotel() {
        return nameHotel;
    }

    public void setNameHotel(String nameHotel) {
        this.nameHotel = nameHotel;
    }

    public List<Room> getListOfNumbersRoom() {
        return listOfNumbersRoom;
    }

    public void setListOfNumbersRoom(List<Room> listOfNumbersRoom) {
        this.listOfNumbersRoom = listOfNumbersRoom;
    }

    public Hotel(String nameHotel, List<Room> listOfNumbersRoom) {
        this.nameHotel = nameHotel;
        this.listOfNumbersRoom = listOfNumbersRoom;
    }
}
