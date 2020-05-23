package equals.example;

public class Plane {
    private int id;
    private int seats;
    private String engine;

    public Plane(int id, int seats, String engine) {
        this.id = id;
        this.seats = seats;
        this.engine = engine;
    }

    public Plane() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public Plane copy(int id) {
        Plane newPlane = new Plane();
        newPlane.setId(id);
        newPlane.setSeats(this.getSeats());
        newPlane.setEngine(this.getEngine());
        return newPlane;
    }
}
