import java.util.*;

public class HelloGoodbye {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String firstName = sc.next();
        String secondName = sc.next();
        System.out.print("Hello "+firstName+" and "+secondName +"." + "\r\n"
                +"GoodBye "+secondName +" and "+firstName +".");
    }
}
