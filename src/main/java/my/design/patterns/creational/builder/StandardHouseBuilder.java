package my.design.patterns.creational.builder;

import my.design.patterns.creational.builder.blocks.Door;
import my.design.patterns.creational.builder.blocks.House;
import my.design.patterns.creational.builder.blocks.Room;
import my.design.patterns.creational.builder.blocks.Wall;

/**
 * Created by tayfuno on 21/11/15.
 */
public class StandardHouseBuilder implements Builder {

    private House house;

    public StandardHouseBuilder() {
        house = null;
    }

    @Override
    public void buildRoom() {
        Room room = new Room();
        room.setNorth(new Wall());
        room.setSouth(new Wall());
        room.setEast(new Wall());
        room.setWest(new Wall());
        house.add(room);
    }

    @Override
    public void buildWall() {
        Wall wall = new Wall();
    }

    @Override
    public void buildDoor() {
        Door door = new Door();

    }

    @Override
    public House getHouse() {
        return house;
    }

    @Override
    public void buildHouse() {
        house = new House();
    }
}
