package building;

public abstract class Building {
    private double price;
    private double sqmtr;
    private int rooms;
    private int halls;

    public Building(double price, double sqmtr, int rooms, int halls) {
        this.price = price;
        this.sqmtr = sqmtr;
        this.rooms = rooms;
        this.halls = halls;
    }

    public int getHalls() {
        return halls;
    }

    public void setHalls(int halls) {
        this.halls = halls;
    }

    public int getRooms() {
        return rooms;
    }

    public void setRooms(int rooms) {
        this.rooms = rooms;
    }

    public double getSqmtr() {
        return sqmtr;
    }

    public void setSqmtr(double sqmtr) {
        this.sqmtr = sqmtr;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
