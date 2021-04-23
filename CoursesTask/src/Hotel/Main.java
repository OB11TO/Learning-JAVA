package Hotel;

import Hotel.entity.Bill;
import Hotel.entity.Client;
import Hotel.entity.Hotel;
import Hotel.entity.Room;
import Hotel.service.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * В данном домашнем задании нужно написатьсистему бронировния номеров в отеле.*
 * Сущности: Client, Hotel, Room, Bill.
 *
 * Client будет содержать поля: имя, фамилию, номер телефона, почту, ссылку на Bill
 * В Bill будет сумма денег
 * Hotel будет содеражть поля: имя отеля, список номеров
 * Room будет содеражть колличество человек, которых можно разместить, стоимость этого номера и свободен ли этот номер
 *
 * Сценарии:
 * Нужно создать нескольких клиентов с счетами и внести им первоначальную сумму.
 * Так же нужно создать несколько отелей, с разными наборами номеров (В списке внутри сущности Hotel)
 * Клиент должен попробовать забронировать номер, для этого он так же указывает
 * сколько человек в номере ему нужно разместить. После успешного бронирования списывать сумму со счета клиента.
 *
 * Так же при бронировании проверять есть ли свободные номера
 *
 * В одном из сценариев, клиенту должно не хватить денег для бронирования номера
 *
 * В методе main не нужно проводить никаких операций, кроме создания начальных объектов, сервисов и вызова их методов
 */
public class Main {
    public static void main(String[] args) {
        Bill firstBill = new Bill(1200);
        Client firstClient = new Client("Bran", "Starck", "+7939433213", firstBill );

        Bill secondBill = new Bill(920000000);
        Client secondClient = new Client("Artem", "Man","+79894256781",secondBill);

        List<Room>  roomGrand = Arrays.asList(new Room(1, 3500, true),
                new Room(2, 500, true),
                new Room(3, 450, false));
        Hotel hotelGrand = new Hotel("Grand", roomGrand);

        List<Room> roomRoyal = Arrays.asList(new Room(2,95000,true),
                new Room(4,1500,false),
                new Room(3,1300,true));
        Hotel hotelRoyal = new Hotel("Royal", roomRoyal);

        Service service = new Service();
        service.booking(hotelGrand, firstClient, 2);
        System.out.println("\n");
        service.booking(hotelGrand, firstClient, 6);
        System.out.println("\n");
        service.booking(hotelGrand, firstClient, 1);

        System.out.println("\n");
        System.out.println("\n");
        System.out.println("\n");
        service.booking(hotelRoyal, firstClient, 2);
        System.out.println("\n");
        service.booking(hotelRoyal, firstClient, 2);

        System.out.println("\n");
        System.out.println("\n");
        System.out.println("\n");
        service.booking(hotelRoyal, secondClient, 2);
        System.out.println("Артём приобрел самый дорогой номер в отеле Royal");








    }

}
