
public class MergeTwoSortedLists {

	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
	      
	      if(l1 == null) return l2;
	      if(l2 == null) return l1;
	      
	      
	     ListNode first = new ListNode(0);
	      ListNode firstHead = first;
	      
	      while(l1 != null && l2 != null){
	        if(l1.val <= l2.val ){
	          firstHead.next = l1;
	          l1= l1.next;
	          
	        } else {
	          firstHead.next = l2;
	          l2= l2.next;
	          
	        }
	        firstHead = firstHead.next;
	        
	        
	      }
	      
	      firstHead.next = l1 == null ? l2 : l1;
	      
	      return first.next;
}
