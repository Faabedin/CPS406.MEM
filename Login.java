import java.util.*;

public static void main(String argz[]) {
        Map<String, String> loginList = new Login().getLoginMap();
        Scanner input = new Scanner(System.in); //remove when reading from button
        System.out.print("Username? "); //remove when reading from button
        String username = input.next(); //textField.getText() or whatever
        System.out.print("Password? "); //remove when reading from button
        String password = input.next(); //textField.getText() or whatever

        Iterator iterator = loginList.entrySet().iterator();
        if (loginList.containsKey(username)) {
            Map.Entry entry;
            while (iterator.hasNext()) {
                for (int i = 0; i < loginList.size(); i++) {
                    entry = (Map.Entry) iterator.next();
                    if (entry.getKey().equals(username) && entry.getValue().equals(password)) {
                        System.out.println("Correct login."); //change to whatever
                    } else {
                        System.out.println("Incorrect login."); //change to whatever
                    }
                }
            }
        }
    }

class Login{
	/*
	int loginNumber;
	String Password;
	
	public Login(){};
	public Login(int loginNumber,String Password ){
	if (loginNumber == 500){
	
	}
	
	}*/
	
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

        Scanner fileScanner = new Scanner(new File("loginPass.txt");

        while (fileScanner.hasNext()) {
            try {
                loginMap.put(fileScanner.next(), fileScanner.next());
            } catch (Exception ex) {
                System.out.println("There was a problem reading the file. The login list has not been created.");
                loginMap = new TreeMap<>();
                break;
            }
        }
        fileScanner.close();
    }

    public Map<String, String> getLoginMap() {
        return loginMap;
    }
}
