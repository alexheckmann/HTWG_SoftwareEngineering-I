package exercise01.task02;

public class DbSearch {

    private Database db;


    public DbSearch(Database db) {
        super();
        this.db = db;
    }

    public void searchDb(String stringToSearchFor) {
        db.search(stringToSearchFor);

    }
}
