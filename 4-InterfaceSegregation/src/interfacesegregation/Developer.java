//  Developer.java
package interfacesegregation;

import interfacesegregation.Interface.IWorkable;

public class Developer implements IWorkable {

    public Developer() {
    }

    @Override
    public void develop() {
        System.out.println("I'm developing the functionalities required");
    }
}