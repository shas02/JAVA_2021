package Practice_3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Member> memberList = new ArrayList<>();

        Member John = new Member(1, "John", 35, new ArrayList<Animal>());
        Member Ivan = new Member(2, "Ivan", 25, new ArrayList<Animal>());
        Member Marusya = new Member(3, "Marusya", 20, new ArrayList<Animal>());
        Member Anna = new Member(4, "Anna", 23, new ArrayList<Animal>());

        Animal Rex = new Animal(1, "Rex", "dog");
        Animal Murka = new Animal(1, "Murka", "cat");
        Animal Patron = new Animal(1, "Patron", "dog");

        John.getAnimalList().add(Rex);
        Ivan.getAnimalList().add(Murka);
        Marusya.getAnimalList().add(Patron);

        memberList.add(John);
        memberList.add(Ivan);
        memberList.add(Marusya);
        memberList.add(Anna);


        Scanner scannerString = new Scanner(System.in);
        Scanner scannerInt = new Scanner(System.in);

        System.out.println("Вітаємо вас у Зооклубі!");
        for (Member member : memberList) {
            System.out.println(member);
        }
        System.out.println(" ");
        System.out.println("Якщо ви хочете створити нового члена клубу натисність 1");
        System.out.println("Якщо ви хочете додати тваринку до учасника клубу натисність 2");
        System.out.println("Якщо ви хочете видалити тваринку з власникa натисність 3");
        System.out.println("Якщо ви хочете видалити учасника клубу натисність 4");
        System.out.println("Якщо ви хочете вивести усіх тваринок конкретного власника натисність 5");
        System.out.println("Якщо ви хочете вивести на екран зооклуб натисність 6");

        int decision = scannerInt.nextInt();

        if (decision == 1) {

            System.out.println("Введіть id нового члена клубу: ");
            int id = scannerInt.nextInt();

            System.out.println("Введіть ім'я нового члена клубу: ");
            String name = scannerString.nextLine();

            System.out.println("Введіть вік нового члена клубу: ");
            int age = new Scanner(System.in).nextInt();

            System.out.println("Введіть id тварини: ");
            int animalId = scannerInt.nextInt();

            System.out.println("Введіть ім'я тварини: ");
            String animalName = scannerString.nextLine();

            System.out.println("Введіть тип тварини: ");
            String animalSpecies = scannerString.nextLine();

            scannerString.close();
            scannerInt.close();

            List<Animal> animalList = new ArrayList<>();
            animalList.add(new Animal(animalId, animalName, animalSpecies));

            memberList.add(new Member(id, name, age, animalList));
            System.out.println("Ви успішно додали нового члена клубу!");
//            System.out.println("id: " + id + ", ім'я: " + name + ", вік: " + age + ", ім'я тварини: " + animalName + ", тип тварини: " + animalSpecies);
            for (Member member : memberList) {
                System.out.println(member);
            }
        }

//        додати тваринку до учасника клубу
        if (decision == 2) {
            for (Member member : memberList) {
                System.out.println(member);
            }
            System.out.println("Вкажіть id необхідного члена клубу");
            int id = scannerInt.nextInt();

            for (Member member : memberList) {
                if (member.getId() == id) {
                    System.out.println(member);

                    System.out.println("Введіть id тварини: ");
                    int animalId = scannerInt.nextInt();

                    System.out.println("Введіть ім'я тварини: ");
                    String animalName = scannerString.nextLine();

                    System.out.println("Введіть тип тварини: ");
                    String animalSpecies = scannerString.nextLine();

                    scannerString.close();
                    scannerInt.close();

                    member.getAnimalList().add((new Animal(animalId, animalName, animalSpecies)));
                    System.out.println("Ви успішно додали нову тварину");
                    System.out.println(member);
                }
            }
        }

//        видалити тваринку з власника
        if (decision == 3) {
            for (Member member : memberList) {
                System.out.println(member);
            }
            System.out.println("Вкажіть id необхідного члена клубу");
            int id = scannerInt.nextInt();

            for (Member member : memberList) {
                if (member.getId() == id) {
                    System.out.println(member);
                    System.out.println("Введіть id тварини: ");
                    int animalId = scannerInt.nextInt();

                    scannerInt.close();

                    final Iterator<Animal> iterator = member.getAnimalList().iterator();
                    while (iterator.hasNext()) {
                        final Animal animal = iterator.next();
                        if (animal.getId() == animalId) {
                            iterator.remove();
                            System.out.println("Ви успішно видалили тварину");
                            System.out.println(member);
                        }
                    }
                }
            }
        }

//        видалити учасника клубу
        if (decision == 4) {
            for (Member member : memberList) {
                System.out.println(member);
            }
            System.out.println("Вкажіть id необхідного члена клубу");
            int id = scannerInt.nextInt();

            scannerInt.close();

            final Iterator<Member> iterator = memberList.iterator();
            while (iterator.hasNext()) {
                final Member member = iterator.next();
                if (member.getId() == id) {
                    iterator.remove();
                    System.out.println("Ви успішно видалили учасника клубу");
                    for (Member member1 : memberList) {
                        System.out.println(member1);
                    }
                }
            }
        }

//        вивести усіх тваринок конкретного власника
        if (decision == 5) {
            System.out.println(memberList);
            System.out.println("Вкажіть id необхідного члена клубу");
            int id = scannerInt.nextInt();

            scannerInt.close();

            for (Member member : memberList) {
                if (member.getId() == id) {
                    System.out.println(member.getAnimalList());
                }
            }
        }

//        вивести на екран зооклуб.
        if (decision == 6) {
            for (Member member : memberList) {
                System.out.println(member);
            }
        }
    }
}


