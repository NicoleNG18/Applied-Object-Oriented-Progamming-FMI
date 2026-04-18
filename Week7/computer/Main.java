package computer;

public class Main {
     static void main() {
        Computer comp1 = new Computer();
        System.out.println("--- Computer 1 (Default) ---\n" + comp1);

        String[] initialFiles = {"system.dll", "config.sys"};
        Computer comp2 = new Computer("Dell", 3200.5, initialFiles);
        System.out.println("\n--- Computer 2 (Main Constructor) ---\n" + comp2);

        Computer comp3 = new Computer(comp2);
        System.out.println("\n--- Computer 3 (Copy of 2) ---\n" + comp3);

        System.out.println("\n--- Updating Computer 1 ---");
        comp1.setType("HP");
        comp1.setProcSpeed(2800.0);
        comp1.setFiles(new String[]{"work.docx", "photo.jpg"});

        System.out.println(comp1);

        comp1.setProcSpeed(-500); // Трябва да се занули от логиката в сетъра
        System.out.println("\nAfter invalid speed update:\n" + comp1.getProcSpeed() + " MHz");
    }
}
