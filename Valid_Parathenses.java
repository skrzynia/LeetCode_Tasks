import java.util.Stack;

public class Valid_Parathenses {
	static boolean isValid(String s) {
	     
	      if(s == "")
	        return true;
	      
	      
	      Stack<Character> stack = new Stack<>();
	      int numberOfDigits = s.length();
	      
	      
	      for(int i = 0; i < numberOfDigits; i++){
	        if(s.charAt(i) == '[' || s.charAt(i) == '(' || s.charAt(i) == '{' ) {
	        	stack.push(s.charAt(i));
	        	continue;
	        }
	          
	        else if(stack.isEmpty()) 
		            return false;   
	        
	        if(s.charAt(i) == ']' && stack.peek() != '[' || s.charAt(i) == '}' && stack.peek() != '{' ||
	          s.charAt(i) == ')' && stack.peek() != '(') 
	          return false;
	          
	        stack.pop();
	      
	        
	      }
	      
	      return stack.isEmpty();
	   
	    }

}
