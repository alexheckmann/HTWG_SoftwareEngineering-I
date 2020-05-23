package exercise01.task02;

public class FruitsDb implements Database {
    private String[] content = {"Apple", "Orange", "Peach"};

    @Override
    public void search(String stringToSearchFor) {
        for (int i = 0; i < content.length; i++) {
            if (stringToSearchFor.toLowerCase().equals(content[i].toLowerCase())) {
                System.out.println(stringToSearchFor + " found");
                return;
            }
        }
        System.out.println(stringToSearchFor + " not found");
    }
}
