package arraylist;

public class AlphanumericSum {
    public static void main(String[] args) {
    	
        String inputString = "abc123xyz456";

        int alphanumericSum = alphaNumeric(inputString);
        

//        System.out.println("Input String: " + inputString);
//        System.out.println("Alphanumeric Sum: " + alphanumericSum);
    }

    public static int alphaNumeric(String input) {
    	
        int sum = 0;

        String x="";
        
     for(int i=0; i<input.length(); i++) {
    	 
    	 if(Character.isDigit(input.charAt(i))) {
    		 
    		 x+=input.charAt(i);
    		 
    	 }
     }
	 
	 int num=Integer.parseInt(x);
	 
	 while (num != 0) {
         int digit = num % 10; 
         sum += digit; 
         num /= 10; 
     }
	 
	 
	 System.out.println(sum);
	
        return sum;
    }
}

