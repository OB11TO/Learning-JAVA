package Hotel.service;

import Hotel.entity.Bill;
import Hotel.entity.Client;
import Hotel.entity.Hotel;
import Hotel.entity.Room;

import java.util.List;

public class Service {

    public void booking(Hotel hotel, Client client, int numberOfPerson){
        //получить все номера отеля и проверить не заняты ли они
        List<Room> rooms = hotel.getListOfNumbersRoom();
        boolean isFreeRooms = false;
        for(Room r : rooms){
            if(r.isAvailable()){
                isFreeRooms = true;
            }
        }
        if(!isFreeRooms){
            System.out.println("Свободных номеров в отеле " + hotel.getNameHotel()+ " нет!");
            
        }
        extracted(client, numberOfPerson, rooms);
    }


    private void extracted(Client client, int numberOfPerson, List<Room> rooms) {
        boolean success = false;

        for(Room room: rooms){
            String clientFirstName = client.getFirstName();
            if(room.getHuman() == numberOfPerson) {
                success = true;
                System.out.println("Нашелся номер для клиента " + clientFirstName);
                if (client.getBill().getSum() >= room.getRoomCash()) {
                    Bill clientBill = client.getBill();
                    clientBill.setSum(clientBill.getSum() - room.getRoomCash());
                    room.setAvailable(false);
                    System.out.println("Номер был успешно забронирован клиентом " + clientFirstName);
                } else {
                    System.out.println("Недостаточно средств для бронирования комера у клиента "  + clientFirstName);
                }
            }

            }
        if(!success){
            System.out.println("Не нашлось номеров");
        }
    }
}

