package my.design.patterns.structural.composite;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CabinetTest {

    @Test
    public void testAmount() throws Exception {
        Cabinet cabinet = new Cabinet("cabinet");
        cabinet.setNetPrice(new Currency(100));

        assertEquals(100, cabinet.getNetPrice().getAmount());
        assertEquals(100, cabinet.getNetPrice().getAmount());

    }


    @Test
    public void testAdd() throws Exception {
        Cabinet cabinet = new Cabinet("cabinet");
        cabinet.setNetPrice(new Currency(100));

        Chassis chassis = new Chassis("chassis");
        chassis.setNetPrice(new Currency(50));
        cabinet.add(chassis);

        assertEquals(150, cabinet.getNetPrice().getAmount());

        Bus bus = new Bus("Bus");
        bus.setNetPrice(new Currency(25));
        chassis.add(bus);

        assertEquals(175, cabinet.getNetPrice().getAmount());

        FloppyDisk floppy = new FloppyDisk("floppy");
        floppy.setNetPrice(new Currency(10));
        chassis.add(floppy);

        assertEquals(185, cabinet.getNetPrice().getAmount());
    }


    @Test
    public void testRemove() throws Exception {
        Cabinet cabinet = new Cabinet("cabinet");
        cabinet.setNetPrice(new Currency(100));

        Chassis chassis = new Chassis("chassis");
        chassis.setNetPrice(new Currency(50));
        cabinet.add(chassis);

        Bus bus = new Bus("Bus");
        bus.setNetPrice(new Currency(25));
        chassis.add(bus);

        FloppyDisk floppy = new FloppyDisk("floppy");
        floppy.setNetPrice(new Currency(10));
        chassis.add(floppy);

        chassis.remove(bus);

        assertEquals(160, cabinet.getNetPrice().getAmount());
    }


}