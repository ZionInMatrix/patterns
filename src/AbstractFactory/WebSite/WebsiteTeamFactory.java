package AbstractFactory.WebSite;

import AbstractFactory.Developer;
import AbstractFactory.ProjectManager;
import AbstractFactory.ProjectTeamFactory;
import AbstractFactory.Tester;

public class WebsiteTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new PhPDeveloper();
    }

    @Override
    public Tester getTester() {
        return new ManualTester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new WebSitePM();
    }
}
