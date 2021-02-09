package Bridge;


public abstract class Program {
    Developer developer;

    Program(Developer developer) {
        this.developer = developer;
    }
    public abstract void developProgram();
}
