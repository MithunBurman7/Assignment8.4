package Demo;
/**
 * 
 *  In this program I've written a code in Java to take input from command line and 
 * convert the input into Integer value and print the value.
 *
 */
public class AssgDemo {//Creating a class sum
	
	//main method of this class

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// taking the integer value
        int y = 10;
      //this for  loop will run till the number of times specified in command line
        for (int i = 0; i < args.length; i++) {
        	//Applying parseInt method this will  convert the argument into the String
            y = y + Integer.parseInt(args[i]);
        }
        System.out.println("The sum of the arguments passed is " + y);
    
	}

}
