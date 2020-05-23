package equals.example;

public class FlightSystem {

    private static void findDuplicates(Human[] passengerList) {
        for (int i = 0; i < passengerList.length; i++) {
            for (int j = passengerList.length - 1; j > 0; j--) {
                if (passengerList[i].equals(passengerList[j]) && i != j) {
                    System.out.println("Duplicate found: Index " + i + " & Index " + j + " refer to the same object");
                }
            }
        }
    }

    public static void main(String[] args) {
        Passenger passenger1 = new Passenger("LX");
        CrewMember crewMember1 = new CrewMember("LX2");
        CrewMember crewMember2 = new CrewMember("Hungriger Hugo");
        Pilot pilot = new Pilot("Monosound-Manu");

        Human[] passengerList = new Human[5];
        passengerList[0] = passenger1;
        passengerList[1] = crewMember1;
        passengerList[2] = crewMember2;
        passengerList[3] = pilot;
        passengerList[4] = pilot;

        findDuplicates(passengerList);

        Plane[] planes = new Plane[2];
        Plane plane1 = new Plane(1, 4, "V8");
        Plane plane2 = plane1.copy(2);
        planes[0] = plane1;
        planes[1] = plane2;
    }
}
