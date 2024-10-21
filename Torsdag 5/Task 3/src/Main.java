//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Room room1 = new Room(5, 7);
        Room room2 = new Room(7, 4);
        Room room3 = new Room(10, 3);

        ArrayList<Room> rooms = new ArrayList<>();
        rooms.add(room1);
        rooms.add(room2);
        rooms.add(room3);

        Building building = new Building(rooms,2);

    }
    private static int countLampsInBuilding(Building building) {

    }
}