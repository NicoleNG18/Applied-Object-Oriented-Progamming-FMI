package problem6;

import java.util.*;

public class Main {
    static void main() {
        TreeMap<String, String> teams=new TreeMap<>();
        teams.put("San Francisco", "Forty-niners");
        teams.put("Chicago", "Bears");
        teams.put("Denver", "Broncos");
        teams.put("Seattle", "Seahawks");
        teams.put("Detroit", "Lions");
        teams.put("Miami", "Dolphins");

        int totalTeams = teams.size();
        System.out.printf("Count: %s%n" , totalTeams);

        String chicagoTeam = teams.get("Chicago");
        System.out.printf("Team from Chicago: %s%n" , chicagoTeam);

        teams.put("San Francisco", "Niners");

        boolean hasSanDiego = teams.containsKey("San Diego");
        System.out.printf("has team: %s%n",hasSanDiego);

        teams.remove("Denver");

        teams.put("Dallas", "Cowboys");

        System.out.println("Curr map: ");
        for (Map.Entry<String, String> entry : teams.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
        System.out.println();

        System.out.println("desc sorted:");

        ArrayList<Map.Entry<String, String>> list = new ArrayList<>(teams.entrySet());
        Collections.sort(list, (entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()));

        for (Map.Entry<String, String> entry : list) {
            System.out.println(entry.getValue() + ", " + entry.getKey());
        }
    }
}
