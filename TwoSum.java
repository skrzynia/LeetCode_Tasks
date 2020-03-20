import java.util.HashMap;
import java.util.Map;

public class TwoSum {
	public int[] twoSum(int[] nums, int target) {
	    
	      if(nums.length <= 1)
	        return null;
	      
	      Map<Integer,Integer> map = new HashMap<>();
	      int i = 0;
	      
	      while(i < nums.length) {
	    	  
	        if(map.containsKey(nums[i]))
	          return new int[]{map.get(nums[i]),i};
	        
	    	  
	        map.put(target-nums[i],i);
	        i++;
	      }
	      
	      return null;  
	    }
}
