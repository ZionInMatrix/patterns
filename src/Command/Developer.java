package Command;

public class Developer {
    Command inserter;
    Command update;
    Command select;
    Command delete;

    public Developer(Command inserter, Command update, Command select, Command delete) {
        this.inserter = inserter;
        this.update = update;
        this.select = select;
        this.delete = delete;
    }

    public void insertRecord() {
        inserter.execute();
    }

    public void updateRecord() {
        update.execute();
    }

    public void selectRecord() {
        select.execute();
    }

    public void deleteRecord() {
        delete.execute();
    }
}
