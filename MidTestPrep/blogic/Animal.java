package blogic;

public class Animal {
    public static final String[] REGIONS = {"Africa", "Asia", "Australia", "Europe", "America"};

    private String name;
    private AnimalType animalType;
    private boolean predator;
    private String region;
    private boolean endangered;

    public Animal(String name, AnimalType animalType, boolean predator, String region, boolean endangered) {
        this.name = name;
        this.animalType = animalType;
        this.predator = predator;
        setRegion(region);
        this.endangered = endangered;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AnimalType getAnimalType() {
        return animalType;
    }

    public void setAnimalType(AnimalType animalType) {
        this.animalType = animalType;
    }

    public boolean isPredator() {
        return predator;
    }

    public void setPredator(boolean predator) {
        this.predator = predator;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        if (region == null) {
            this.region = "Unknown";
            return;
        }

        switch (region) {
            case "Africa":
            case "Asia":
            case "Australia":
            case "Europe":
            case "America":
                this.region = region;
                break;
            default:
                this.region = "Unknown";
                break;
        }
    }

    public boolean isEndangered() {
        return endangered;
    }

    public void setEndangered(boolean endangered) {
        this.endangered = endangered;
    }

    @Override
    public String toString() {
        return String.format("Животно{ %s, тип= %s, хищник= %s, район= %s, застрашен= %s}",
                name,
                animalType.getTypeName(),
                predator ? "Да" : "Не",
                region,
                endangered ? "Да" : "Не");
    }
}