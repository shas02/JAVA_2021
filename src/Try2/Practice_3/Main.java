package Try2.Practice_3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        List<Person> clubMembers = new ArrayList<>();

        Person Anna = new Person(1, "Anna Petrivna", 83);
        Person Peter = new Person(2, "Peter", 12);
        Person Anatoliy = new Person(3, "Anatoliy", 25);
        Person Olga = new Person(4, "Olga", 34);
        Person Polina = new Person(5, "Polina", 40);
        Person Lina = new Person(6, "Lina", 30);
        Person Arthur = new Person(7, "Arthur", 40);

        Animal Dick = new Animal(1, "Dick", "dog");
        Animal Murka = new Animal(1, "Murka", "cat");
        Animal Moska = new Animal(1, "Moska", "fly");
        Animal Cunni = new Animal(1, "Cunni", "rabbit");
        Animal Monya = new Animal(1, "Monya", "turtle");
        Animal Ponya = new Animal(1, "Ponya", "turtle");

        Anna.getAnimalList().add(Dick);
        Peter.getAnimalList().add(Murka);
        Anatoliy.getAnimalList().add(Moska);
        Olga.getAnimalList().add(Cunni);
        Lina.getAnimalList().add(Monya);
        Arthur.getAnimalList().add(Ponya);

        clubMembers.add(Anna);
        clubMembers.add(Peter);
        clubMembers.add(Anatoliy);
        clubMembers.add(Olga);
        clubMembers.add(Polina);
        clubMembers.add(Lina);
        clubMembers.add(Arthur);

        Scanner scannerString = new Scanner(System.in);
        Scanner scannerInt = new Scanner(System.in);

        System.out.println("Вітаємо вас у Зооклубі 'Семеро козенят'!");
        System.out.println(" ");

        for (Person clubMember : clubMembers) {
            System.out.println(clubMember);
        }

        System.out.println(" ");
        System.out.println("Якщо ви хочете створити нового члена клубу натисність 1");
        System.out.println("Якщо ви хочете додати тваринку до учасника клубу натисність 2");
        System.out.println("Якщо ви хочете видалити тваринку з власникa натисність 3");
        System.out.println("Якщо ви хочете видалити учасника клубу натисність 4");
        System.out.println("Якщо ви хочете вивести усіх тваринок конкретного власника натисність 5");
        System.out.println("Якщо ви хочете вивести на екран зооклуб натисність 6");

        int decision = scannerInt.nextInt();

        //        1) додати учасника в клуб;
        if (decision == 1) {
            System.out.println("Введіть id нового члена клубу");
            int id = scannerInt.nextInt();

            System.out.println("Введіть ім'я нового члена клубу");
            String name = scannerString.nextLine();

            System.out.println("Введіть вік нового члена клубу");
            int age = scannerInt.nextInt();

            System.out.println("Введіть id домашнього улюбленця");
            int idPet = scannerInt.nextInt();

            System.out.println("Введіть ім'я домашнього улюбленця");
            String namePet = scannerString.nextLine();

            System.out.println("Введіть вид домашнього улюбленця");
            String speciesPet = scannerString.nextLine();

            scannerInt.close();
            scannerString.close();

            List<Animal> animalList = new ArrayList<>();
            animalList.add(new Animal(idPet, namePet, speciesPet));

            clubMembers.add(new Person(id, name, age, animalList));

            System.out.println("Ви успішно дадали нового члена клубу");

            for (Person clubMember : clubMembers) {
                System.out.println(clubMember);
            }

        }

        //        2) додати тваринку до учасника клубу.
        if (decision == 2) {

            for (Person clubMember : clubMembers) {
                System.out.println(clubMember);
            }

            System.out.println("Введіть id необхідного члена клубу");

            int id = scannerInt.nextInt();

            for (Person clubMember : clubMembers) {
                if (clubMember.getId() == id) {

                    System.out.println(clubMember);

                    System.out.println("Введіть id домашнього улюбленця");
                    int idPet = scannerInt.nextInt();

                    System.out.println("Введіть ім'я домашнього улюбленця");
                    String namePet = scannerString.nextLine();

                    System.out.println("Введіть вид домашнього улюбленця");
                    String speciesPet = scannerString.nextLine();

                    scannerInt.close();
                    scannerString.close();

                    Animal newPet = new Animal(idPet, namePet, speciesPet);

                    clubMember.getAnimalList().add(newPet);

                    System.out.println("Ви успішно дадали домашнього улюбленця");

                    System.out.println(clubMember);

                    return;
                }
            }
            System.out.println("Члена клубу з таким id немає");
        }


        //        3) видалити тваринку з власника.
        if (decision == 3) {
            for (Person clubMember : clubMembers) {
                System.out.println(clubMember);
            }

            System.out.println("Введіть id необхідного члена клубу");

            int id = scannerInt.nextInt();

            for (Person clubMember : clubMembers) {
                if (clubMember.getId() == id) {

                    System.out.println(clubMember);

                    System.out.println("Введіть id домашнього улюбленця, якого хочете видалити");
                    int idPet = scannerInt.nextInt();

                    scannerInt.close();

                    final Iterator<Animal> iterator = clubMember.getAnimalList().iterator();
                    while (iterator.hasNext()) {
                        final Animal pet = iterator.next();
                        if (pet.getId() == idPet) {
                            iterator.remove();
                            System.out.println("Ви успішно видалили домашнього улюбленця");
                            System.out.println(clubMember);
                            return;
                        }
                        System.out.println("Домашнього улюбленця з таким id немає");
                    }
                    return;
                }
            }
            System.out.println("Члена клубу з таким id немає");
        }

        //        4) видалити учасника клубу.
        if (decision == 4) {
            for (Person clubMember : clubMembers) {
                System.out.println(clubMember);
            }

            System.out.println("Введіть id необхідного члена клубу");

            int id = scannerInt.nextInt();
            scannerInt.close();

            final Iterator<Person> iterator = clubMembers.iterator();
            while (iterator.hasNext()) {
                final Person member = iterator.next();
                if (member.getId() == id) {
                    iterator.remove();

                    System.out.println("Ви успішно видалили учасника клубу");

                    for (Person clubMember : clubMembers) {
                        System.out.println(clubMember);
                    }

                    return;
                }
            }
            System.out.println("Члена клубу з таким id немає");
        }

        //        5) вивести усіх тваринок конкретного власника
        if (decision == 5) {
            for (Person clubMember : clubMembers) {
                System.out.println(clubMember);
            }

            System.out.println("Введіть id необхідного члена клубу");

            int id = scannerInt.nextInt();
            scannerInt.close();

            for (Person clubMember : clubMembers) {
               if (clubMember.getId() == id) {
                   System.out.println(clubMember.getAnimalList());
                   return;
               }
            }
            System.out.println("Члена клубу з таким id немає");
        }

        //        6) вивести на екран зооклуб.
        if (decision == 6) {
            for (Person clubMember : clubMembers) {
                System.out.println(clubMember);
            }
        }
    }
}
