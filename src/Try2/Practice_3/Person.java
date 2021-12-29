package Try2.Practice_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Person {
    private int id;
    private String name;
    private int age;
    private List<Animal> animalList = new ArrayList<>();

    public Person() {
    }

    public Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public Person(int id, String name, int age, List<Animal> animalList) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.animalList = animalList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Animal> getAnimalList() {
        return animalList;
    }

    public void setAnimalList(List<Animal> animalList) {
        this.animalList = animalList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id && age == person.age && Objects.equals(name, person.name) && Objects.equals(animalList, person.animalList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, age, animalList);
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", animalList=" + animalList +
                '}';
    }
}
