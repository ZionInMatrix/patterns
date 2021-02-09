package Iterator;


public class JavaDeveloperRunner {
    public static void main(String[] args) {
        String[] skills = {"java", "Spring", "Hibernate", "Maven", "PostgreSQL"};

        JavaDeveloper javaDeveloper = new JavaDeveloper("Rudolf Gasparian", skills);

        Iterator iterator = javaDeveloper.getIterator();
        System.out.println("Developer:" + javaDeveloper.getName());
        System.out.println("Skills: ");

        while (iterator.hasNext()) {
            System.out.print(iterator.next().toString() + " ");
        }
    }
}
