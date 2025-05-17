import java.util.*;

public class Conditional_Statments {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        // if(age>18 && age < 100){
        //     System.out.println("Adult");
        // }else if (age < 18 ){
        //     System.out.println("Minor");
        // }else{
        //     System.err.println("Enter valid Age");
        // }

        // if(age % 2 == 0){
        //     System.out.println("Even");
        // }else{
        //     System.out.println("Odd");
        // }


        //==============Switch case
        switch(age){
            case 1:System.out.println("age");
           
            case 2: System.out.println("2 is given");
            
        }
    }
}
