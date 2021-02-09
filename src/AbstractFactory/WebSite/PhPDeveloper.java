package AbstractFactory.WebSite;

import AbstractFactory.Developer;

public class PhPDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Php developer writes php code...");
    }
}
