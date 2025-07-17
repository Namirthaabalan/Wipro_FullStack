import java.util.*;
class if_state1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n =  sc.nextInt();
        if(n>0){
            System.out.println("Postive");
        }
        else if(n==0){
            System.out.println("Zero");
        }
        else{
            System.out.println("negative");
        }
    }
}