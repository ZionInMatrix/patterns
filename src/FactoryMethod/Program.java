package FactoryMethod;

public class Program {
    public static void main(String[] args) {
        DeveloperFactory developerFactory = createDeveloperBySpecialty("Bora");
        Developer developer = developerFactory.createDeveloper();

        developer.writeCode();

    }

    static DeveloperFactory createDeveloperBySpecialty(String speciality) {
        if (speciality.equalsIgnoreCase("java")) {
            return new JavaDeveloperFactory();
        } else if (speciality.equalsIgnoreCase("c++")) {
            return new CppDeveloperFactory();
        } else if (speciality.equalsIgnoreCase("php")) {
            return new PhpDeveloperFactory();
        } else {
            throw new RuntimeException(speciality + " fs unknown speciality");
        }
    }
}

