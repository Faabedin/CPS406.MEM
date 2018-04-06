import java.io.*;
import java.util.*;

public static void main(String argz[]) { //Code here is temporary and will me moved where applicable
	static Map<String, String> loginList; //CLASS VARIABLE!! MOVE WHERE APPLICABLE
        
	Scanner input = new Scanner(System.in); //remove when reading from button
        System.out.print("Username? "); //remove when reading from button
        String username = input.next(); //textField.getText() ot whatever
        System.out.print("Password? "); //remove when reading from button
        String password = input.next(); //textField.getText() or whatever
        boolean correctLogin = false;
        int attempts = 3;

        (!loginList.containsKey(username)) {
            System.out.println("Incorrect login. ");
            attempts--;
            while (attempts !=0) {
                System.out.print("Username? "); //remove ehrn
                username = input.next();
                System.out.print("Password? ");
                password = input.next();
                if (loginList.containsKey(username)) break;
                System.out.println("Incorrect login. ");
                attempts--;
            }
        }

        if (loginList.get(username).equals(password)) correctLogin = true;
        
	while (!loginList.get(username).equals(password) && !correctLogin && attempts != 0) {
            System.out.println("Incorrect Password.");
            attempts--;
            System.out.print("Password? ");
            password = input.next();
            if (loginList.get(username).equals(password)) correctLogin = true;
        }
	
        if (attempts == 0) {
            System.out.println("You have been locked out. The program will now exit.");
            System.exit(0);
        }
	
        if (correctLogin) {
            //Proceed action goes here
        }
    }

class Login {
	private Map<String,String> loginMap;

	Login() {
		loginMap = new TreeMap<>();
		try {
		    readLoginFile();
		} catch (Exception e) {
		    System.out.println("There was a problem reading the file. The login list has not been created.");
		}
	}

    private void readLoginFile() throws IOException {

        Scanner fileScanner = new Scanner(new File("loginPass.txt"));

        while (fileScanner.hasNext()) {
            try {
                loginMap.put(fileScanner.next(), fileScanner.next());
            } catch (Exception ex) {
		    
            }
        }
        fileScanner.close();
    }

    public Map<String, String> getLoginMap() {
        return loginMap;
    }
}
