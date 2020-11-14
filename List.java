import java.util.*;
public class List
{
    public static void main(String args[])
    {
        LinkedList<String> ll = new LinkedList<String>();
        System.out.println("A new Linked List has been created.");

        ll.add("AK-47");
        ll.add("RPK");
        ll.add("AK-12");
        ll.add("AKM");
        ll.add("Groza");

        System.out.println("Below are listed several Russian weapons");
        System.out.println("Elements from LinkedList: " + ll);
        System.out.println("I will now demonstrate operations of a linked list:");
        System.out.println("Deleteing 1 element..");
        ll.remove(3);
        System.out.println("Deleted");
        System.out.println("New LinkedList: " + ll);
        System.out.println("Retreiving size...");
        System.out.println(ll.size());
        System.out.println("Retrieving first and last elements...");
        System.out.println(ll.getFirst() + ", " + ll.getLast());
    }
}