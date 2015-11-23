package my.design.patterns.creational.builder;

import my.design.patterns.creational.builder.blocks.House;

/**
 * Created by tayfuno on 21/11/15.
 */
public interface Builder {

    public void buildRoom();

    public void buildWall();

    public void buildDoor();

    public House getHouse();

    public void buildHouse();
}
