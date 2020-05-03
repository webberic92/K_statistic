import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class JPMorganChase {

	public static void main(String[] args) {
		   
	    InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);

	    //Example if K value is 3 and array set is "2 5 9 7" the k stat will be 7.
	    
        System.out.println("Please enter a K value.."); 
	      Scanner k_scan = new Scanner(System.in); 
	        int K = k_scan.nextInt(); 
	        System.out.println("You entered K value integer of .. "+K); 
	        
	        
	        System.out.println("Please enter  Array values.."); 
		      Scanner a_scan = new Scanner(System.in); 
		        String ArrayString = a_scan.nextLine();
 
		        System.out.println("You entered array values  "+ArrayString); 
		        
		        System.out.println("Time to turn string into array.."); 
		        
		        //splits the  " "  spaces in the array.
				String[] stringToArray = ArrayString.split(" ");
				//convert to array to array list.
		        List<String> ArrayList = Arrays.asList(stringToArray);
		        
		        	for (String a : stringToArray) {
		            System.out.println(a);
		        
				}
				System.out.println("String is now array lets put numbers in order!");
	        	Collections.sort(ArrayList);
	        	ArrayList.forEach(System.out ::println);
	        	
				System.out.println("The K statistic is...");

				
				// print the K value indicie.
			System.out.println(ArrayList.get(K-1));

	    }
}