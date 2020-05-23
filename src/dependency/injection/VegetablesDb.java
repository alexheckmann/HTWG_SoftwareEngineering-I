package dependency.injection;

public class VegetablesDb implements Database {

    private String[] content = {"Tomato", "Onion", "Garlic"};

    @Override
    public void search(String stringToSearchFor) {

        for (String string : content) {
            if (stringToSearchFor.equals(string.toLowerCase())) {
                System.out.println(stringToSearchFor + " found");
                return;
            }
        }
        System.out.println(stringToSearchFor + " not found");

    }
}
