class ListNode {
    int val;  // data
    ListNode next;  // pointer
    ListNode() {}  //constructors
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

 
class Solution {
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if( head.next==null) return head;
        
        ListNode node1=head;
        ListNode node2=head.next;
         
        while( node2!= null){
            int gcdValue=calculateGCD(node1.val, node2.val);
            ListNode gcdNode=new ListNode(gcdValue);
            node1.next=gcdNode;
            gcdNode.next=node2;
            
            node1=node2;
            node2=node2.next;
        }
        return head;
    }
    private int calculateGCD(int a, int b){
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        int[] c={a};
        return c;
    }
}
public class Leetcode_2807{
    public static void main(String args[]){
        int[] arr={1,2,3,4};
        ListNode head=new ListNode(arr);
        int b=insertGreatestCommonDivisors(head);
        System.out.println(b);
    }
}