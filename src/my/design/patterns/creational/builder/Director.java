package my.design.patterns.creational.builder;

/**
 * Created by tayfuno on 21/11/15.
 */
public class Director {

    private final Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    void constructHouse() {
        builder.buildHouse();

        builder.buildDoor();
        builder.buildRoom();
        builder.buildRoom();
        builder.buildWall();

    }

}
