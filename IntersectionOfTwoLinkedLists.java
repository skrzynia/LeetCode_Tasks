import java.util.HashSet;
import java.util.Set;



public class IntersectionOfTwoLinkedLists {
	
	private class ListNode{
		int key;
		ListNode next;
		
		ListNode(int key){
			this.key = key;
			next= null;
		}
	}
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
	      
	      Set<ListNode> set = new HashSet<>();
	      
	      while(headA != null) {
	        set.add(headA);
	        headA = headA.next;
	      }
	      
	      while(headB != null) {
	        
	        if(set.contains(headB)){
	          return headB;
	        }
	        headB = headB.next;
	        
	      }
	      return null;
	      
	      
	    }
}
