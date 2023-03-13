public class Main {
    public static void main(String[] args) {
        {
            int salary = 15_000;
            int total = 0;
            int i = 1;
            while (total <= 2_459_000) {
                i++;
                total = total + salary;
                System.out.println("Месяц " + i + " Сумма накоплений " + total);
            }

            System.out.println(

            );
        }
        for (int i = 1; i <= 10; i = i + 1)
            System.out.print(" " + i + " ");
        System.out.println(

        );
        for (int a = 10; a >= 1; a = a - 1)
            System.out.print(" " + a + " ");
        System.out.println(

        );
        {
            int population = 12_000_000;
            int birthRate = (12_000_000 / 1000) * 17;
            int mortality = (12_000_000 / 1000) * 8;
            int populationNext = birthRate - mortality;
            int year = 2023;
            while (year <= 2033) {
                population = population + populationNext;
                year = year + 1;
                System.out.println("Год " + year + ", численность населения составляет " + population + " миллионов человек.");
            }
        }
    }
}

