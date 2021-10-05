import java.io.BufferedWriter;

public class StringReplace {
	public static void main(String[] args) {
		try {
			BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName "output"));
					bufferedWriter.write(str: "Avinash\n");
			        bufferedWriter.write(str: "Atul\n");
			        bufferedWriter.write(str: "Sairam\n");
			        bufferedWriter.write(str: "Tushal\n");
			        
			        BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName: "output"));
			        		String name;
			        while ( name = bufferedReader.readLine()) != null) {
			        	System.out.println(name);
			        	if(name.equals("Sairam")) {
			        	bufferedWriter.write(str "Monika");
			        	}
			        	}
	}

}
