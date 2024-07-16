package linkedList;

public class Palindrome {
    
}
// class Solution {
//     public boolean isPalindrome(ListNode head) {
//         if(head.next == null) return true;
//         ListNode fast = head;
//         ListNode slow = head;
//         while(fast != null && fast.next != null){
//             fast = fast.next.next;
//             slow = slow.next;
//         }
//         ListNode prev = null;
//         ListNode next_n = slow.next;
//         while(slow != null){
//             slow.next = prev;
//             prev = slow;
//             slow = next_n;
//             next_n = next_n==null?null:next_n.next;
//         }
//         while(prev!=null){
//             if(prev.val == head.val){
//                 prev = prev.next;
//                 head = head.next;
//             }else
//                 return false;
//         }
//         return true;
//     }
// }