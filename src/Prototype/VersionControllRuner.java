package Prototype;

public class VersionControllRuner {
    public static void main(String[] args) {
        Project master = new Project(1, "SuperProject", "SourceCode sourceCode = new SourceCode();\n");

        System.out.println(master);

        ProjectFactory factory = new ProjectFactory(master);
        Project masterClone = factory.cloneProject();

        System.out.println(masterClone);
    }
}
