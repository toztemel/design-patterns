package my.design.patterns.creational.builder.blocks;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tayfuno on 21/11/15.
 */
public class House {
    List rooms;

    public House() {
        rooms = new ArrayList(5);
    }
    public void add(Room room) {
        rooms.add(room);
    }
}
