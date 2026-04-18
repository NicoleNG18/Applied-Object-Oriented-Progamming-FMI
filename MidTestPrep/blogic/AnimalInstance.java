package blogic;

//4. Добавете към AnimalInstance константа INSTANCE_ID от тип String към клас
//AnimalInstance, която идентифицира представителя на животинския вид като текст с
//        префикс animalName, следвано от уникално (неповтарящо се във останалите обекти на клас
//        AnimalInstance)
//3- цифрено цяло число, където незначещите цифри са заменени с нули. Такава константа е
//например текстът от вида “Пъстърва 014”
//Добавете също get метод за INSTANCE_ID и предефинирайте метода toString(), наследен
//от клас Object, така че да връща форматиран стринг, образуван от константата INSTANCE_ID
//и данната animalAge в следния вид:
//Пъстърва 014, Възраст: 1

public class AnimalInstance {
    private int animalKey;
    private String animalName;
    private int animalAge;

    private static int counter = 1;
    public final String INSTANCE_ID;

    public AnimalInstance(int animalKey, String animalName, int animalAge) {
        this.animalKey = animalKey;
        this.animalName = animalName;
        this.animalAge = animalAge;
        this.INSTANCE_ID = String.format("%s %03d", animalName, counter++);
    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public int getAnimalKey() {
        return animalKey;
    }

    public void setAnimalKey(int animalKey) {
        this.animalKey = animalKey;
    }

    public int getAnimalAge() {
        return animalAge;
    }

    public void setAnimalAge(int animalAge) {
        if (animalAge >= 0) {
            this.animalAge = animalAge;
        } else {
            this.animalAge = 0;
        }
    }

    public String getINSTANCE_ID() {
        return INSTANCE_ID;
    }

    @Override
    public String toString() {
        return String.format("%s, Възраст: %d", INSTANCE_ID, animalAge);
    }
}
