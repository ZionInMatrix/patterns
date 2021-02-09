package Proxy;

public class ProjectRunner {
    public static void main(String[] args) {
        Project project = new ProxyProject("https:///wwww.github/proselyater/realProject");
        project.run();
    }
}
