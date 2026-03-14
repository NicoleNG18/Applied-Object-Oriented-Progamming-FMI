package calendar;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.TextInputDialog;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.time.LocalDate;

public class CalendarApp extends Application {

    @Override
    public void start(Stage stage) {
        Group group = new Group();
        Scene scene = new Scene(group, 450, 350);

        int year = getIntInput("Enter year: ", "2026");
        int month = getIntInput("Enter month (1-12):", "3");

        double startX = 50;
        double startY = 50;
        double stepX = 55;

        group.getChildren().add(new Text(startX + 0 * stepX, startY, "MON"));
        group.getChildren().add(new Text(startX + 1 * stepX, startY, "TUE"));
        group.getChildren().add(new Text(startX + 2 * stepX, startY, "WED"));
        group.getChildren().add(new Text(startX + 3 * stepX, startY, "THR"));
        group.getChildren().add(new Text(startX + 4 * stepX, startY, "FRI"));
        group.getChildren().add(new Text(startX + 5 * stepX, startY, "SAT"));
        group.getChildren().add(new Text(startX + 6 * stepX, startY, "SUN"));

        LocalDate firstOfMonth = LocalDate.of(year, month, 1);
        int daysInMonth = firstOfMonth.lengthOfMonth();
        int startDayColumn = firstOfMonth.getDayOfWeek().getValue();

        int currentDay = 1;
        double xPos = startX + (startDayColumn - 1) * stepX;
        double yPos = 90;


        while (currentDay <= daysInMonth) {
            Text dateText = new Text(xPos, yPos, String.valueOf(currentDay));
            group.getChildren().add(dateText);

            currentDay++;
            xPos += stepX;

            if (xPos > startX + 6 * stepX) {
                xPos = startX;
                yPos += 40;
            }
        }

        String monthName = firstOfMonth.getMonth().toString();

        stage.setTitle("Calendar for " + monthName + " " + year);
        stage.sizeToScene();
        stage.resizableProperty().setValue(Boolean.FALSE);
        stage.setScene(scene);
        stage.show();
    }

    private int getIntInput(String prompt, String defaultValue) {
        TextInputDialog tid = new TextInputDialog(defaultValue);
        tid.setHeaderText(null);
        tid.setTitle("Calendar App");
        tid.setContentText(prompt);
        return Integer.parseInt(tid.showAndWait().orElse(defaultValue));
    }

    static void main() {
        launch();
    }
}

