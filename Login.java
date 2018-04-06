import java.util.*;

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
