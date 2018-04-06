import java.io.*;
import java.util.*;

class ReadLessonFile {
  
	static List<Coach> coachList; //not the best place for it...
  
	public static void mian(String[] argz) throws IOException{
		readLessionFile();
	}
  
  private static void readLessonFile() throws IOException {
        File fileScanner = new Scanner(new File("lessons.txt"));

        while (fileScanner.hasNextLine()) {
            try {
                int numberCoaches = fileScanner.nextInt();

                for (int i = 0; i < numberCoaches; i++) {

                    int numberLessons = fileScanner.nextInt();

                    fileScanner.nextLine(); // to remove the newline character
                    Coach tempCoach = new Coach(fileScanner.nextLine());

                    for (int j = 0; j < numberLessons; j++) {
                        System.out.println("j: " + j);
                        String name = fileScanner.nextLine();
                        int month = fileScanner.nextInt();
                        int date = fileScanner.nextInt();
                        int year = fileScanner.nextInt();
                        fileScanner.nextLine(); //to remove the newline character
                        String message = fileScanner.nextLine();
                        tempCoach.scheduleLesson(name, month, date, year, message);
                    }
                    coachList.add(tempCoach);
                }
            } catch (Exception ex) {

            }
        }
        fileScanner.close();
    }
}
