package Try2.Practice_5;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {


        List<Computer> computerList = new ArrayList<>();

        computerList.add(new Computer("Asus ROG Strix G17", LocalDate.of(2020, 1, 1), 4, 31000, new HardDrive("Seagate BarraCuda", HardDriveType.HDD, 1000, Countries.China), new Processor("AMD Ryzen 5 5600H", 8, 4.2, Countries.China)));
        computerList.add(new Computer("Acer Extensa", LocalDate.of(2021, 2, 2), 5, 15000, new HardDrive("Western Digital Blue", HardDriveType.HDD, 1000, Countries.India), new Processor("Intel Pentium Gold", 10, 3.6, Countries.India)));
        computerList.add(new Computer("ASUS VivoBook", LocalDate.of(2018, 3, 3), 6, 16000, new HardDrive("Toshiba P300", HardDriveType.HDD, 1000, Countries.Korea), new Processor("AMD Ryzen 3", 7, 3.5, Countries.India)));
        computerList.add(new Computer("Lenovo S400", LocalDate.of(2019, 4, 4), 4, 20000, new HardDrive("ADATA DashDrive Durable", HardDriveType.SSD, 512, Countries.China), new Processor("Intel Core i7", 7, 3.6, Countries.Korea)));
        computerList.add(new Computer("CHUWI LapBook PRO", LocalDate.of(2020, 5, 5), 5, 22000, new HardDrive("Apacer AC236", HardDriveType.HDD, 4000, Countries.USA), new Processor("Intel Core i5", 8, 4.0, Countries.USA)));
        computerList.add(new Computer("Lenovo IdeaPad", LocalDate.of(2021, 6, 6), 6, 23000, new HardDrive("Seagate", HardDriveType.SSD, 6000, Countries.USA), new Processor("Intel Core i6", 8, 3.5, Countries.China)));
        computerList.add(new Computer("Asus X553S", LocalDate.of(2020, 7, 7), 4, 24000, new HardDrive("Western Digital", HardDriveType.HDD, 6000, Countries.Korea), new Processor("Intel Core i7", 6, 3, Countries.China)));
        computerList.add(new Computer("HP Laptop 15s-fq0011ua Silver", LocalDate.of(2020, 8, 8), 5, 17999, new HardDrive("Seagate SkyHawk", HardDriveType.SSD, 512, Countries.China), new Processor("Intel Core i6", 5, 2.5, Countries.India)));
        computerList.add(new Computer("Lenovo ideapad 100s-14IBR Refurbished", LocalDate.of(2017, 9, 9), 6, 15000, new HardDrive("Seagate IronWolf", HardDriveType.HDD, 512, Countries.Korea), new Processor("Intel Core i7", 6, 2.5, Countries.China)));
        computerList.add(new Computer("Asus R540SA Refurbished", LocalDate.of(2015, 10, 10), 4, 16000, new HardDrive("Western Digital Purple", HardDriveType.SSD, 512, Countries.Korea), new Processor("Intel Core i8", 6, 2.0, Countries.China)));
        computerList.add(new Computer("ASUS ZenBook", LocalDate.of(2009, 11, 11), 3, 17000, new HardDrive("Toshiba Enterprise Performance", HardDriveType.HDD, 512, Countries.Korea), new Processor("AMD Ryzen 5", 7, 3.5, Countries.USA)));
        computerList.add(new Computer("LENOVO IdeaPad 5", LocalDate.of(2000, 12, 12), 5, 21000, new HardDrive("Toshiba High-Performance X300", HardDriveType.SSD, 512, Countries.China), new Processor("Intel Core i5", 9, 4.0, Countries.USA)));
        computerList.add(new Computer("Asus ZenBook 14", LocalDate.of(2005, 2, 13), 4, 14000, new HardDrive("Seagate BarraСuda", HardDriveType.HDD, 512, Countries.USA), new Processor("AMD Ryzen 9", 6, 3.0, Countries.India)));
        computerList.add(new Computer("Asus ZenBook 17", LocalDate.of(2004, 3, 14), 5, 15000, new HardDrive("Seagate Expansion", HardDriveType.HDD, 512, Countries.Korea), new Processor("AMD Ryzen 7", 7, 3.0, Countries.India)));
        computerList.add(new Computer("HP Laptop 15s", LocalDate.of(2017, 4, 15), 6, 16000, new HardDrive("Seagate SkyHawk", HardDriveType.SSD, 256, Countries.China), new Processor("AMD Ryzen 8", 4, 2.5, Countries.Korea)));
        computerList.add(new Computer("Acer Aspire 5", LocalDate.of(2018, 5, 16), 7, 17000, new HardDrive("Seagate SkyHawk", HardDriveType.HDD, 750, Countries.India), new Processor("AMD Ryzen 9", 8, 3.0, Countries.Korea)));
        computerList.add(new Computer("Asus Laptop M515UA-BQ387", LocalDate.of(2019, 6, 17), 4, 16000, new HardDrive("Western Digital Purple", HardDriveType.SSD, 512, Countries.India), new Processor("Intel Core i7", 8, 3.5, Countries.China)));
        computerList.add(new Computer("Acer Spin 1", LocalDate.of(2020, 7, 18), 5, 14000, new HardDrive("Seagate BarraCuda", HardDriveType.SSD, 512, Countries.USA), new Processor("Intel Core i9", 7, 3.0, Countries.China)));
        computerList.add(new Computer("Acer Spin 2", LocalDate.of(2021, 8, 19), 6, 15000, new HardDrive("Western Digital", HardDriveType.SSD, 128, Countries.China), new Processor("Intel Core i7", 5, 2.5, Countries.China)));
        computerList.add(new Computer("Acer Spin 3", LocalDate.of(2022, 9, 20), 7, 20000, new HardDrive("Apacer AC236", HardDriveType.SSD, 333, Countries.USA), new Processor("AMD Ryzen 5", 3, 1.5, Countries.China)));

//        computerList.forEach(System.out::println);
//        System.out.println("________________________________________________________");


//        1. Знайти всі комп'ютери які мають рік випуску більше ніж 2010
        final List<Computer> newComputers = computerList.stream()
                .filter(computer -> computer.getYear().getYear() > 2010)
                .collect(Collectors.toList());
        newComputers.forEach(System.out::println);

//        2. Знайти всі комп'ютери які мають рік випуску більше ніж 2010
//        та країну виробник SSD Китай
        computerList.stream()
                .filter(computer -> computer.getYear().getYear() > 2010)
                .filter(computer -> computer.getHardDrive().getType() == HardDriveType.SSD)
                .filter(computer -> computer.getHardDrive().getCountry() == Countries.China)
                .forEach(System.out::println);

//        3. Знайти всі комп'ютери які мають рік випуску більше ніж 2010
//        та країну виробник дисків не Китай
        computerList.stream()
                .filter(computer -> computer.getYear().getYear() > 2010)
                .filter(computer -> computer.getHardDrive().getCountry() != Countries.China)
                .forEach(System.out::println);

//        4. Знайти всі комп'ютери які мають жорсткий диск більше 500гб
        computerList.stream()
                .filter(computer -> computer.getHardDrive().getVolume() > 500)
                .forEach(System.out::println);

//        5. Знайти всі комп'ютери які мають жорсткий ссд диск більше 500гб та процессор і7
        computerList.stream()
                .filter(computer -> computer.getHardDrive().getType() == HardDriveType.SSD)
                .filter(computer -> computer.getHardDrive().getVolume() > 500)
                .filter(computer -> computer.getProcessor().getType().contains("i7"))
                .forEach(System.out::println);

//        6. Знайти всі комп'ютери які мають жорсткий ссд диск більше 500гб
//        та процессор і7 посортувати за ціною
        computerList.stream()
                .filter(computer -> computer.getProcessor().getType().contains("i7"))
                .filter(computer -> computer.getHardDrive().getType() == HardDriveType.SSD)
                .filter(computer -> computer.getHardDrive().getVolume() > 500)
                .sorted((o1, o2) -> (int) (o1.getPrice() - o2.getPrice()))
                .forEach(System.out::println);
    }
}
