//  Tester.java
package interfacesegregation;

import interfacesegregation.Interface.ITestable;

public class Tester implements ITestable {

    public Tester() {
    }

    @Override
    public void test() {
        System.out.println("I'm testing the application code");
    }
}