package computer;

import java.util.Arrays;

public class Computer {
    private String type;
    private double procSpeed;
    private String[] files;

    public Computer() {
        this("Unknown", 0.0, new String[0]);
    }

    public Computer(String type, double procSpeed, String[] files) {
        setType(type);
        setProcSpeed(procSpeed);
        setFiles(files);
    }

    public Computer(Computer other) {
        this(other.type, other.procSpeed, other.files);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        if (type != null && !type.trim().isEmpty()) {
            this.type = type;
        } else {
            this.type = "Generic Brand";
        }
    }

    public double getProcSpeed() {
        return procSpeed;
    }

    public void setProcSpeed(double procSpeed) {
        if (procSpeed >= 0) {
            this.procSpeed = procSpeed;
        } else {
            this.procSpeed = 0;
        }
    }

    public String[] getFiles() {
        return files != null ? files.clone() : new String[0];
    }

    public void setFiles(String[] files) {
        if (files != null) {
            this.files = files.clone();
        } else {
            this.files = new String[0];
        }
    }

    @Override
    public String toString() {
        return String.format(
                "Manufacturer: %s\n" +
                        "Processor Speed: %.2f MHz\n" +
                        "Files: %s",
                type, procSpeed, Arrays.toString(files)
        );
    }
}