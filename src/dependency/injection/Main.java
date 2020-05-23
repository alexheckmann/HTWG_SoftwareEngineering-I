package dependency.injection;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Read user selection
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word to search for");
        String query = sc.nextLine();
        System.out.println("Enter where to look, 0 = Fruits, 1 = Vegetables");
        int selection = sc.nextInt();

        // write to db
        DbSearch dbSearch;
        if (selection == 0) {
            dbSearch = new DbSearch(new FruitsDb());
        } else {
            dbSearch = new DbSearch(new VegetablesDb());
        }
        dbSearch.searchDb(query);
    }
}
