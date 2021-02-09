package Memento;

public class SaveProjectRunner {
    public static void main(String[] args) {
        Project project = new Project();
        GithubRepo github = new GithubRepo();

        System.out.println("Creating new project. Version 1.0");
        project.setVersionDate("Version 1.0");

        System.out.println(project);

        System.out.println("Save current version to github...");
        System.out.println("Updating project to version 1.1");

        System.out.println("Writing poor code...");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        project.setVersionDate("Version 1.1.");

        System.out.println(project);

        System.out.println("Something went wrong...");

        System.out.println("Rolling back to Version 1.0");
        project.load(github.getSave());

        System.out.println("Project after rollback");
        System.out.println(project);
    }
}
