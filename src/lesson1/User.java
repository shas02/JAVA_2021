package lesson1;

public class User {
    public int id;
    public String login;
    public String password;
    public byte age;
    public String sex;
    public float weight;
    public double height;
    public boolean isActive;
    public char specialSymbol;

    public User() {
    }

    public User(int id, String login, String password, byte age, String sex, float weight, double height, boolean isActive, char specialSymbol) {
        this.id = id;
        this.login = login;
        this.password = password;
        this.age = age;
        this.sex = sex;
        this.weight = weight;
        this.height = height;
        this.isActive = isActive;
        this.specialSymbol = specialSymbol;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", weight=" + weight +
                ", height=" + height +
                ", isActive=" + isActive +
                ", specialSymbol=" + specialSymbol +
                '}';
    }


}






