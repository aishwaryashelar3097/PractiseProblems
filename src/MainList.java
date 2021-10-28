import java.util.LinkedList;
import java.util.ListIterator;
 
 class MainList {
    public static void main(String args[]) {
 
      /* Linked List Declaration */
     LinkedList<String> l_list = new LinkedList<String>();
      /*add(String Item) is used for adding 
       * the Items to the linked list*/
      l_list.add("1");
      l_list.add("2");
      l_list.add("3");
      l_list.add("4");
      System.out.println("Linked List Content: " +l_list);
       
      /* Delete from a position*/
      l_list.remove(1);
      l_list.remove(2);
      System.out.println("LinkedList after deletion of Item in 2nd and 3rd position " +l_list);
 
      /*Remove first and last Item*/
      l_list.removeFirst();
      l_list.removeLast();
      System.out.println("Final Content after removing first and last Item: "+l_list);
       
      /*Iterating the linked list*/
      ListIterator<String> itrator = l_list.listIterator();
      System.out.println("List displayed using iterator:");
      while (itrator.hasNext()) {
          System.out.println(itrator.next());
      /*print the linkedlist*/
          System.out.print();
          
          
          class Node {
       
              int data;
              Node next;
       
              Node(int d)
              {
                  data = d;
                  next = null;
              
          }
       
          /* Function to reverse the linked list */
          Node reverse(Node node)
          {
              Node prev = null;
              Node current = node;
              Node next = null;
              while (current != null) {
                  next = current.next;
                  current.next = prev;
                  prev = current;
                  current = next;
              }
              node = prev;
              return node;
          }
          }
      }
    }
 }
          

 
 
    

