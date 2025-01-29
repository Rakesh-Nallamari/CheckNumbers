
import java.util.Scanner;

public class CheckNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number = ");
        int num = sc.nextInt();
        if(num>0){
            System.out.println("Gven Number Is Positive.");
        }else if (num<0) {
            System.out.println("Given number Is negative ");

        }  
        
        else{
            System.out.println("number is zero");
        }
        
        sc.close();

    }
    
}
