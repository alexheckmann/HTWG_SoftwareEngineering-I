package innerclass;

public class Building {

    private String name = "";

    public Building(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    //using a normal inner class because you need to instantiate a new building before creating a room
    public class Room {
        private int roomNumber = 0;
        private int size = 0;

        public Room() {

        }

        public Room(int roomNumber, int size) {
            this.roomNumber = roomNumber;
            this.size = size;
        }

        public int getRoomNumber() {
            return this.roomNumber;
        }

        public Room setSize(int size) {
            this.size = size;
            return this;
        }

        public Room setRoomNumber(int newRoomNumber) {
            this.roomNumber = newRoomNumber;
            return this;
        }

        public Room build() {
            return new Room(roomNumber, size);
        }

    }

    public static void main(String[] args) {
        Building building = new Building("O");
        Room room = building.new Room().setRoomNumber(102).setSize(20).build();
        System.out.println("Gebäude: " + building.getName() + ", Raum: " + room.getRoomNumber());
    }

}
