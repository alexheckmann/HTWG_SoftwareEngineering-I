package exercise01.task05;

public abstract class Role {
    private String name;
    private int age;

    public Role(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract void getDetails();
}
