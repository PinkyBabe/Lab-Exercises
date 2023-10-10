
import java.util.LinkedList;


public class linkedlist {
    
    public static void main(String[] args) {
        LinkedList<Double> grades = new LinkedList<>();
        
        grades.add(1.25);
        grades.addFirst(1.75);
        grades.addLast(3.0);
        grades.add(1,3.50);
        System.out.println("Linkedlist: "+grades);
         
//        grades.remove(1.25);
//        grades.remove(2);
//        grades.removeFirst();
//        grades.removeLast();
        System.out.println("Linkedlist: "+grades);
        
        if(grades.contains(1.25)){
        
            grades.add(1.0);
            System.out.println("Linkedlist: "+grades);
        }
        
        boolean con = grades.contains(1.25);
        System.out.println(con);
    }
}
