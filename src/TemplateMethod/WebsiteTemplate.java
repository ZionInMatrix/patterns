package TemplateMethod;

public abstract class WebsiteTemplate {
    public void showPage() {
        System.out.println("Header");
        System.out.println("Footer");
    }
    public abstract void showPageContent();
}
