public class LinkedList {
    
   
        static Node head; 
       
        static class Node { 
       
            int data; 
            Node next; 
       
            Node(int d) 
            { 
                data = d; 
                next = null; 
            } 
        } 
       
       
        int detectAndRemoveLoop(Node node) 
        { 
            Node slow = node, fast = node; 
            while (slow != null && fast != null && fast.next != null) { 
                slow = slow.next; 
                fast = fast.next.next; 
       
               
                if (slow == fast) { 
                    Removeloop(slow, node); 
                    return 1; 
                } 
            } 
            return 0; 
        } 
       
       
        void   Removeloop(Node loop, Node head) 
        { 
            Node ptr1 = loop; 
            Node ptr2 = loop; 
       
          
            int k = 1, i; 
            while (ptr1.next != ptr2) { 
                ptr1 = ptr1.next; 
                k++; 
            } 
       
           
            ptr1 = head; 
       
          
            ptr2 = head; 
            for (i = 0; i < k; i++) { 
                ptr2 = ptr2.next; 
            } 
       
            while (ptr2 != ptr1) { 
                ptr1 = ptr1.next; 
                ptr2 = ptr2.next; 
            } 
       
            while (ptr2.next != ptr1) { 
                ptr2 = ptr2.next; 
            } 
       
            
            ptr2.next = null; 
        } 
       
        
        void printList(Node node) 
        { 
            while (node != null) { 
                System.out.print(node.data + " "); 
                node = node.next; 
            } 
        }
        
        public static void main(String[] args) {
            LinkedList list = new LinkedList();
            list.head= new Node(1);
            list.head.next= new Node(2);
            list.head.next.next= new Node(3);
            list.head.next.next.next= new Node(4);
            list.head.next.next.next.next= new Node(5);
            list.head.next.next.next.next.next= new Node(6);
            list.head.next.next.next.next.next.next= new Node(3);
            
           head.next.next.next.next.next.next = head.next.next;
           list.detectAndRemoveLoop(head);
           System.out.println("list after removing loop : ");
           list.printList(head);
        
        
    }
    }
    

