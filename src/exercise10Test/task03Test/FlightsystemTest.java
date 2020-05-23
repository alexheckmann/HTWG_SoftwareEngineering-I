package exercise10Test.task03Test;

import exercise10.task03.*;
import org.junit.Test;

public class FlightsystemTest {

    @Test
    public void testPrintPassengerList_pilot() throws InvalidAccessException {

        // given
        Flightsystem flightsystem = new Flightsystem();
        Human pilot = new Pilot("Timmy", 9);
        Human crewMember = new CrewMember("Tommy", 25);
        Human passenger1 = new Passenger("Hungriger Hugo", 14);
        Human passenger2 = new Passenger("Magerer Marvin", 19);

        flightsystem.getPassengerList().add(passenger1);
        flightsystem.getPassengerList().add(passenger2);

        // when
        flightsystem.printPassengerList(pilot);

    }

    @Test
    public void testPrintPassengerList_crewMember() throws InvalidAccessException {

        // given
        Flightsystem flightsystem = new Flightsystem();
        Human pilot = new Pilot("Timmy", 9);
        Human crewMember = new CrewMember("Tommy", 25);
        Human passenger1 = new Passenger("Hungriger Hugo", 14);
        Human passenger2 = new Passenger("Magerer Marvin", 19);

        flightsystem.getPassengerList().add(passenger1);
        flightsystem.getPassengerList().add(passenger2);

        // when
        flightsystem.printPassengerList(crewMember);

    }

    @Test(expected = InvalidAccessException.class)
    public void testPrintPassengerList_passenger() throws InvalidAccessException {

        // given
        Flightsystem flightsystem = new Flightsystem();
        Human pilot = new Pilot("Timmy", 9);
        Human crewMember = new CrewMember("Tommy", 25);
        Human passenger1 = new Passenger("Hungriger Hugo", 14);
        Human passenger2 = new Passenger("Magerer Marvin", 19);

        flightsystem.getPassengerList().add(passenger1);
        flightsystem.getPassengerList().add(passenger2);
        
        // when
        flightsystem.printPassengerList(passenger1);

    }

    @Test
    public void testPrintPassengerList_emptyList() throws InvalidAccessException {

        // given
        Flightsystem flightsystem = new Flightsystem();
        Human pilot = new Pilot("Timmy", 9);
        Human crewMember = new CrewMember("Tommy", 25);
        Human passenger1 = new Passenger("Hungriger Hugo", 14);
        Human passenger2 = new Passenger("Magerer Marvin", 19);

        // when
        flightsystem.printPassengerList(crewMember);

    }

}