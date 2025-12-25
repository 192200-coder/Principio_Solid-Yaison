//  Main.java
package interfacesegregation;

public class Main {
    public static void main(String[] args) {
        Developer dev = new Developer();
        Tester tester = new Tester();
        ScrumMaster sm = new ScrumMaster();

        dev.develop(); // Salida: I'm developing...
        tester.test(); // Salida: I'm testing the application (¡Ya no lanza error!)
        sm.plan(); // Salida: I'm planning user stories
    }
}