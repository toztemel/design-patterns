package my.design.patterns.structural.composite;

/**
 * Created by tayfuno on 23/11/15.
 */
public class Client {

    public static void main(String[] args) {
        Cabinet cabinet = new Cabinet("PC cabinet");
        Chassis chasis = new Chassis("PC chassis");
        cabinet.add(chasis);

        Bus bus = new Bus("MCA Bus");
        bus.add(new Card("16Mbs Token Ring"));

        chasis.add(bus);
        chasis.add(new FloppyDisk("3.5in Floppy"));

        System.out.println("total price:" + cabinet.getNetPrice().getAmount());
    }
}
