package my.design.patterns.structural.bridge;

/**
 * Created by tayfuno on 21/11/15.
 */
public class WindowSystemFactory {


    private static WindowSystemFactory concreteFactory;

    public static WindowSystemFactory getInstance() {
        if (true)
            concreteFactory = new XWindowFactory();
        else
        concreteFactory = new PMWindowFactor();
        return concreteFactory;
    }

    private WindowSystemFactory() {
    }

    public WindowImp makeWindowImp() {
        return concreteFactory.makeWindowImp();
    }

    private static class PMWindowFactor extends WindowSystemFactory {

        public WindowImp makeWindowImp() {
            return new PMWindowImp();
        }
    }

    private static class XWindowFactory extends WindowSystemFactory {

        public WindowImp makeWindowImp() {
            return new XWindowImp();
        }
    }
}
