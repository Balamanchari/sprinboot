package exceptions;

public class CustomException {
  
	    public static void validate(int age) throws Exception {  
	        if(age<18) {  
	 
	            throw new Exception("Person is not eligible to vote");    
	        }  
	        else {  
	            System.out.println("Person is eligible to vote!!");  
	        }  
	    }  
	  
	    public static void main(String args[]) throws Exception{  
	      
	        validate(13);  
	        System.out.println("rest of the code...");    
	  }    
	}    

