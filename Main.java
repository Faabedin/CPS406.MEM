
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.File;

public class Main extends Application throws IOException {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("Member.fxml"));
        primaryStage.setTitle("Member Management System");
        primaryStage.setScene(new Scene(root, 600, 400));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
        saveFile();
    }
    
    public static void saveFile() /*throws IOException */ {
        FileWriter fw = new FileWriter(new File("saveLessons.txt"));
        PrintWriter pw = new PrintWriter(fw);
        //Iterator iterator = loginList.entrySet().iterator();
        //Map.Entry entry;
        while (iterator.hasNext()) {
            for (int i = 0; i < loginList.size(); i++) {
                //entry = (Map.Entry) iterator.next();
                //pw.println(entry.getKey() + " " + entry.getValue());
                pw.println("Lesson");
            }
        }
        pw.close();
    }
}
