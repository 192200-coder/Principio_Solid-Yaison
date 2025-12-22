package interfacesegregation;

public class ScrumMaster implements IActivities {

    public ScrumMaster() {
    }

    @Override
    public void plan() {
        System.out.println("I'm planning user stories");
    }

    @Override
    public void comunicate() {
        System.out.println("I'm talking to the team user");
    }

    @Override
    public void design() {
        System.out.println("I'm designing new features");
    }

    @Override
    public void develop() {
        System.out.println("I'm developing the functionalities required");
    }

    @Override
    public void test() {
        System.out.println("I'm testing the application");
    }
}
