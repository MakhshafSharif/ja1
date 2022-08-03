package abreviate;

public class nonrepeat {
	 public static void main(String args[]) {
	     
	        String inputStr ="geeksforgeeks";

	        for(char i :inputStr.toCharArray()){
	        if ( inputStr.indexOf(i) == inputStr.lastIndexOf(i)) {
	            System.out.println("First non-repeating character is: "+i);
	            break;
	        }
	        }
	    }
}
