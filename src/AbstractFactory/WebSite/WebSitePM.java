package AbstractFactory.WebSite;

import AbstractFactory.ProjectManager;

public class WebSitePM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("Website PM manages Website project...");
    }
}
