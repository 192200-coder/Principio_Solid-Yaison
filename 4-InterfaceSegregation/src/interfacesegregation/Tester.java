package interfacesegregation;

public class Tester implements IActivities {

    public Tester() {
    }

    @Override
    public void plan() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void comunicate() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void design() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void develop() {
        System.out.println("I'm developing the functionalities required");
    }

    @Override
    public void test() {
        throw new UnsupportedOperationException();
    }
}
