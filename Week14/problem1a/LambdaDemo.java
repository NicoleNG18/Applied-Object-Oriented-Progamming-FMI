package problem1a;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class LambdaDemo {
    static void main() {
        Predicate<Salesperson> predicate1 = salesperson -> salesperson.getNumSales() > 1200;
        Predicate<Salesperson> predicate2 = salesperson -> salesperson.getSalary() > 900;
        Predicate<Salesperson> predicate = salesperson -> predicate1.and(predicate2).test(salesperson);
        Consumer<Salesperson> consumer1 = salesperson -> {
            salesperson.addBonus(0.05 * salesperson.getSalary());
            System.out.println("Consumer1: %n");
            System.out.println(salesperson);
            System.out.println();
        };
        Consumer<Salesperson> consumer2 = salesperson -> {
            if (predicate1.test(salesperson)) {
                salesperson.addBonus(0.02 * salesperson.getSalary());
            } else {
                salesperson.addBonus(-0.02 * salesperson.getSalary());
            }
            System.out.println("Consumer2: %n");
            System.out.println(salesperson);
            System.out.println();
        };
        Comparator<Salesperson> comparator1 = (salesperson1, salesperson2) ->
                Double.compare(salesperson2.getSalary(), salesperson1.getSalary());
        Comparator<Salesperson> comparator2 = (salesperson1, salesperson2) -> {
            int resultBySalary = comparator1.compare(salesperson1, salesperson2);
            if (resultBySalary != 0) {
                return resultBySalary;
            } else {
                return salesperson1.getNumSales() - salesperson2.getNumSales();
            }
        };
        Salesperson[] salespersons =
                {
                        new Salesperson("Alice Adams", 2500, 800),
                        new Salesperson("Andrew Alvarez", 3100, 1200),
                        new Salesperson("Arthur Asher", 2800, 950),
                        new Salesperson("Bob Bradley", 2200, 600),
                        new Salesperson("Barbara Bennett", 4100, 1800),
                        new Salesperson("Charlie Clark", 3500, 1400),
                        new Salesperson("Chloe Carter", 3900, 1500),
                        new Salesperson("Connor Cole", 2900, 1100),
                        new Salesperson("David Dawson", 3200, 1300),
                        new Salesperson("Diana Drake", 4500, 2100),
                        new Salesperson("John Doe", 2000, 949),
                        new Salesperson("Jane Davis", 3900, 1500),
                        new Salesperson("James Jordan", 3600, 1350)
                };
        List<Salesperson> listOfSalespersons = new ArrayList<>(Arrays.asList(salespersons));
        for (Salesperson salesperson : salespersons) {
            applyBonus(salesperson, predicate1, consumer1);
            System.out.println("Apply bonus1: %n");
            System.out.println(salesperson);
            System.out.println("Num sales: %n");
            salesperson.printNumSales(salesperson);

        }
        for (Salesperson salesperson : salespersons) {
            System.out.println("Apply bonus2: %n");
            applyBonus(salesperson, predicate2, consumer2);
            System.out.println(salesperson);
        }
        sort(listOfSalespersons, comparator1);
        System.out.println("SP1: %n");
        System.out.println(listOfSalespersons);
        System.out.println("SP2: %n");
        sort(listOfSalespersons, comparator2);
        System.out.println(listOfSalespersons);

    }

    public static void applyBonus(Salesperson salesperson,
                                  Predicate<Salesperson>
                                          predicate,
                                  Consumer<Salesperson> consumer) {
        if (predicate.test(salesperson)) {
            consumer.accept(salesperson);
        }
    }

    public static void applyBonus(List<Salesperson> salespersons,
                                  Predicate<Salesperson>
                                          predicate,
                                  Consumer<Salesperson> consumer) {
        salespersons.forEach((salesperson) -> applyBonus(salesperson, predicate, consumer));
    }

    public static void sort(List<Salesperson> salespersons,
                            Comparator<Salesperson>
                                    comparator) {
        salespersons.sort(comparator);
    }

    public static void group(List<Salesperson> salespersons) {
        Map<Character, List<Salesperson>> sp = salespersons.stream().collect(Collectors.groupingBy(salesperson -> salesperson.getName().charAt(0)));

        for (Character group : sp.keySet()) {
            System.out.printf("%c -> %s%n", group, sp.get(group));
        }
    }
}