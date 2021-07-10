package lesson1;

public class Main {
    public static void main(String[] args) {
        User u1 = new User();
        u1.id = 1;
        u1.login = "Jhon Archer";
        u1.password = "qwerty";
        u1.age = 17;
        u1.sex = "male";
        u1.weight = 65.4F;
        u1.height = 171.5;
        u1.isActive = true;
        u1.specialSymbol = '$';

        System.out.println(u1);

        User user2 = new User(2, "kokos", "123", (byte) 25, "male", 35.5F, 165.4, true, '&');
        System.out.println(user2);
    }


}
