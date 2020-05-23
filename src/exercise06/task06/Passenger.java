package exercise06.task06;

import org.jetbrains.annotations.NotNull;

public class Passenger implements Comparable<Passenger> {
    private String name;
    private Integer age;

    public Passenger(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }


    @Override
    public String toString() {
        return "Passenger: " + name + ", age " + age;
    }

    @Override
    public int compareTo(@NotNull Passenger o) {
        return age.compareTo(o.getAge());
    }
}
