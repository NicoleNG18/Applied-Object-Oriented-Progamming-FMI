package vue;

import java.net.URL;
import java.util.*;

import blogic.Animal;
import blogic.AnimalInstance;
import blogic.AnimalType;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

public class Controller {

    private AnimalInstance[] samples;
    private Animal[] animals;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnDistRegions;

    @FXML
    private Button btnQuit;

    @FXML
    private Button btnShowEndangered;

    @FXML
    private Button btnShowSorted;

    @FXML
    private Button btnShuffle;

    @FXML
    private TextArea txtResults;

    @FXML
    void btnDistributionByRegionsOnAction(ActionEvent event) {
        if (samples == null || animals == null) return;

        String[] regions = Animal.REGIONS;
        int[] counts = new int[regions.length];

        for (AnimalInstance s : samples) {
            int typeIndex = s.getAnimalKey();
            if (typeIndex >= 0 && typeIndex < animals.length) {
                String region = animals[typeIndex].getRegion();

                for (int i = 0; i < regions.length; i++) {
                    if (regions[i].equalsIgnoreCase(region)) {
                        counts[i]++;
                        break;
                    }
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%-15s | %s\n", "Region", "Count of animals"));
        sb.append("------------------------------------------\n");

        for (int i = 0; i < regions.length; i++) {
            sb.append(String.format("%-15s | %d\n", regions[i], counts[i]));
        }

        txtResults.setText(sb.toString());
    }

    @FXML
    void btnQuitOnAction(ActionEvent event) {
        Platform.exit();
    }

    @FXML
    void btnShowEndangeredOnAction(ActionEvent event) {
        if (samples == null || animals == null) return;

        AnimalType[] types = AnimalType.values();
        int[] counts = new int[types.length];

        for (AnimalInstance s : samples) {
            int typeIndex = s.getAnimalKey();

            if (typeIndex >= 0 && typeIndex < animals.length) {
                Animal species = animals[typeIndex];

                if (species.isEndangered()) {
                    AnimalType currentType = species.getAnimalType();

                    int i = 0;
                    for (AnimalType type : types) {
                        if (type == currentType) {
                            counts[i]++;
                            break;
                        }
                        i++;
                    }
                }
            }
        }

        StringBuilder sb = new StringBuilder("""
        Animal Type    | Endangered (count)
        ----------------------------------
        """);

        int i = 0;
        for (AnimalType type : types) {
            sb.append(String.format("%-14s | %d\n", type, counts[i]));
            i++;
        }

        txtResults.setText(sb.toString());
    }

    @FXML
    void btnShowSortedByAgeOnAction(ActionEvent event) {
        if (samples == null || samples.length == 0) {
            txtResults.setText("No data to reveal");
            return;
        }

        Arrays.sort(samples, new Comparator<AnimalInstance>() {
            @Override
            public int compare(AnimalInstance a1, AnimalInstance a2) {
                return Integer.compare(a2.getAnimalAge(), a1.getAnimalAge());
            }
        });

        StringBuilder sb = new StringBuilder();
        for (AnimalInstance instance : samples) {
            sb.append(instance.toString()).append("\n");
        }

        txtResults.setText(sb.toString());
    }

    @FXML
    void btnShuffleSamplesOnAction(ActionEvent event) {
        if (samples == null || samples.length == 0) return;

        List<AnimalInstance> list = Arrays.asList(samples);

        Collections.shuffle(list);

        StringBuilder sb = new StringBuilder();
        for (AnimalInstance s : samples) {
            sb.append(s.toString()).append("\n");
        }

        txtResults.setText(sb.toString());
    }

    @FXML
    void initialize() {
        animals = new Animal[] {
                new Animal("Тигър", AnimalType.MAMMAL, true, "Asia", true),
                new Animal("Фламинго", AnimalType.BIRD, false, "Africa", true),
                new Animal("Гущер", AnimalType.REPTILE, true, "Australia", true),
                new Animal("Пъстърва", AnimalType.FISH, false, "Europe", false),
                new Animal("Делфин", AnimalType.MAMMAL, false, "Australia", true),
                new Animal("Вълк", AnimalType.MAMMAL, true, "America", false)
        };

        samples = new AnimalInstance[20];
        Random rand = new Random();

        for (int i = 0; i < samples.length; i++) {
            int randomIndex = rand.nextInt(animals.length);
            String name = animals[randomIndex].getName();
            int age = rand.nextInt(30 - 10 + 1) + 10;
            samples[i] = new AnimalInstance(randomIndex, name, age);
        }

        assert btnDistRegions != null : "fx:id=\"btnDistRegions\" was not injected: check your FXML file 'view.fxml'.";
        assert btnQuit != null : "fx:id=\"btnQuit\" was not injected: check your FXML file 'view.fxml'.";
        assert btnShowEndangered != null : "fx:id=\"btnShowEndangered\" was not injected: check your FXML file 'view.fxml'.";
        assert btnShowSorted != null : "fx:id=\"btnShowSorted\" was not injected: check your FXML file 'view.fxml'.";
        assert btnShuffle != null : "fx:id=\"btnShuffle\" was not injected: check your FXML file 'view.fxml'.";
        assert txtResults != null : "fx:id=\"txtResults\" was not injected: check your FXML file 'view.fxml'.";
    }

}
