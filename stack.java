
import java.util.Stack;


public class stack {
    
    
    public static void main(String[] args){
       
        Stack<String> cars = new Stack<>();
        
        cars.push("Ferrari");
        cars.push("Lamborghini");
        cars.push("Supra");
        cars.push("KenWood");
        System.out.println(cars);
        cars.pop();
        System.out.println("My Car is a: "+cars.peek());
        System.out.println("Yes it is a: "+cars.peek());
        
    }
}
