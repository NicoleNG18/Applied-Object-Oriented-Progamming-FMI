package stream;// Exercise 17.11: ProcessInvoices.java
// Processing Invoices with lambdas and streams.

import java.lang.reflect.AnnotatedArrayType;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ProcessInvoices {
    public static void main(String[] args) {
        Invoice[] invoices = {
                new Invoice(83, "Electric sander", 7, 57.98),
                new Invoice(24, "Power saw", 18, 99.99),
                new Invoice(7, "Sledge hammer", 11, 21.50),
                new Invoice(77, "Hammer", 76, 11.99),
                new Invoice(39, "Lawn mower", 3, 79.50),
                new Invoice(68, "Screwdriver", 106, 6.99),
                new Invoice(56, "Jig saw", 21, 11.00),
                new Invoice(3, "Wrench", 34, 7.50)
        };

        Function<Invoice, Double> getAmountfunction = invoice -> invoice.getQuantity() * invoice.getPrice();

        System.out.println("Invoices sorted by part description:");

        Arrays.stream(invoices)
                .sorted(Comparator.comparing(Invoice::getPartDescription))
                .forEach(System.out::println);

        System.out.printf("%nInvoices sorted by price:%n");

        Arrays.stream(invoices)
                .sorted(Comparator.comparing(Invoice::getPrice))
                .forEach(System.out::println);

        System.out.printf("%nInvoices mapped to description and quantity:%n");

        Arrays.stream(invoices)
                .collect(Collectors.toMap(Invoice::getPartDescription, Invoice::getQuantity))
                .entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .forEach(entry ->
                        System.out.printf("Description %15s Quantity %d %n", entry.getKey(), entry.getValue()));

        System.out.printf("%nInvoices mapped to description and invoice amount:%n");

        Arrays.stream(invoices)
                .collect(Collectors.toMap(Invoice::getPartDescription, getAmountfunction))
                .entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .forEach(entry ->
                        System.out.printf("Description %15s %.2f Amount %n", entry.getKey(), entry.getValue()));

//        Arrays.stream(invoices).sorted(Comparator.comparing(getAmountfunction))
//                .map(invoice
//                        -> String.format("%s %.2f %n",
//                        invoice.getPartDescription(), getAmountfunction.apply(invoice)))
//                .forEach(System.out::println);

        System.out.printf("%nInvoices mapped to description and invoice amount for invoices in the range 200-500:%n");
        Arrays.stream(invoices).sorted(Comparator.comparing(getAmountfunction))
                .filter(invoice -> getAmountfunction.apply(invoice) >= 200 && getAmountfunction.apply(invoice) <= 500)
                .map(invoice
                        -> String.format("Description %15s Amount %.2f %n",
                        invoice.getPartDescription(), getAmountfunction.apply(invoice)))
                .forEach(System.out::println);

        System.out.println("%nInvoices with invoice amount below or equal 300:%n");

        Set<Invoice> below300 = Arrays.stream(invoices)
                .filter(invoice -> getAmountfunction.apply(invoice)<=300)
                .collect(Collectors.toSet());

        below300.forEach(invoice -> System.out.printf("Description %15s Amount%.2f %n",invoice.getPartDescription(),getAmountfunction.apply(invoice)));

        System.out.println("%nInvoices with invoice amount above 300:%n");

        Set<Invoice> above300 = Arrays.stream(invoices)
                .filter(invoice -> getAmountfunction.apply(invoice)>300)
                .collect(Collectors.toSet());

        above300.forEach(invoice -> System.out.printf("Description %15s Amount %.2f %n",invoice.getPartDescription(),getAmountfunction.apply(invoice)));

        System.out.println("%nInvoices with hashcode sorted descending by price:%n");

        Arrays.stream(invoices)
                .collect(Collectors.toMap(invoice -> String.valueOf(invoice.hashCode()),
                        Function.identity()))
                .entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.comparing(Invoice::getPrice).reversed()))
                .forEach(entry ->
                        System.out.printf("Hash code %15s price %.2f %n", entry.getKey(), entry.getValue().getPrice()));

    }
}


