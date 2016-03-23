package my.design.patterns.creational.builder.blocks;

/**
 * Created by tayfuno on 21/11/15.
 */
public class Room {
    private Wall north;
    private Wall south;
    private Wall east;
    private Wall west;

    public void setNorth(Wall north) {
        this.north = north;
    }

    public void setSouth(Wall south) {
        this.south = south;
    }

    public void setEast(Wall east) {
        this.east = east;
    }

    public void setWest(Wall west) {
        this.west = west;
    }
}
