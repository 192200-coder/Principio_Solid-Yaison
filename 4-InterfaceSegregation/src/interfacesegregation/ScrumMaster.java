//  ScrumMaster.java
package interfacesegregation;

import interfacesegregation.Interface.IPlannable;
import interfacesegregation.Interface.ITestable;
import interfacesegregation.Interface.IWorkable;

public class ScrumMaster implements IWorkable, IPlannable, ITestable {

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
        System.out.println("I'm helping with development tasks");
    }

    @Override
    public void test() {
        System.out.println("I'm coordinating the application tests");
    }
}