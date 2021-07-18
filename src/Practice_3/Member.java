package Practice_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Member {

    private int id;
    private String name;
    private int age;
    private List<Animal> animalList = new ArrayList<>();

    public Member() {
    }

    public Member(int id, String name, int age, List<Animal> animalList) {
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
        Member member = (Member) o;
        return id == member.id && age == member.age && Objects.equals(name, member.name) && Objects.equals(animalList, member.animalList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, age, animalList);
    }

    @Override
    public String toString() {
        return "Member{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", animalList=" + animalList +
                '}';
    }
}