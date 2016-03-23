package my.design.patterns.creational.builder;

import my.design.patterns.creational.builder.blocks.House;

/**
 * Created by tayfuno on 21/11/15.
 */
public class Client {

    void testSimpleHouse() {
        Builder builder = new StandardHouseBuilder();
        Director director = new Director(builder);
        director.constructHouse();
        House house = builder.getHouse();
    }

    void testComplex() {
        Builder builder = new ComplexHouseBuilder();
        Director director = new Director(builder);
        director.constructHouse();
        House house = builder.getHouse();
    }
}
