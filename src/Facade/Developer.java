package Facade;

public class Developer {
    public void doJobBeForeDeadLine(BugTracker bugTracker) {
        if (bugTracker.isActiveSprint()){
            System.out.println("Developer is solving problems...");
        } else {
            System.out.println("Developer fs reading Habrahabr...");
        }
    }
}
